public class Permutations2 {

  private static void printPermute(String s, int i) {

      if(i == s.length()-1){
        System.out.println(s);
        return;
      }

      for(int j=i;j<s.length();j++){
         s = swap(s, i,j);
         printPermute(s, i+1);
         s = swap(s, i,j);
      }


  }

  private static String swap(String s, int i, int j) {
    StringBuilder sb = new StringBuilder(s);
    sb.setCharAt(i, s.charAt(j));
    sb.setCharAt(j, s.charAt(i));
    return sb.toString();
  }



  private static void printPermuteMain(String s){

      printPermute(s, 0);

  }


  public static void main(String args[]) {

    String s = "abcd";

    printPermuteMain(s);


  }

}
