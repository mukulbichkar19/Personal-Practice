public class selectionSort{



  // Worst case time complexity:- O(n^2)
  // Should only be used when input range is small
  // Finds minimum element in each iteration and places it
  // at proper place.
  public static void main(String args[]){
    int[] arr = {64,25,12,22,11,33,2,2,2};

    for(int i=0;i<arr.length;i++){
      int min = i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[j] < arr[min]){
          min = j;
        }
      }
      // After finding min swap
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }

    System.out.println("Sorted array: ");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();



  }
}
