public class palindromicSubstring{

    private static int count = 0;
   private static void countPalindromes(String s){

     for(int i=0;i<s.length();i++){
       extendPalindromes(s,i,i);
       extendPalindromes(s,i,i+1);
     }
  }

  private static void extendPalindromes(String s, int i, int j){
    while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
      count++;
      i--;
      j++;
    }
  }

  public static void main(String args[]){
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the string: ");
    String s = scan.nextLine();
    countPalindromes(s);
    System.out.println("The number of palindromic substrings are: " + count);



  }


}
