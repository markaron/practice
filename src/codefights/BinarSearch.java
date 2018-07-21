package codefights;

import java.util.Arrays;

public class BinarSearch {
  public static void main(String args[]){
    int[] strArray = new int[]{2,1,10,1,342,42,322,0,8,34};
    System.out.println(Arrays.toString(strArray));
    bubbleSort(strArray);
    System.out.println(Arrays.toString(strArray));
    System.out.println(binarSearch(strArray, 322));
  }

  public static boolean binarSearch (int [] array, int x){
    int left = 0;
    int right = array.length -1;

    while (left <= right){
      int mid = left + ((right - left ) / 2);
      if(array[mid] == x){
        return true;
      } else if (x < array[mid]){
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return false;
  }

  public static int[] bubbleSort(int[] array){
    boolean isSorted = false;
    while (!isSorted){
      isSorted = true;
      for (int i = 0; i < array.length -1 ; i++) {
        if(array[i] > array[i+1]){
          swap(array, i , i+1);
          isSorted = false;
        }
      }
    }
    return array;
  }

  public static void swap(int[] array, int i, int j){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
