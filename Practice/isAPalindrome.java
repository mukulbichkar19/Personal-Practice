public class isAPalindrome{



  private static boolean isPalindrome(String s){

      boolean isPalindrome = false;
      String input = s.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();
      // Case for empty and string with form " "
      if(input.length() == 0 || input.length()==1){
        isPalindrome = true;
        return isPalindrome;
      }

      char[] convert = input.toCharArray();
      for(int i=0, j=convert.length-1 ; j > i;i++,j--){
         if(convert[i] == convert[j]){
           isPalindrome = true;
         }else{
           isPalindrome = false;
           break;
         }
      }
      return isPalindrome;

  }


  public static void main(String args[]) {

    if(isPalindrome(args[0])){
      System.out.println("It is a palindrome");
    }else{
      System.out.println("Not a palindrome");
    }


  }

}
