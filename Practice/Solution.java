public class Solution{

  private static String reverseWords(String s){

     s = s.trim();

     if(s.length() == 0 || s==null){
       return s;
     }

     String[] splitted = s.split("\\s+");



     StringBuffer str = new StringBuffer("");

     for(int i=splitted.length-1;i>=0;i--){
       str.append(splitted[i]);
       str.append(" ");
     }

     return str.toString().trim();
  }


  public static void main(String args[]){

      String s = " a   b  ";

      String rev = reverseWords(s);

      System.out.println("Reversed string is: "+rev);

  }

}
