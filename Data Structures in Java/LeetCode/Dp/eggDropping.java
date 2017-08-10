public class eggDropping{

  private static int eggDropRec(int n, int k){

    // If there are no floors, then no trials needed. OR if there is
    // one floor, one trial needed.
    if(k==1 || k==0){
      return k;
    }

    // We need k trials for one egg and k floors
    if(n==1){
      return k;
    }

    int min = Integer.MAX_VALUE;
    int res = 0;
    for(int x=1;x<=k;x++){
      // Case 1: If egg breaks then we are left with one less egg i.e. n-1
      //         and floors below current floor
      // Case 2: If egg does not break then we are left with remaining floors //         above the current floor and n eggs
      res = Math.max(eggDropRec(n-1,x-1), eggDropRec(n, k-x));
      if(res < min){
        min = res;
      }
    }

    return min+1;

  }

  private static void display(int[][] dp){
    for(int i=0;i<dp.length;i++){
      for(int j=0;j<dp[i].length;j++){
        System.out.print(dp[i][j] + " ");
      }
      System.out.println();
    }
  }


  // Dynamic programming
  private static int eggDropDynamic(int n, int floors){
    int[][] dp = new int[n+1][floors+1];
    int c = 0;
    for(int i=0;i<=floors;i++){
      dp[1][i] = i;
    }

    for(int e=2;e<=n;e++){
      for(int f=1;f<=floors;f++){
        dp[e][f] = Integer.MAX_VALUE;
        for(int k=1;k<=f;k++){
          c = 1+Math.max(dp[e-1][k-1],dp[e][f-k]);
          if(c < dp[e][f]){
            dp[e][f] = c;
          }
        }

      }
    }
    display(dp);
    return dp[n][floors];
  }



  public static void main(String args[]){
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the number of eggs: ");
    int n = scan.nextInt();
    System.out.println("Enter the number of floors: ");
    int k = scan.nextInt();
    //int res = eggDropRec(n,k);
    int res = eggDropDynamic(n,k);
    System.out.println("The minimum no. of attempts are: "+res);
  }


}
