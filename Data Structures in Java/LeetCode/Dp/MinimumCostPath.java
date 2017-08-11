public class MinimumCostPath{

    // Time Complexity:- O(2^n)
    private static int findMinRecursive(int[][] cost, int m, int n){

      if(m < 0 || n < 0){
        return Integer.MAX_VALUE;
      }else if(m==0 && n==0){
        return cost[m][n];
      }else{
        return cost[m][n] + Math.min(findMinRecursive(cost,m,n-1),
        Math.min(findMinRecursive(cost, m-1,n-1), findMinRecursive(cost, m-1,n)));
      }
    }

    private static void display(int[][] dp){
      for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[i].length;j++){
          System.out.print(dp[i][j] + " ");
        }
        System.out.println();
      }
    }

    // Time Complexity:- O(n^2)
    private static int findMinDP(int[][] cost,int m, int n){

      int[][] dp = new int[m+1][n+1];
      dp[0][0] = cost[0][0];

      // Initialize the first row
      for(int i=1;i<=m;i++){
        dp[0][i] = dp[0][i-1] + cost[0][i];
      }
      // Initialize the first column
      for(int j=1;j<=n;j++){
        dp[j][0] = cost[j][0] + dp[j-1][0];
      }

      for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
          dp[i][j] = cost[i][j] + Math.min(dp[i][j-1],Math.min( dp[i-1][j-1],dp[i-1][j]));
        }
      }
      return dp[m][n];
    }


      public static void main(String args[]){

        int[][] cost = {{1,2,3},{4,8,2},{1,5,3}};
        // int mincost = findMinRecursive(cost, 2, 2);
        int mincost = findMinDP(cost, 2, 2);
        System.out.println("The minimum cost is: "+mincost);


      }


}
