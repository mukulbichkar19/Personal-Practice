public class PermutationStrings{


  private static boolean usingSorting(String s, String t){

    if(s.length() != t.length()){
      return false;
    }

    char[] sCharArray = s.toCharArray();
    char[] tCharArray = t.toCharArray();

    java.util.Arrays.sort(sCharArray);
    java.util.Arrays.sort(tCharArray);

    for(int i=0;i<s.length();i++){
      if(sCharArray[i] != tCharArray[i]){
        return false;
      }
    }

    return true;
  }


  private static boolean usingXOR(String s, String t){

    if(s.length() != t.length()){
      return false;
    }

    int result = 0;
    for(int i=0;i<s.length();i++){
      result ^= s.charAt(i);
    }

    for(int j=0;j<t.length();j++){
      result ^= t.charAt(j);
    }

    if(result == 0){
      return true;
    }

    return false;

  }








  public static void main(String args[]){

      String s = "god";
      String t = "dog";

      // Method 1: Using Sorting of two strings and then checking
      // Time Complexity: O(n*logn)
      // Space: O(n)
      if(usingSorting(s,t)){
        System.out.println("Sorting Method: It's a permutation");
      }else{
        System.out.println("Sorting method: Not a permutation");
      }


      // Method 2: Using XOR
      // Time Complexity: O(n)
      // Space: O(1)
      if(usingXOR(s,t)){
        System.out.println("XOR Method: It's a permutation");
      }else{
        System.out.println("XOR Method: Not a permutation");
      }





  }


}
