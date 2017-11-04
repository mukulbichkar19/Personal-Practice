public class HeapSort{

  private static int[] array;

  private static void heapsort(int[] a){
    // Step 1: Build max_heap
    build_maxheap(a);
    // maintain a frontier count
    int heap_size = a.length-1;

    for(int i=a.length-1;i>=2;i--){
      // Swap i and first element
      int temp = a[1];
      a[1] = a[i];
      a[i] = temp;
      heap_size -= 1;
      max_heapify(a, 1, heap_size);
    }


  }

  private static void build_maxheap(int[] a){
    int n = a.length - 1;
    for(int i=n/2;i>=1;i--){
      max_heapify(a,i,n);
    }
  }

  private static void max_heapify(int[] a, int i, int n){

    int left = 2*i;
    int right = 2*i + 1;
    int largest = Integer.MIN_VALUE;

    if(left <= n && a[left] > a[i]){
      largest = left;
    }else{
      largest = i;
    }

    if(right <= n && a[largest] < a[right]){
      largest = right;
    }

    if(largest != i){
      int temp = a[i];
      a[i] = a[largest];
      a[largest] = temp;

      max_heapify(a, largest, n);
    }





  }

  public static void main(String args[]){
    array = new int[5];
    array[0] = -1;
    array[1] = 2;
    array[2] = 1;
    array[3] = 3;
    array[4] = 5;

    heapsort(array);

    System.out.println("After sorting: ");
    for(int i=1;i<array.length;i++){
      System.out.print(array[i] + " ");
    }
    System.out.println();

  }

}
