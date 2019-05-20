import java.util.*;

class NoRepeatSubstring {
  public static int findLength(String str) {
    int n = str.length();
    if(n == 0){
      return 0;
    }
    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    int start_i = 0;
    int end_i = 0;
    int max_len = 1;
    int sofar_max_len = 1;

    for(int i=0; i<n; i++){
      if(map.containsKey(str.charAt(i)) ){
        start_i = map.get(str.charAt(i)) +1;
        map.put(str.charAt(i), i);
        end_i = i;
        sofar_max_len = end_i - start_i + 1;
      }else{
        map.put(str.charAt(i), i);
        end_i = i;
        sofar_max_len += 1;
      }

      max_len = sofar_max_len > max_len ? sofar_max_len : max_len;
    }
    return max_len;
  }

  public static void main(String[] args) {
    System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("aabccbb"));
    System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abbbb"));
    System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abccde"));
  }
}
