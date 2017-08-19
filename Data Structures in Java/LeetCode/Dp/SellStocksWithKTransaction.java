public class SellStocksWithKTransaction{


  private static void display(int[][] dp){
    for(int i=0;i<dp.length;i++){
      for(int j=0;j<dp[i].length;j++){
        System.out.print(dp[i][j] + " ");
      }
      System.out.println();
    }
  }

  // Unpotimized Version
  // Runtime: O(prices^2*k)
  // Space: O(prices*k)
  private static int findMaxWithK(int[] prices, int k){

    int n = prices.length;
    int[][] dp = new int[k+1][n+1];

    for(int i=0;i<=k;i++){
      dp[i][0] = 0;
    }

    for(int j=0;j<=n;j++){
      dp[0][j] = 0;
    }

    for(int i=1;i<=k;i++){
      for(int j=1;j<=n;j++){
        int withoutTransaction = dp[i][j-1];
        int withTransaction = 0;
        for(int m=0;m<j;m++){
          withTransaction = Math.max(withTransaction, ((prices[j-1]-prices[m])+dp[i-1][m]));
        }
        dp[i][j] = Math.max(withoutTransaction, withTransaction);
      }
    }
    return dp[k][n];
  }

  // Ootimized Version
  // Runtime: O(prices*k)
  // Space: O(prices*k)
  private static int findMaxWithKOptimized(int[] prices, int k){
    int n = prices.length;
    int[][] dp = new int[k+1][n+1];
    for(int i=0;i<=k;i++){
      dp[i][0] = 0;
    }

    for(int j=0;j<=n;j++){
      dp[0][j] = 0;
    }


    for(int i=1;i<=k;i++){
      int maxDiff = -prices[0];
      for(int j=1;j<=n;j++){
        int withoutTransaction = dp[i][j-1];
        dp[i][j] = Math.max(withoutTransaction, prices[j-1] + maxDiff);
        maxDiff = Math.max(maxDiff, dp[i-1][j]-prices[j-1]);
      }
    }


    return dp[k][n];


  }



  public static void main(String args[]){

    int[] prices = {100, 30, 15, 10, 8, 25, 80};
    int k = 3;
    // int findMaxProfit = findMaxWithK(prices, k);
    // System.out.println("The maximum profit obtained is: "+findMaxProfit);
    int findMaxProfit = findMaxWithKOptimized(prices, k);
    System.out.println("The maximum profit obtained is: "+findMaxProfit);


  }



}
