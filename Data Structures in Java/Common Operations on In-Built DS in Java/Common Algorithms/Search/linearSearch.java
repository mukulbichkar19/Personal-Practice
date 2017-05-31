public class linearSearch{

  // Complexity :- O(n)
  private static int linsearch(int[] array, int n){
    for(int i=0;i<array.length;i++){
      if(array[i] == n){
        return i;
      }
    }
    return -1;
  }

  public static void main(String args[]){
    int[] arr = {1,2,90,4,5,-87};
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the element to find: ");
    int n = scan.nextInt();
    int i = linsearch(arr, n);
    if(i != -1){
      System.out.println("Element found at index: "+i);
    }else{
      System.out.println("Element not found");
    }



  }

}
