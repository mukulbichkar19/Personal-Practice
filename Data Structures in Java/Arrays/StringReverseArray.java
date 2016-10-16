public class StringReverseArray{

  public static String reverseString(String str){

      String[] words = str.split(" ");
      StringBuilder reverseString = new StringBuilder();
      for(String w:words){
        reverseString.append(reverse(w));
        reverseString.append(" ");
      }
      return reverseString.toString();
  }

  private static String reverse(String word){
      int length = word.length();
      char[] word_char = word.toCharArray();
      for(int i=0,j=length-1;j>=i;i++,j--){
        char swap = word_char[i];
        word_char[i] = word_char[j];
        word_char[j] = swap;
      }
      // Ways to convet a char array into a String.
      // String reversed = new String(word_char);
      String reversed = String.valueOf(word_char);
      return reversed;

  }



  public static void main(String args[]){

       String sentence = "This is an example.";
       // Original String
       System.out.println("Original String: ");
       //System.out.print(sentence);
       System.out.println();
       System.out.println("Reversed String is: ");
       System.out.println(reverseString(sentence));
   }
}
