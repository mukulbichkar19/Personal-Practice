public class addRecursive{

  private static int sum(int[] a, int n){

    if(n == 0){
      return 0;
    }else{
      int small_sum = a[n-1];
      return small_sum + sum(a, n-1);
    }

  }


  public static void main(String args[]){
    int[] arr = {-9,5,4,1,3,5};
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the size of elements: ");
    int n = scan.nextInt();
    int res = sum(arr, n);
    System.out.println("The sum of elements is: "+res);
  }



}
