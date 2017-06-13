public class insertionSort{



  public static void main(String args[]){
    int[] arr = {64, 34, 25, 12, 22, 11, 90};
    //int[] arr = {12,11,5,13,6};
    for(int i=1;i<arr.length;i++){
      int key = arr[i];
      int j = i-1;
      while(j>=0 && arr[j] > key){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = key;
    }

    System.out.println("The array after sorting is: ");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();


  }

}
