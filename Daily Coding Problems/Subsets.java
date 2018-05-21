// For Strings
public class Subsets{

  private static void permutations(String s, String subset, int i) {

    if(i == s.length()){
      System.out.println(subset.equals("") ? "empty" : subset);
      return;
    }
    // Include the current character at index i in the Subset
    String inclusive = subset + s.charAt(i);
    permutations(s, inclusive, i+1);
    // Without including the character at index i
    permutations(s, subset, i+1);
  }

  private static void permutationMain(String s){
    permutations(s, "",0);
  }

  public static void main(String args[]){
      String s = "abc";
      String t = "abcd";
      permutationMain(t);
  }

}
