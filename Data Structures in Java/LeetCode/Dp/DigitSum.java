public class DigitSum{

  private static int digit_sum(long number){
    if(number < 0){
      number *= -1;
    }
    int sum = 0;
    while(number != 0){
      sum+=number%10;
      number=number/10;
    }
    return sum;
  }

  public static void main(String args[]){
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the number: ");
    long num = scan.nextLong();
    int sum = digit_sum(num);
    System.out.println("The sum of digits is: "+sum);
  }

}
