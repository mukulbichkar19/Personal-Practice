public class palindrome{

  public static void main(String args[]){
    // Ways to find a palindrome
    // Palindrome is a string that is same even after reversal

    // Method 1: using string reverse and comparison in java
    String s = "kayak";
    String reversed = new StringBuilder(s).reverse().toString();
    if(s.equals(reversed)){
      System.out.println("palindrome by reverse");
    }else{
      System.out.println("not a palindrome by reverse");
    }

    // Method 2: Using two pointer one at start and one at end
    boolean isPal = false;
    for(int i=0,j=s.length()-1; j>i ; i++,j--){
      if(s.charAt(i) != s.charAt(j)){
        isPal = false;
        break;
      }else{
        isPal = true;
      }
    }
    if(isPal){
      System.out.println("palindrome by two pointers");
    }else{
      System.out.println("not a palindrome by two pointers");
    }

    // Method 3: Using xor value
    int x = 0;
    for(int i=0;i<s.length();i++){
      x = x^s.charAt(i);
    }
    // Check if the palindrome result is equal to the centre element
    if(x == (0^s.charAt(s.length()/2))){
      System.out.println("palindrome by xor");
    }else{
      System.out.println("not a palindrome by xor");
    }








  }
}
