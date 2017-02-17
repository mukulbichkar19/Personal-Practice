public class segregateZeroOne{


  private static void usingCount(int[] arr){

    // Initialize the count of 0
    int zeroCount = 0;
    // Initialize the count of 1
    int oneCount = 0;
    // array length
    int n = arr.length;
    for(int i=0;i<n;i++){
      if(arr[i] == 0){
        zeroCount++;
      }else if(arr[i] == 1){
        oneCount++;
      }
    }

    for(int i=0;i<zeroCount;i++){
      arr[i] = 0;
    }

    for(int i=zeroCount;i<n;i++){
      arr[i] = 1;
    }

    printArray(arr);

  }

  private static void usingSwapping(int[] arr){

    int left = 0;
    int right = arr.length-1;
    int n = arr.length;
    while(right > left){

      while(arr[left] == 1 && (left < right)){
        left++;
      }

      while(arr[right] == 0 && (left < right)){
        right--;
      }

      while(left < right){
        arr[left] = 0;
        arr[right] = 1;
        left++;
        right--;
      }
    }
    printArray(arr);

  }

  // Print the array
  private static void printArray(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }


  public static void main(String args[]){

    int[] array = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};

    // Method 1:- O(n)
    usingCount(array);

    // Method 2:- O(n)
    usingSwapping(array);

  }


}
