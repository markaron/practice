package exam3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MutualElements {

  public static void main(String[] args) {
    List<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 3, 4, 3, 4, 4, 4));
    List<Integer> b = new ArrayList<Integer>(Arrays.asList(3, 2, 4, 4, 5, 6, 7));
    System.out.println(filterMutualElements(a, b));
  }

  public static List<Integer> filterMutualElements(List<Integer> a, List<Integer> b){
    List<Integer> output = new ArrayList<>();
    Collections.sort(a);
    Collections.sort(b);
    for (int i = 0; i <a.size() ; i++) {
      for (int j = 0; j <b.size() ; j++) {
        if(a.get(i) == b.get(j) && !output.contains(a.get(i))){
          output.add(a.get(i));
        }
      }
    }
    return output;
  }
}
