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

  // Rod Cutting Recursive
  private static int rodCut(int[]len, int[]cost, int n){
    if(n==0){
      return 0;
    }
    int res = Integer.MIN_VALUE;
    for(int i=0;i<len.length;i++){
      if(len[i] <= n){
        res = Math.max(res, cost[i] + rodCut(len,cost,n-len[i]));
      }
    }
    return res;
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

    int[] lengths = {1,2,3};
    int[] cost = {2,5,8};
    int maxProfit = rodCut(lengths,cost,5);
    System.out.println("The maximum profit is: "+maxProfit);




  }

}
