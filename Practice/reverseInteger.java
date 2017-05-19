public class reverseInteger{


  public static void main(String args[]){
    int x = 101;
    int num = x;
    // Method 1: Avoids int overflow by converting int to long
    long reverse_num = 0;
    while(num != 0){
      reverse_num = reverse_num*10 + num%10;
      num = num/10;
    }
    if(reverse_num > Integer.MAX_VALUE || reverse_num < Integer.MIN_VALUE){
      System.out.println("not a palindrome by method 1");
    }else{
      System.out.println("palindrome by method 1");

    }


    // Method 2: Prevents the overflow by not comparing the last digit
    //           More efficient
    int rev = 0;
    while (x>rev){
    	rev = rev*10 + x%10;
    	x = x/10;
    }
    if (x==rev || x==rev/10){
      System.out.println("palindrome");
    }else{
      System.out.println("not a palindrome");
    }



  }


}
