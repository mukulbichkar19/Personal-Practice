public class rodCutting{

  private static int cutRod(int[] rods, int[] costs, int len){

    int[] dp = new int[len+1];
    dp[0] = 0;

    for(int i=1;i<=len;i++){
      int res = Integer.MIN_VALUE;
      for(int j=0;j<rods.length;j++){
        if(rods[j] <= i){
          res = Math.max(res, costs[j] + dp[i-rods[j]]);
        }
      }
      dp[i] = res;
    }

    return dp[len];




  }


  public static void main(String args[]){

    int[] rods = {1,2,3,4};
    int[] costs = {2,5,7,8};
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the length of rod: ");
    int n = scan.nextInt();
    int max_profit = cutRod(rods, costs, n);
    System.out.println("The maximum profit that can be obtained is: "+max_profit);


  }


}
