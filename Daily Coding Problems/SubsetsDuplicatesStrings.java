public class SubsetsDuplicatesStrings{

  private static void subsets(String s, String sub){


      if(s.length() == 0){
        System.out.println("Base Case: " + sub);
        return;
      }

      // Inclusive Case
      String added = sub + s.charAt(0);

      String rem = s.substring(1);

      subsets(rem, added);

      // Exclusive Case
      if(sub.length() == 0 || sub.charAt(sub.length()-1) != s.charAt(0)){
        subsets(rem, sub);
      }

  }


  private static void subsetMain(String s){
      subsets(s,"");
  }

  public static void main(String args[]){
    String a = "pp";
    String b = "app";
    subsetMain(b);
  }
}
