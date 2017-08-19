public class EditDistance{


  private static void display(int[][] d){
    for(int i=0;i<d.length;i++){
      for(int j=0;j<d[i].length;j++){
        System.out.print(d[i][j] + " ");
      }
      System.out.println();
    }
  }

  private static int findEdit(String s1, String s2){
    int m = s1.length();
    int n = s2.length();
    if(m == 0 || n == 0){
      return 0;
    }

    int[][] dp = new int[m+1][n+1];
    // Initialization
    // if second string is null then the cost to insert the elements to convert into first
    for(int i=0;i<dp.length;i++){
      dp[i][0] = i;
    }
    // if first string is null then the cost to delete the elements from second
    for(int j=0;j<dp[0].length;j++){
      dp[0][j] = j;
    }

    for(int i=1;i<=m;i++){
      for(int j=1;j<=n;j++){
        if(s1.charAt(i-1) == s2.charAt(j-1)){
          dp[i][j] = dp[i-1][j-1];
        }else{
          dp[i][j] = 1+Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
        }
      }
    }
    display(dp);


    return dp[m][n];



  }




  public static void main(String args[]){
      java.util.Scanner scan = new java.util.Scanner(System.in);
      System.out.println("Enter the first string: ");
      String s1 = scan.nextLine();
      System.out.println("Enter the second string: ");
      String s2 = scan.nextLine();
      int edit = findEdit(s1, s2);
      System.out.println("Minimum edit distance is: "+edit);

  }



}
