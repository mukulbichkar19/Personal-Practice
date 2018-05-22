public class PermutationsInStrings{


  private static void permutations(String build, String rem){

    if(rem.length() == 0){
      System.out.println(build);
      return;
    }

    for(int i=0;i<rem.length();i++){
        String new_st = build + rem.charAt(i);
        String new_rem = rem.substring(0, i) + rem.substring(i+1);
        permutations(new_st, new_rem);
    }
  }




  private static void permutationsMain(String s){
      permutations("", s);
  }


  public static void main(String args[]) {

      String a = "ab";
      String b = "abc";
      String c = "abcd";

      permutationsMain(c);

  }


}
