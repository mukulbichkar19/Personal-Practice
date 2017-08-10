public class longestCommonSubstring{

  private static int[][] dp;
  private static void display(int[][] dp, int maxlen, String s1){
    for(int i=0;i<dp.length;i++){
      for(int j=0;j<dp[i].length;j++){
        if(dp[i][j] == maxlen){
          System.out.println(s1.substring(i-maxlen, maxlen+1));
          break;
        }
      }

    }
  }


  private static int maxLen(String s1, String s2){

    dp = new int[s1.length()+1][s2.length()+1];
    int max_len = 0;

    for(int i=1;i<=s1.length();i++){
      for(int j=1;j<=s2.length();j++){
        if(s1.charAt(i-1)==s2.charAt(j-1)){
          dp[i][j] = 1 + dp[i-1][j-1];
          max_len = Math.max(max_len, dp[i][j]);
        }
      }
    }

    return max_len;
  }


  public static void main(String args[]){
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the first string: ");
    String s1 = scan.nextLine();
    System.out.println("Enter the second string: ");
    String s2 = scan.nextLine();
    int len = maxLen(s1,s2);
    System.out.print("Max length substring is: ");
    display(dp,len,s1);

  }

}
