public class subsetSum{


  private static void display(boolean[][] dp){
    for(int i=0;i<dp.length;i++){
      for(int j=0;j<dp[i].length;j++){
        System.out.print(dp[i][j] + " ");
      }
      System.out.println();
    }
  }

  private static boolean canPartition(int[] subset){
    boolean[][] dp;
    int sum = 0;
    for(int i=0;i<subset.length;i++){
      sum += subset[i];
    }
    // sum/2 is needed as the sum of 2 subsets so sumA + sumB = total_sum
    // since sumA == sumB i.e. 2sumA = total_sum therefore sumA = (total_sum)/2
    sum = sum/2;
    dp = new boolean[subset.length+1][sum+1];
    for(int i=0;i<subset.length+1;i++){
      dp[i][0] = true;
    }
    for(int j=1;j<sum;j++){
      dp[0][j] = false;
    }

    for(int i=1;i<=subset.length;i++){
      for(int j=1;j<=sum;j++){
        dp[i][j] = dp[i-1][j];
        if(j >= subset[i-1]){
          dp[i][j] = dp[i-1][j] || dp[i-1][j-subset[i-1]]; //If selected and if not selected
        }
      }
    }




    display(dp);

    return dp[subset.length][sum];

  }




  public static void main(String args[]) {

    int[] subset = {1,2,3,5};
    boolean isPossible = canPartition(subset);
    if(isPossible){
      System.out.println("Yes partition is possible");
    }else{
      System.out.println("Nothing exists");
    }


  }

}
