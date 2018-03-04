public class MinHeap{

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

    int smallest = i;
    int l = 2*i + 1;
    int r = 2*i + 2;

    if(l < n && arr[l] < arr[smallest]){
      smallest = l;
    }

    if(r < n && arr[r] > arr[smallest]){
      smallest = r;
    }

    if(smallest != i){
      // Swap largest and i
      int swap = arr[i];
      arr[i] = arr[smallest];
      arr[smallest] = swap;
      heapify(arr,n,smallest);
    }
  }


  public static void main(String args[]){

    int[] arr = {12,11,13,5,6,7};


  }

}
