public class WordBreak{


  private static boolean wordBreak(String s, java.util.ArrayList<String> worddict){
    java.util.Set<String> wordDict = new java.util.HashSet(worddict); // Convert to a hashset
    boolean[] dp = new boolean[s.length()+1];
    dp[0] = true;
    for(int i=1;i<=s.length();i++){
      for(int j=0;j<i;j++){
        if(dp[j] && wordDict.contains(s.substring(j,i))){
          dp[i] = true;
          break;
        }
      }
    }
    return dp[s.length()];

  }


  public static void main(String args[]){
    String s = "aaaaaaa";
    java.util.ArrayList<String> wordDict = new java.util.ArrayList<>();
    wordDict.add("aaaa");
    wordDict.add("aaa");
      if(wordBreak(s,wordDict)){
        System.out.println("Possible");
      }else{
        System.out.println("Not possible");
      }
  }
}
