public class PermutationsStringWithDuplicates{



  private static void permutations(String s, String rem){

      if(rem.length() == 0){
        System.out.println(s);
        return;
      }

      for(int i=0;i<rem.length();i++){

          if(i == 0 || rem.charAt(i) != rem.charAt(i-1)){
            String new_build = s + rem.charAt(i);
            String new_rem = rem.substring(0,i) + rem.substring(i+1);
            permutations(new_build, new_rem);
          }

      }
  }



  private static void permutationsMain(String s){
      permutations("", s);
  }

  public static void main(String args[]){

    String s = "aa";
    String t = "app";
    String p = "appl";
    permutationsMain(t);


  }



}
