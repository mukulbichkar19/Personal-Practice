public class longestPalindromicSubString{
  // babad
  // bab pass to a function that checks for palindrome
  //

  private static int longestPal(String st){

    StringBuilder s = new StringBuilder();
    for(int i=0;i<st.length();i++){
      for(int j=i+1;j<st.length();j++){
        s.append(st.charAt(j));
        System.out.println(s);
      }
    }
    return 0;


  }


  public static void main(String args[]){

    String s = args[0];
    int length = longestPal(s);
  }
}
