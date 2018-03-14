package practicetest;

import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Which number would you like to multiply?");
    int inputNum = scanner.nextInt();

    for (int i = 1; i < 11; i++) {
      System.out.println(i + " * " + inputNum + " = " + (i * inputNum));
    }
  }
}
