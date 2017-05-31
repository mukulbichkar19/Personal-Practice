public class exponentialSearch{


  /*

  Time Complexity : O(Log n)
  Auxiliary Space : The above implementation of Binary Search is recursive and requires O()Log n) space. With iterative Binary Search, we need only O(1) space.

  Applications of Exponential Search:

  Exponential Binary Search is particularly useful for unbounded searches, where size of array is infinite. Please refer Unbounded Binary Search for an example.
  It works better than Binary Search for bounded arrays also when the element to be searched is closer to the first element.

   */
  private static int exponential(int[] arr, int x){

    int n = arr.length;
    // If first element is the element to be searched
    if(arr[0] == x){
      return 0;
    }

    // Else double the search space each time
    // and search between low and high
    int i = 1;
    while(i < n && arr[i]<=x){
        i = i*2;
    }

    // If low reaches the end of array then handle special conditions
    if(i/2 == (n-1)){
       if(arr[n-1] == x){
         return (n-1);
       }else if(arr[n-1] < x){
         return -1;
       }
    }
    // Call binary search with low limit as i/2 and high as i.
    return binary(arr, i/2,i,x);
}

  private static int binary(int[] arr, int low, int high, int elem){

    while(high >= low){
      int mid = ((high-1)+low)/2;
      if(arr[mid] == elem){
        return mid;
      }else if(arr[mid] > elem){
        return binary(arr, low, mid-1,elem);
      }else{
        return binary(arr, mid+1, high,elem);
      }
    }
    return -1;




  }

  public static void main(String args[]){
    // useful for sorted array only
    int arr[] = {2, 3, 4, 10, 40};
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the number to search: ");
    int x = scan.nextInt();
    int res = exponential(arr, x);
    if(res != -1){
      System.out.println("Element found at index: "+res);
    }else{
      System.out.println("Element not present ");
    }



  }
}
