public class countConsecutiveWays{


  private static int counsecutive(int target){

      // Number of ways
      int count_ways = 0;
      int start = 1; // Start pointer
      int end = 1; // End pointer
      int running_sum = 0; //running sum of integers for given window

      while(start <= target/2){
        // If sum is less than target than expand the window on right side
        if(running_sum < target){
          running_sum += end;
          end++;
        }// if sum is greater than target then compress the window from left side
        else if(running_sum > target){
          running_sum -= start;
          start++;
        }// If sum matches the target then increment the count and compress
        // the window from left side
        else if(running_sum == target){
          running_sum -= start;
          start++;
          count_ways++;
        }
      }
      return count_ways;
  }

  public static void main(String args[]){

    int target = 15;
    int ways = counsecutive(target);
    System.out.println("Number of ways are: "+ways);


  }

}
