package exam2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddAvg {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(23, 32, 12, 45, 3, 2, 4, 7));
    System.out.println(oddAverage(list));
  }

  public static double oddAverage(List<Integer> list) {
    int counter = 0;
    double sum = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) % 2 != 0) {
        sum += list.get(i);
        counter++;
      }
    }
    double result = sum / counter;
    return result;
  }
}
