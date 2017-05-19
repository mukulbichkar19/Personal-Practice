public class isAnagram{


  private static boolean isAnagram(String s, String t){
    char[] src = s.toCharArray();
    char[] trg = t.toCharArray();
    int x = 0;
    int y = 0;
    java.util.Arrays.sort(src); // time complexity of O(n*lgn)
    java.util.Arrays.sort(trg);
    if(src.length != trg.length){
      return false;
    }else{
      return java.util.Arrays.equals(src, trg);
    }
  }

  private static boolean isAnagram2(String s, String t) {
    // Using hashtable
    char[] test = new char[26]; // 26 for 26 alphabets in english
    if(s.length() != t.length()){
      return false;
    }else{
      for(int i=0;i<s.length();i++){

        test[s.charAt(i)-'a']++;
      }
      System.out.println("Display");
      for(int i=0;i<test.length;i++){
        System.out.println(i + " val " +test[i]);
      }



    }
    return false;
  }





  public static void main(String args[]){

    String s = args[0];
    String t = args[1];
    if(isAnagram2(s, t)){
      System.out.println("Is an anagram");
    }else{
      System.out.println("Not an anagram");
    }
  }

}
