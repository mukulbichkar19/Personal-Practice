public class UniqueBST{

  // Called as Catalan Number
  private static int possibleUnique(int n){

    int[] dp = new int[n+1];
    dp[0] = 1;
    dp[1] = 1;
    int lesser = 0;
    int greater = 0;
    for(int i=2;i<=n;i++){
      for(int j=0;j<i;j++){
        dp[i] += dp[j]*dp[i-j-1];
      }
    }
    return dp[n];
  }


  public static void main(String args[]){
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n = scan.nextInt();
    int uniqueTrees = possibleUnique(n);
    System.out.println("The possible ways are: "+uniqueTrees);
  }


}
