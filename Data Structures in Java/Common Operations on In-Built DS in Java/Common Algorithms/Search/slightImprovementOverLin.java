public class slightImprovementOverLin{

  // Worst case : O(n)
  // Average Case: O(n/2)
  private static int search(int[] arr, int x){
    for(int i=0, j=arr.length-1;j>=i;i++,j--){
      if(arr[i] == x){
        return i;
      }else if(arr[j] == x){
        return j;
      }
    }

    return -1;
  }

  public static void main(String args[]){
    int[] arr = {89,7,2,34,67,21,69};
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the number to be found: ");
    int x = scan.nextInt();
    int res = search(arr, x);
    if(res != -1){
      System.out.println("Element found at index: "+res);
    }else{
      System.out.println("Element not found");
    }




  }
}
