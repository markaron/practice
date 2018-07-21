package codefights;

import java.util.Arrays;

public class AddBorder {
  public static void main(String[] args){
    String[] strArray = new String[]{"Foo","Bar","Baz"};
    System.out.println(Arrays.toString(addBorder(strArray)));
  }

  public static String[] addBorder(String[] picture) {
    int size = picture.length;
    String output[] = new String[size+2];
    String temp = "*";
    for(int j = 0; j < size+1; j++){
      temp = temp + "*";
    }

    output[0] = temp;
    output[size+1] = temp;
    int k = 0;
    for(int i = 1; i < size+1; i++) {
      output[i] = "*" + picture[k] + "*";
      k++;
    }
    return output;
    }
}
