public class OneEditAway{




  private static boolean oneEdit(String s, String t){

    if(s=="" || t==""){
      return false;
    }


    java.util.HashSet<Character> hashset = new java.util.HashSet<>();

    // Iterate over string s
    for(int i=0;i<s.length();i++){
      hashset.add(s.charAt(i));
    }

    for(int j=0;j<t.length();j++){
      if(hashset.contains(t.charAt(j))){
        hashset.remove(t.charAt(j));
      }else{
        hashset.add(t.charAt(j));
      }
    }




    if(hashset.size() == 1 && Math.abs(s.length()-t.length()) == 1){
      return true;
    }else if(hashset.size() == 2 && Math.abs(s.length()-t.length()) == 0){
      return true;
    }

    return false;
  }



  // CTCI Recommended Method
  // Run time: O(n) where n is length of smaller string
  private static boolean oneEditDecider(String first, String second){

    if(Math.abs(first.length()-second.length()) > 1){
      return false;
    }

    // Get shorter and longer strings
    String s1 = first.length() < second.length() ? first:second;
    String s2 = first.length() < second.length() ? second:first;

    int index1 = 0;
    int index2 = 0;
    boolean foundDiffernece = false;

    while(index2 < s2.length() && index1 < s1.length()){

      if(s1.charAt(index1) != s2.charAt(index2)){

        if(foundDiffernece){
          return false;
        }else{
          foundDiffernece = true;
        }
        if(s1.length() == s2.length()){
          index1++;
        }

      }else{
        index1++;
      }
      index2++;
    }

    return true;



  }



  public static void main(String args[]){

    String s = "pale";
    String t = "pal";

    if(oneEdit(s,t)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }



  }


}
