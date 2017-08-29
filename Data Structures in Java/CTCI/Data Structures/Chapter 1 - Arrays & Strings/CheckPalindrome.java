public class CheckPalindrome{

  private static boolean isPalindrome(String s){

    if(s=="" || s.length() == 0){
      return false;
    }

    int xor = 0;
    for(int i=0;i<s.length();i++){
      xor^=s.charAt(i);
    }

    //System.out.println(xor);
    int count = 0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i) == xor){
        count++;
      }
    }
    // If count is 1
    // Or if xor is 0 and length is even
    // Or if xor is not 0 and count of that character is odd
    if(count == 1 && s.length()%2==1){
      return true;
    }else if(xor == 0 && s.length()%2==0){
      return true;
    }else if(xor == 0 && count%2==1){
      return true;
    }


    return false;
  }



  public static void main(String args[]){


      String s1 = "ccvii";
      String s2 = "aabc";
      String s3 = "aab";
      System.out.println(isPalindrome(s3));






  }



}
