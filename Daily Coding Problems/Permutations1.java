public class Permutations1{

  private static void printPermuteHelp(String s, String rem) {

    if(rem.length() == 0){
      System.out.println(s);
    }else{
      for(int i=0;i<rem.length();i++){
        String next = s + rem.charAt(i);
        String remaining = rem.substring(0,i) + rem.substring(i+1);
        printPermuteHelp(next, remaining);
      }
    }
  }


  private static void printPermutations(String s) {
      printPermuteHelp("", s);
  }


  public static void main(String args[]) {

    String s = "abcd";

    printPermutations(s);



  }


}
