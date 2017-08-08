public class KnapSack{

  private static void print(int[][] d){
    for(int i=0;i<d.length;i++){
      for(int j=0;j<d[i].length;j++){
        System.out.print(d[i][j] + " ");
      }
      System.out.println();
    }
  }


  private static int knapsack(int[] w, int[] v, int target){

    int[][] dp = new int[w.length+1][target+1];

    for(int i=1;i<=w.length;i++){
      for(int j=1;j<=target;j++){
        if(j < w[i-1]){
          dp[i][j] = dp[i-1][j];
        }else{
          dp[i][j] = Math.max(dp[i-1][j], v[i-1] + dp[i-1][j-w[i-1]]);
        }
      }
    }

    //print(dp);
    return dp[w.length][target];




  }


  public static void main(String args[]) {
    int[] weights = {1,3,4,5};
    int[] values = {1,4,5,7};
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the target weight: ");
    int w = scan.nextInt();
    int best = knapsack(weights, values, w);
    System.out.println("The best value: "+best);
  }

}
