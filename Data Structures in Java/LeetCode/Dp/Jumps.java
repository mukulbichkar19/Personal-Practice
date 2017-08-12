public class Jumps{

  private static int findJumpDP(int[] a){

    int[] dp = new int[a.length];
    dp[a.length-1] = 0;
    for(int i=a.length-2;i>=0;i--){
        int path = Integer.MAX_VALUE;
        for(int j=i+1;j<=i+a[i];j++){
          if(dp[j]!=Integer.MAX_VALUE){
            path = Math.min(path, 1+dp[j]);
          }
        }
        dp[i] = path;
      }
    return dp[0];

  }


  public static void main(String args[]){

      int[] a = {2,3,1,1,2,4,2,0,1,1};
      int jumps = findJumpDP(a);
      System.out.println("The minimum number of jumps are: "+jumps);


  }

}
