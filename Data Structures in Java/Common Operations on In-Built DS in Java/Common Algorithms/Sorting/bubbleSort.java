public class bubbleSort{

 // Worst Case Time Complexity: O(n^2)
 // Should be used if input is in small range
 // Inplace and best time compexity is if it is sorted i.e. O(n)
  public static void main(String args[]){
    int[] arr = {64, 34, 25, 12, 22, 11, 90};

    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length-i-1;j++){
        if(arr[j+1] < arr[j]){
          int temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
        }
      }

    }

    System.out.println("The array after sorting is: ");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();


  }

}
