package codefights;

public class ArrayChange {
  public static void main(String[] args){
    int[] strArray = new int[]{2,1,10,1};
    System.out.println(arrayChange(strArray));
  }
  public static int arrayChange(int[] inputArray) {
    int moves = 0;
    int adder = 0;
    for(int i=1; i < inputArray.length; i++){
      if(inputArray[i] > inputArray[i-1]){
        continue;
      } else {
        adder = (inputArray[i-1]+1)-inputArray[i];
        moves += adder;
        inputArray[i] += adder;
      }
    }
    return moves;
  }
}
