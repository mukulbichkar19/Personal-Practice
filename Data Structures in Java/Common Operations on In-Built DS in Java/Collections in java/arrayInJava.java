public class arrayInJava{

  private static void print(int[] arr){
    for(int i:arr){
      System.out.print(i + " ");
    }
    System.out.println();
  }


  public static void main(String args[]){
    int[] array = {1,2,37,5,4,6};
    System.out.println("Before sorting: ");
    print(array);
    // Sort an array
    java.util.Arrays.sort(array);
    System.out.println("After sorting: ");
    print(array);
    // Clone or copy an array into another array
    int[] clone = array.clone();  //Method 1
    int[] copy = new int[array.length];
    System.arraycopy(array, 0, copy, 0, array.length);
    System.out.println("Cloned array: ");
    print(clone);
    System.out.println("Copied array: ");
    print(copy);






  }
}
