package codefights;

public class AllLongestString {
  public static void main(String[] args){
    System.out.println(reverseParentheses("The ((quick (brown) (fox) jumps over the lazy) dog)The ((quick (brown) (fox) jumps over the lazy) dog)" +
      "The ((quick (brown) (fox) jumps over the lazy) dog)The ((quick (brown) (fox) jumps over the lazy) dog)The ((quick (brown) (fox) jumps over the lazy) dog)" +
      "The ((quick (brown) (fox) jumps over the lazy) dog)The ((quick (brown) (fox) jumps over the lazy) dog)The ((quick (brown) (fox) jumps over the lazy) dog)" +
      "The ((quick (brown) (fox) jumps over the lazy) dog)The ((quick (brown) (fox) jumps over the lazy) dog)The ((quick (brown) (fox) jumps over the lazy) dog)"));
  }
  public static String reverseParentheses(String s) {
    char[] in = s.toCharArray();
    for(int i=0; i < s.length(); i++){
      if(in[i] == ')'){
        for(int j=i ; j > 0; j--){
          if(in[j] == '('){
            int start = j+1;
            int end = i-1;
            char temp;
            in[j] = '.';
            in[i] = '.';
            while(end > start){
              temp = in[start];
              in[start]=in[end];
              in[end] = temp;
              end--;
              start++;
            }
            break;
          }
        }
      }
    }
    String result = new String(in);
    for (int p = 0; p < result.length(); p ++){
      if (result.charAt(p) == '.'){
        result = result.replace(String.valueOf(result.charAt(p)),"");
      }
    }
    return result;
  }



}
