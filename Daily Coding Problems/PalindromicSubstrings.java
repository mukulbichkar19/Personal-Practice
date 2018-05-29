import java.util.List;
import java.util.ArrayList;
public class PalindromicSubstrings{

  private static List<String> palindromes;
  private static void generate_palindromic_decompositions(String s){
      palindromes = new ArrayList<>();
      // for(int i=0;i<s.length();i++){
      //   canDecompose(s, i,s.length());
      // }
      checkPalindromes(s, new StringBuilder(""), 0);

  }

  private static void canDecompose(String s, int st, int end){
    for(int j=st;j<end;j++){
      String sub = s.substring(st, j+1);
      if(isPalindrome(sub)){
        palindromes.add(sub);
      }
    }
  }

  private static void checkPalindromes(String s, StringBuilder str, int st){

    if(isPalindrome(str.toString())){
      palindromes.add(str.toString());
    }

    for(int i=st;i<s.length();i++){
      str.append(s.charAt(i));
      checkPalindromes(s, str, i+1);
      str.deleteCharAt(str.length()-1);
    }

  }




  private static boolean isPalindrome(String s){

    if(s.length()==1){
      return true;
    }

    int i = 0;
    int j = s.length()-1;

    while(j > i && s.charAt(i) == s.charAt(j)){
      i++;
      j--;
    }

    return i == j ? true : false;
  }

  public static void main(String args[]){
    String s = "aba";
    String t = "civic";
    String p = "abracadabra";

    generate_palindromic_decompositions(t);
    System.out.println("Plaindromes are: ");
    System.out.println(palindromes);
  }


}
