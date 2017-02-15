// Write an efficient program to find smallest and second smallest element in an array.

public class firstAndSecondSmallest{

  private static void scanArray(int[] arr){

    int first_small = Integer.MAX_VALUE;
    int second_small = Integer.MAX_VALUE;

    for(int i=0;i<arr.length;i++){

      int comp = arr[i];
      if((comp < first_small) && (comp < second_small)){
        first_small = comp;
      }

      if((comp > first_small) && (comp < second_small)){
        second_small = comp;
      }

    }

    System.out.println("The first small element is: "+first_small +
     " and second small element is: "+second_small);



  }

  public static void main(String args[]){

    int[] array = {12, 13, 1, 10, 34, 1};

    // Method 1:- O(n)
    scanArray(array);

    // Other methods like sorting O(n*logn) and other using two scans
    // with time complexity O(n)



  }

}
