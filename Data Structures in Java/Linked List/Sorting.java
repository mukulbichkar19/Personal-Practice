public class Sorting{

  private static int[] bubble(int[] a){

    int n = a.length;
    boolean swapped = false;
    for(int i=0;i<n-1;i++){
      swapped = false;
      for(int j=0;j<n-i-1;j++){
        if(a[j] > a[j+1]){
          int temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
          swapped = true;
        }
      }
      if(swapped == false){
        break;
      }
    }
    return a;

  }

  private static void display(int[] a){
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }

  private static int[] insertion(int[] array){
    int n = array.length;
    for(int j=1;j<n;j++){
      int key = array[j];
      int i = j-1;
      while(i>=0 && array[i]>key){
        array[i+1] = array[i];
        i--;
      }
      array[i+1] = key;
    }

    return array;
  }

  public static void main(String args[]){

    int[] array = {1,4,2,5,18,90};

    // Bubble Sort: Compares each pair and swaps elements
    // array = bubble(array);
    // display(array);

    // Insertion sort: Sorting of Cards
    array = insertion(array);
    display(array);





  }

}
