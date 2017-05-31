public class jumpSearch{

  private static int jumpsearch(int[] arr, int n){
    // If array is not sorted then sort it this needs O(nlgn)
    java.util.Arrays.sort(arr);
    int len = arr.length;

    // Finding block size to be jumped
    int step = (int)Math.floor(Math.sqrt(len));
    System.out.println("step size: "+step);

    // Finding the block where element is
        // present (if it is present)
    int prev = 0;
    while (arr[Math.min(step, len)-1] < n)
    {
        prev = step;
        step += (int)Math.floor(Math.sqrt(len));
        if (prev >= len)
            return -1; // Element not found
    }
    System.out.println("Previous is set to: "+prev);

    // Doing a linear search for x in block
    // beginning with prev.
    while (arr[prev] < n)
    {
        prev++;

        // If we reached next block or end of
        // array, element is not present.
        if (prev == Math.min(step, len))
            return -1;
    }

    if (arr[prev] == n)
            return prev;



    return -1;

  }


  public static void main(String arg[]){
    int[] arr = {1,2,90,4,5,-87};
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the number to search: ");
    int n = scan.nextInt();
    int res = jumpsearch(arr, n);
    System.out.println("res: "+res);
  }
}
