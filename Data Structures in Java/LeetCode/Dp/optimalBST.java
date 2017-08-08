public class optimalBST{


  private int minCost(int[] input, int[] freq){
    int[][] dp = new int[input.length][input.length];

    // When only one node the max frequency is itself
    // for length = 1
    for(int i=0;i<dp.length;i++){
      dp[i][i] = freq[i];
    }

    for(int l=2;l<=input.length;l++){
      // This loop goes such that i+l <= input.length
      for(int i=0;i<=input.length-l;i++){
        int j = i + l - 1; // Offset for each length
        dp[i][j] = Integer.MAX_VALUE; // since we need to find minimum
        int sum = getSum(freq, i, j); // Calculate the sum of frequencies for all nodes under consideration
        for(int k=i;k<=j;k++){
          int val = sum + (k-1 < i ? 0:dp[i][k-1]) + (k+1 > j ? 0:dp[k+1][j]);
          if(val < dp[i][j]){
            dp[i][j] = val;
          }
        }
      }
    }

    return dp[0][input.length-1];



  }

  private int getSum(int[] freq, int i, int j){
    int sum = 0;
    for(int k=i;k<=j;k++){
      sum += freq[k];
    }
    return sum;

  }


  public static void main(String args[]){
    int input[] = {10,12,20,35,46};
    int freq[] = {34,8,50,21,16};
    optimalBST o1 = new optimalBST();
    int minCost = o1.minCost(input, freq);
    System.out.println("The minimum cost is: "+minCost);

  }


}
