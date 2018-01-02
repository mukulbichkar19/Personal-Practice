public class HeapSort{

  private static void sort(int[] arr){

    int n = arr.length;

    // Build Heap
    for(int i=n/2-1;i>=0;i--){
      heapify(arr, n, i);
    }

    for(int i=n-1;i>=0;i--){
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;
      heapify(arr,i,0);
    }
  }

  private static void heapify(int[] arr, int n, int i){

    int largest = i;
    int l = 2*i + 1;
    int r = 2*i + 2;

    if(l < n && arr[l] > arr[largest]){
      largest = l;
    }

    if(r < n && arr[r] > arr[largest]){
      largest = r;
    }

    if(largest != i){
      // Swap largest and i
      int swap = arr[i];
      arr[i] = arr[largest];
      arr[largest] = swap;
      heapify(arr,n, largest);
    }
  }

  private static void findKLargest(int[] arr, int k){

    int n = arr.length;
    // Build a max heap
    for(int i=n/2-1;i>=0;i--){
      heapify(arr, n, i);
    }

    int j = n-k;
    for(int i=n-1;i>=j;i--){
      int temp = arr[i];
      arr[i] = arr[0];
      arr[0] = temp;
      System.out.print(arr[i] + " ");
      heapify(arr,i,0);
    }




  }


  public static void main(String args[]){
    int[] arr = {12,11,13,5,6,7};
    sort(arr);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    // Print k largest elements in an Array
    findKLargest(arr,3);
    System.out.println();




  }
}
