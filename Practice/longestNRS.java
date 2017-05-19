public class longestNRS{


  private static int findMax(String s){
    int str_length = s.length();
    if(str_length == 0 || s == null){
      return 0;
    }else if(str_length == 1){
      return 1;
    }
    int max = 0;
    int start = 0;
    java.util.Set<Character> set = new java.util.HashSet<>();
    for(int i=0;i<str_length;i++){
      char c = s.charAt(i);

      if(!set.contains(c)){

        set.add(c);
        max = Math.max(max, i-start+1);

      }else{

        for(int j=start;j<i;j++){
          set.remove(s.charAt(j));
          if(s.charAt(j)==c){
            start = j+1;
            break;
          }
        }

        set.add(c);

      }

    }
    return max;
  }

  private static int slidingWindow(String s){
    int n = s.length();
    java.util.Set<Character> set = new java.util.HashSet<>();
    int ans = 0; int i=0; int j=0;
    while(i<n && j<n){
      if(!set.contains(s.charAt(j))){
        set.add(s.charAt(j++));
        ans = Math.max(ans, j-i);
      }else{
        set.remove(s.charAt(i++));
      }
    }
    return ans;
  }

  public static void main(String args[]){

    String s = args[0];
    int length = slidingWindow(s);
    System.out.println("The max length is: "+length);

  }


}
