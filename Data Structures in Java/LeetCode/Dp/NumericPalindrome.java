public class NumericPalindrome{

  private static boolean is_numeric_palindrome(long number) {

    long reversed_number = reverse(number);
    System.out.println("reversed number: "+reversed_number);
    if(number-reversed_number == 0){
      return true;
    }
    return false;

  }

  private static long reverse(long n){
    long rem = 0;
    while(n != 0){
      rem = (rem*10) + (n%10);
      n = n/10;
    }
    return rem;
  }


  public static void main(String args[]) {
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the number: ");
    long num = scan.nextLong();
    if(is_numeric_palindrome(num)){
      System.out.println("Yes a palindrome");
    }else{
      System.out.println("Not a palindrome");
    }
  }

}
