public class removeDuplicatedInSortedArray{


  public static void main(String args[]){
    int[] arr = {1,1,1,2,2,3,4};
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the value of k: ");
    int k = scan.nextInt();
    int i = 0;
    for(int n:arr){
      if(i < k || arr[i-k] < n){
        arr[i++] = n;
      }
    }
    System.out.println("Output Array: ");
    for(int j=0;j<i;j++){
      System.out.print(arr[j] + " ");
    }

  }
}
