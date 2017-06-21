public class sortingIncremental{

  private void insertionSort(int[] a){
    int n = a.length;
    int[] dummy = a;
    for(int i=1;i<n;i++){
      int key = dummy[i];
      int j = i-1;
      while(j>=0 && a[j] > key){
        dummy[j+1] = dummy[j];
        j--;
      }
      dummy[j+1] = key;
    }
    System.out.println("Insertion Sort Output: ");
    print(dummy);
  }

  private void bubbleSort(int[] a){
    int[] dummy = a;
    int n = dummy.length;
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n-i-1;j++){
        if(dummy[j] > dummy[j+1]){
          int temp = dummy[j];
          dummy[j]= dummy[j+1];
          dummy[j+1] = temp;
        }
      }
    }
    System.out.println("Bubble Sort Output: ");
    print(dummy);
  }

  private void selectionSort(int[] a){
    int[] dummy = a;
    int n = dummy.length;
    for(int i=0;i<n-1;i++){
      int min = i;
      for(int j=i+1;j<n-1;j++){
        if(dummy[j] < dummy[min]){
          min = j;
        }
      }
      int temp = dummy[min];
      dummy[min] = dummy[i];
      dummy[i] = temp;
    }
    System.out.println("Selection Sort Output: ");
    print(dummy);
  }



  private static void print(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]){
    int[] array = {90,6,2,109,5};
    sortingIncremental Obj = new sortingIncremental();
    // Insertion Sort
    Obj.insertionSort(array);
    // Bubble Sort
    Obj.bubbleSort(array);
    // Selection Sort
    Obj.selectionSort(array);



  }
}
