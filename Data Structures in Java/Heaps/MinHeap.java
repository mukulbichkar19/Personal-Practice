public class MinHeap{

  private static int[] array = new int[]{0};

  private static void min_heapify(int[] a, int i, int n){

    int left = 2*i;
    int right = 2*i + 1;
    int smallest = Integer.MAX_VALUE;

    if(left<=n && a[left] < a[i]){
      smallest = left;
    }else{
      smallest = i;
    }

    if(right<=n && a[smallest] > a[right]){
      smallest = right;
    }

    if(smallest != i){
      int temp = a[i];
      a[i] = a[smallest];
      a[smallest] = temp;
      // call min heap with smallest as pivot
      min_heapify(a, smallest, n);
    }
  }

  public static void main(String args[]){

    array = new int[8];
    array[0] = -1;
    array[1] = 4;
    array[2] = 5;
    array[3] = 1;
    array[4] = 6;
    array[5] = 7;
    array[6] = 3;
    array[7] = 2;
    int n = array.length-1;
    for(int i=n/2;i>=1;i--){
      min_heapify(array,i,n);
    }

    for(int i=1;i<array.length;i++){
      System.out.print(array[i] + " ");
    }



  }


}
