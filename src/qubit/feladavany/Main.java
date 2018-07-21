package qubit.feladavany;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String args[]) throws IOException {
    counter();

    /*List myList = convertToList(5234, 1169);
    System.out.println(checkIfContains0(myList));
    System.out.println(checkIfUnique(myList));
    System.out.println(myList.size());
    System.out.println(myList);*/

  }

  public static void counter() throws IOException {
    Path filePath = Paths.get("qubit1.txt");
    String output = "";
    List<String> listToFile = new ArrayList<>();
    NumberFormat formatter = new DecimalFormat("#0.0000");

    for (double num2 = 1111.0; num2 < 10000; num2++) {
      for (double num1 = 1111.0; num1 < 10000; num1++) {

        List list = convertToList(num1, num2);

        if(num2 > num1) {
          continue;
        } else if (checkIfContains0(list)) {
          //System.out.println("valahol nulla van " + num1 + " / " + num2);
          //output = "valahol nulla van " + num1 + " / " + num2;
          continue;
        } else if (checkIfUnique(list)){
          double result = num1 / num2;
          output = num1 + " / " + num2 + " = " + formatter.format(result) + checkIfOneCharUniqe(result, list);
          listToFile.add(output);
          //System.out.println(num1 + " / " + num2 + " = " + result + checkIfOneCharUniqe(result, list));
        }
      }
    }
    Files.write(filePath, listToFile);
  }

  public static boolean checkIfContains0(List list){
    for (int i = 0; i < list.size(); i++) {
      if(list.contains(0)){
        return true;
      }
    }
    return false;
  }

  public static boolean checkIfUnique(List list){
    for (int i = 0; i < list.size()-1; i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if(list.get(i) == list.get(j)){
          return false;
        }
      }
    }
    return true;
  }

  public static List<Integer> convertToList(double input1, double input2){
    List<Integer> list= new ArrayList<>();
    int k = (int)input1;
    int m = (int)input2;

    for(int i = 0; i < 4; i ++){
      list.add(k % 10);
      k = k /10;
    }
    for(int i = 0; i < 4; i ++){
      list.add(m % 10);
      m = m /10;
    }
    return list;
  }

  public static String checkIfOneCharUniqe(double i, List list) {
    String output = "";

    if (i >= 2 && i <= 9) {
      if ((i % 1) == 0) {
        if(list.contains(i)){
          output = "  ############## jó eredmény ############## ";
        }
      } else {
        output = " maradékos ";
      }
    } else {
      output = " az eredmény nem egyjegyű ";
    }
    return output;
  }
}

