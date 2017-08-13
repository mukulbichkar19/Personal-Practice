import java.util.List;
import java.util.ArrayList;
public class recursion{


  // Reverse a number
  private static String reverse(String s){

    if(s.length() == 0){
      return "";
    }
    int len = s.length();
    return  reverse(s.substring(1,len)) + s.charAt(0);
  }


  // Find whether a string is palindrome or not
  private static boolean isPalindrome(String s, int low, int high){
    if(low == high){
      return true;
    }
    return (s.charAt(low) == s.charAt(high)) && isPalindrome(s,low+1, high-1);
  }

  // Rod Cutting Recursive with memoization

  private static int[] rod_mem;
  private static int rodCut(int[]len, int[]cost, int n){
    if(rod_mem[n] != 0){
      return rod_mem[n];
    }
    if(n==0){
      return 0;
    }
    int res = Integer.MIN_VALUE;
    for(int i=0;i<len.length;i++){
      if(len[i] <= n){
        res = Math.max(res, cost[i] + rodCut(len,cost,n-len[i]));
      }
    }
    rod_mem[n] = res;
    return rod_mem[n];
  }

  // Coin Change
  private static int minCoins(int[] coins, int val){

    // Base Case
    if(val == 0){
      return 0;
    }
    int res = Integer.MAX_VALUE;
    for(int i=0;i<coins.length;i++){
      if(coins[i] <= val){
        res = 1 + Math.min(res, minCoins(coins, val-coins[i]));
      }
    }

    return res;

  }

  private static int countN(int n){

    if(n < 0){
      return 0;
    }
    if(n == 0){
      return 1;
    }
    return countN(n-1) + countN(n-3) + countN(n-5);



  }

  // Count for possible paths
  //private static int count = 0;
  private static int possiblePaths(int[][] mat, int row, int col, int m, int n){

    // Base Case
    if(row == m-1 && col == n-1){
      return 1;
    }

    for(int i=row;i<m;i++){
      for(int j=col;j<n;j++){
          return possiblePaths(mat,i,j+1,m,n) + possiblePaths(mat,i+1,j,m,n);
      }
    }

    return 0;
  }

  // Alternate recursion for above possible paths is
  private static int possible(int m, int n){
    if(m==0 || n==0){
      return 1;
    }
    return possible(m-1, n) + possible(m,n-1);
  }

  public static List<Integer> longest_increasing_subsequence(List<Integer> sequence) {
        // Write your solution here

        int[] lengths = new int[sequence.size()];
        int[] parents = new int[lengths.length];

        Object[] obj = sequence.toArray();
        for(int i=obj.length-1;i>=0;i--){
            int res = Integer.MIN_VALUE;
            for(int j=i;j<obj.length;j++){
                if(obj[j] > obj[i]){
                    res = Math.max(res, lengths[j] + 1);
                }
            }
            lengths[i] = res;
        }


    }


  public static void main(String args[]){
    String s = "civic";
    String rev = reverse(s);
    System.out.println("Reversed string is: "+rev);
    if(isPalindrome(s,0,s.length()-1)){
      System.out.println("A Palindrome");
    }else{
      System.out.println("Not a Palindrome");
    }

    // Rod Cutting using recursion
    int[] lengths = {1,2,3};
    int[] cost = {2,5,8};
    int desired_length = 5;
    rod_mem = new int[desired_length+1];
    int maxProfit = rodCut(lengths,cost,desired_length);
    System.out.println("The maximum profit is: "+maxProfit);

    // Coin Change Using Recursion
    int[] coins = {1,3,5};
    int val = 11;
    System.out.println("The minimum no. of coins required are: "+minCoins(coins, val));

    // Ways for counting a number n
    int ways = countN(6);
    System.out.println("The number of ways are: "+ways);


    // Number of possible paths in a MxN matrix to reach from top left to bottom right
    int[][] mat = {{1,3,5,12},{4,2,8,15},{10,9,13,36}};
    //int[][] mat = {{1},{4}};
    int m = 3;
    int n = 4;
    //int count = possiblePaths(mat, 0, 0,m,n);
    int count = possible(m-1,n-1);
    System.out.println("the ways to reach from top to botton are: "+count);
    java.util.List<Integer> sequence = new java.util.ArrayList<>();
    sequence.add(1);
    sequence.add(5);
    sequence.add(9);
    Object[] obj = sequence.toArray();
    for(int i=0;i<obj.length;i++){
      System.out.print(obj[i]);
    }

  }

}
