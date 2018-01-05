public class HeapSort{


  private static void heapsort(int[] arr){

    int n = arr.length;
    //Build Max heap
    for(int i=n/2-1;i>=0;i--){
      heapify(arr,n,i);
    }

    for(int i=n-1;i>=0;i--){

      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;

      heapify(arr,i,0);

    }

    print(arr);


  }

  private static void print(int[] a){
    for(int i=0;i<a.length;i++){
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }

  private static void heapify(int[] a, int n, int i){

    int largest = i;
    int left = 2*i + 1;
    int right = 2*i + 2;

    if(left < n && a[left] > a[largest]){
      largest = left;
    }

    if(right < n && a[right] > a[largest]){
      largest = right;
    }

    if(largest != i){
      int temp = a[i];
      a[i] = a[largest];
      a[largest] = temp;

      // Call heapify
      heapify(a,n,largest);
    }
  }


  public static void main(String args[]){

      int[] array = {12,11,13,5,6,7};

      heapsort(array);



  }


}
