public class quickSort2{

  private static void quickSort(int[] a, int p, int r){
    if(p < r){
      int q = partition(a, p, r);
      quickSort(a, p, q-1);
      quickSort(a, q+1,r);
    }
  }

  private static void randomizedQuickSort(int[] a, int p, int r){
    if(p < r){
      int q = randomPartition(a, p, r);
      randomizedQuickSort(a, p, q-1);
      randomizedQuickSort(a, q+1, r);
    }
  }


  private static int randomPartition(int[] a, int p, int r){
    java.util.Random rand = new java.util.Random();
    int i = rand.nextInt((r-p)+1)+p;
    //System.out.println("Random : "+i);
    int temp = a[r];
    a[r] = a[i];
    a[i] = temp;
    return partition(a, p, r);
  }

  private static int partition(int[] a, int p, int r){
    int x = a[r]; //Last element as the pivot
    int i = p - 1;
    for(int j=p;j<=r-1;j++){
      if(a[j] <= x){
        i = i+1;
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
      }
    }
    i = i+1;
    int temp = a[i];
    a[i] = a[r];
    a[r] = temp;
    return i;
  }


  public static void main(String args[]){
    int[] array = {2,8,7,1,3,5,6,4};
    // quickSort(array,0,array.length-1);
    randomizedQuickSort(array, 0, array.length-1);
    System.out.println("After Sorting: ");
    for(int i=0;i<array.length;i++){
      System.out.print(array[i] + " ");
    }
    System.out.println();

  }

}
