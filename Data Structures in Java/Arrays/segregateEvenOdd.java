public class segregateEvenOdd{

  private static void usingTwoPointers(int[] arr){

    int left = 0;
    int right = arr.length-1;
    while(right > left){
      if(arr[left]%2 == 0){
        left++;

      }
      else if(arr[right]%2 != 0){
        right--;

      }
      else if(arr[left]%2 != 0 && (arr[right]%2 == 0)){

        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
      }
    }
    
    System.out.println("Let's check ");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }

  public static void main(String args[]){

    int[] array = {12, 34, 45, 9, 8, 90, 3};

    // Method 1: O(n)
    usingTwoPointers(array);


  }

}
