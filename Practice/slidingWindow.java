public class slidingWindow{

  // Sliding Window using HashSet
  private static int usingHashSet(String s){
    int length = s.length();
    java.util.Set<Character> set = new java.util.HashSet<>();
    int i=0;
    int j=0;
    int ans=0;
    while(i<length && j<length){
      if(!set.contains(s.charAt(j))){
        set.add(s.charAt(j++));
        ans = Math.max(ans, j-i);
      }else{
        // This is an additional work of O(n)
        set.remove(s.charAt(i++));
      }
    }
    return ans;
  }

  // Optimized version using hashmap
  private static int usingHashMap(String s){
    int len = s.length();
    int ans = 0;
    java.util.Map<Character, Integer> map = new java.util.HashMap<>();
    for(int i=0, j=0;j<len;j++){
      // This avoids the extra O(n) in hashset approach
      if(map.containsKey(s.charAt(j))) {
        i = Math.max(map.get(s.charAt(j)), i);
      }
      ans = Math.max(ans, j-i+1);
      map.put(s.charAt(j), j+1);
    }
    return ans;
  }

  public static void main(String args[]){

    String s = args[0];
    System.out.println("Max length using hashset is: "+usingHashMap(s));





  }
}
