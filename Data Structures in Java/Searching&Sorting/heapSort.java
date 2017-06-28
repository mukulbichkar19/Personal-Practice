public class heapSort{

  // Returns the parent index
  private static int parent(int i){
    return i/2;
  }

  // Returns the index of left child
  private static int left(int i){
    return 2*i;
  }

 // Returns the index of right child
  private static int right(int i){
    return 2*i+1;
  }


  // MAX_HEAPIFY
  // Input: Array and index i
  // Output: Max heap array
  private static int[] max_heapify(int[] a, int i){
    int len = a[0];
    // Fetch the left and right children
    int l = left(i);
    int r = right(i);
    int largest = Integer.MIN_VALUE;
    // Check for largest element with left
    if(l <= len && a[l] > a[i]){
      largest = l;
    }else{
      largest = i;
    }
    // Check for largest with right child
    if(r <= len && a[r] > a[largest]){
      largest = r;
    }
    if(largest != i){
      int temp = a[i];
      a[i] = a[largest];
      a[largest] = temp;
      max_heapify(a, largest);
    }
    return a;
}

  // Max-Heapifies all the elements in the tree
  private static int[] build_heap(int[] a){
    int len = a[0];
    int[] dummy = a;
    for(int i=len/2;i>=1;i--){
       dummy = max_heapify(a, i);
    }
    return dummy;
  }



  // Heap Sort
  private static int[] heap_sort(int[] a){
    a = build_heap(a);
    for(int i=a[0];i>=2;i--){
      int temp = a[1];
      a[1] = a[a[0]];
      a[a[0]] = temp;
      a[0] = a[0]-1;
      a = max_heapify(a, 1);
    }
    return a;
  }


  public static void main(String args[]){

    int[] array = {10,4,16,10,8,7,9,3,14,2,1};
    array = heap_sort(array);
    System.out.println("After heap sort: ");
    for(int i=1;i<array.length;i++){
      System.out.print(array[i] + " ");
    }
    System.out.println();



  }


}
