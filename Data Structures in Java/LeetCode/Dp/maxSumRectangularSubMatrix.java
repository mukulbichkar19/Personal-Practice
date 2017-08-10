public class maxSumRectangularSubMatrix{

  private static int[] kadane;
  private static int maxSum = 0;
  private static int maxLeft = 0;
  private static int maxRight = 0;
  private static int localmaxUp = 0;
  private static int localmaxDown = 0;
  private static int maxUp = 0;
  private static int maxDown = 0;

  private static int findMaxByKadane(int[] kadane){
      int max_ending_here = 0;
      int max_so_far = 0;
      for(int i=0;i<kadane.length;i++){
        max_ending_here += kadane[i];
        if(max_ending_here < 0){
          max_ending_here = 0;
        }
        if(max_ending_here > max_so_far){
          if(max_so_far == 0){
            localmaxUp = i;
          }
          localmaxDown = i;
          max_so_far = max_ending_here;

        }
      }
      return max_so_far;
    }



  private static int findMaxSum(int[][] input){
    int localmaxLeft = 0;
    int localmaxRight = 0;
    kadane = new int[input.length];
    for(int i=0;i<input.length;i++){
      localmaxLeft = i;
      java.util.Arrays.fill(kadane, 0);
      for(int j=i;j<input[i].length;j++){
        localmaxRight = j;
        // Copy the elements in the kadane's array
        for(int k=0;k<kadane.length;k++){
          kadane[k] += input[k][j];
        }
        int currentSum = findMaxByKadane(kadane);
        if(currentSum > maxSum){
          maxSum = currentSum;
          maxLeft = localmaxLeft;
          maxRight = localmaxRight;
          maxUp = localmaxUp;
          maxDown = localmaxDown;
        }
      }
    }

    return maxSum;

  }






  public static void main(String args[]){
    int[][] input = {{2,1,-3,-4,5}, {0,6,3,4,1}, {2,-2,-1,4,-5},{-3,3,1,0,3}};
    int maxSum = findMaxSum(input);
    System.out.println("Max sum is: "+maxSum+" maxLeft is: "+maxLeft +" maxRight is: "+maxRight+" maxUp is: "+maxUp+" maxDown is: "+maxDown);
    // Time Complexity: O(col*col*row)
    // Space Complexity: O(row)
  }

}
