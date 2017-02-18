// Given an array arr[] of integers, find out the difference between any two elements such that larger element appears after the smaller number in arr[].
// Examples: If array is [2, 3, 10, 6, 4, 8, 1] then returned value should be 8 (Diff between 10 and 2).
// If array is [ 7, 9, 5, 6, 3, 2 ] then returned value should be 2 (Diff between 7 and 9)


public class maxDiff{


  private static void simpleScan(int[] arr){

      int max_diff = 0;
      for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
          int current_diff = arr[j]-arr[i];
          if(current_diff > max_diff){
            max_diff = current_diff;
          }
        }
      }
      System.out.println("The Max Difference is: "+max_diff);

  }

  private static void usingMinSoFar(int[] arr){

    int min_so_far = arr[0];
    int max_diff = arr[1]-arr[0];
    for(int i=1;i<arr.length;i++){
      int current_diff = arr[i]-min_so_far;
      if(current_diff > max_diff){
        max_diff = current_diff;
      }
      if(arr[i] < min_so_far){
        min_so_far = arr[i];
      }
    }

    System.out.println("The max difference is: "+max_diff);

  }

  public static void main(String args[]){

      int[] array = {1, 2, 90, 10, 110};

      // Method 1: O(n^2)
      simpleScan(array);

      // Method 2: O(n)
      usingMinSoFar(array);


  }



}
