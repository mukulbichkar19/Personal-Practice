public class mergeSorting{

  public static void merge(int[] a, int p, int q, int r){
    int n1 = q-p+1; // Since starts with 0
    int n2 = r-q;
    int[] left = new int[n1+1];
    int[] right = new int[n2+1];
    for(int i=0;i<n1;i++){
      left[i] = a[p+i];
    }
    for(int j=0;j<n2;j++){
        right[j] = a[q+j+1];
    }
    // Sentinel Values
    left[n1] = Integer.MAX_VALUE;
    right[n2] = Integer.MAX_VALUE;

    int i = 0;
    int j = 0;
    for(int k=p;k<=r;k++){
      if(left[i] <= right[j]){
          a[k] = left[i++];
      }else{
          a[k] = right[j++];
      }
    }


  }



  private void mergeSort(int[] a, int p, int r){
    if(p < r){
      int q = (p+r)/2;
      mergeSort(a, p, q);
      mergeSort(a, q+1, r);
      merge(a,p,q,r);
    }
  }

  public static void main(String args[]){
    int[] array = {5,2,4,7,1,3,2,6};

    mergeSorting s = new mergeSorting();
    s.mergeSort(array, 0, array.length-1);
    System.out.println("Let's print the sorted array: ");
    for(int i=0;i<array.length;i++){
      System.out.print(array[i] + " ");
    }
    System.out.println();




  }



}
