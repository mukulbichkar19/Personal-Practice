public class binarySearch{


  private static int binsearch(int[] arr, int n){
    // Sort the array O(nlgn)
    java.util.Arrays.sort(arr);

    int low = 0;
    int high = arr.length-1;
    int mid = 0;
    // O(logn)
    while(high >= low){
      mid = (low+high)/2;
      if(arr[mid] == n){
        return mid;
      }else if(arr[mid] > n){
        high = mid-1;
      }else {
        low = mid+1;
      }
    }
    return -1;


  }


  public static void main(String args[]) {
    int[] arr = {1,2,90,4,5,-87};
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the number to search: ");
    int n = scan.nextInt();
    int res = binsearch(arr, n);
    if(res != -1){
      System.out.println("Element found at index: "+res);
    }else{
      System.out.println("Element not found");
    }
  }

}
