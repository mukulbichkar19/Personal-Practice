public class WeightedScheduling{


  private static Job[] sortJobs(Job[] jobs){
   java.util.Arrays.sort(jobs, new java.util.Comparator<Job>(){
      public int compare(Job j1, Job j2){
        return Integer.compare(j1.getEndTime(), j2.getEndTime());
      }
    });
    return jobs;
  }

  // Binary search
  private static int binarySearch(Job[] jobs, int index){

    int low = 0;
    int high = index-1;


    while(low <= high){
      int mid = (low+high)/2;
      if(jobs[mid].getEndTime() <= jobs[index].getStartTime()){
        if(jobs[mid+1].getEndTime() <= jobs[index].getStartTime()){
          low = mid + 1;
        }else{
          return mid;
        }
    }else{
        high = mid-1;
      }
    }
    return -1;



  }

  private static int findMaxProfit(Job[] jobs){
    // 1. Sort jobs based on the finish times O(nlgn)
    jobs = sortJobs(jobs);

    // 2. Store the values of weights maximized
    int[] dp = new int[jobs.length];
    dp[0] = jobs[0].getWeight();

    // O(n^2)
    for(int i=1;i<jobs.length;i++){
      for(int j=0;j<i;j++){
        if(isNOS(jobs[j], jobs[i])){
          dp[i] = Math.max(dp[i], dp[j]+jobs[i].getWeight());
        }
      }
    }

    // In optimized version the searching can be modified to binary search as
    // so that run time becomes O(nlogn)
    for(int i=1;i<jobs.length;i++){
      int val = binarySearch(jobs, i); //O(logn)
      if(val != -1){
        if(isNOS(jobs[val], jobs[i])){
          dp[i] = Math.max(dp[i], dp[val]+jobs[i].getWeight());
        }
      }
    }


    return findMaxInArray(dp);

  }

  private static int findMaxInArray(int[] dp){
    int max = Integer.MIN_VALUE;
    for(int i=0;i<dp.length;i++){
      max = Math.max(max, dp[i]);
    }
    return max;
  }

  private static boolean isNOS(Job j1, Job j2){

    if(j2.getStartTime() >= j1.getEndTime()){
      return true;
    }
    return false;

  }





    public static void main(String args[]){

      Job[] jobs = {new Job(3,10,20), new Job(1,2,50), new Job(6,19,100), new Job(2,100,200)};
      System.out.println("The maximum profit is: " + findMaxProfit(jobs));




    }


}
