public class recursive{

  private static int findSum(int n){

    // Base case:
    if(n == 0){
      return 0;
    }else{
      return n+findSum(n-1);
    }

  }

  public static void main(String args[]){

      java.util.Scanner scan = new java.util.Scanner(System.in);
      System.out.println("Enter the number for the sum: ");
      int n = scan.nextInt();
      System.out.println("Sum is: "+findSum(n));

  }

}
