// Write a program to reverse an array or string
public class ReverseArray{

  private static void printArray(int[] arr){
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
      }
      System.out.println();
  }

  private static int[] reversearray(int[] arr){

    for(int i=0,j=arr.length-1;j>i;i++,j--){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    return arr;

  }


  public static void main(String args[]){

    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = scan.nextInt();
    int[] array = new int[n];
    System.out.println("Enter the array elements: ");
    for(int i=0;i<n;i++){
      array[i] = scan.nextInt();
    }
    System.out.println("Original array: ");
    // Array after creation
    printArray(array);
    // Reverse the array
    array = reversearray(array);
    System.out.println("Array after reversal: ");
    // Array after reversal
    printArray(array);




  }




}
