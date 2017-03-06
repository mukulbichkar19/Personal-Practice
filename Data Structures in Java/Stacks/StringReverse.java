public class StringReverse{

  private static String reverse(String input){

    char[] string = input.toCharArray();
    for(int i=0,j=string.length-1;j>i;i++,j--){
      char temp = string[j];
      string[j] = string[i];
      string[i] = temp;
    }
    String formatted = String.valueOf(string);
    return formatted;
  }


  public static void main(String args[]){

      java.util.Scanner scan = new java.util.Scanner(System.in);
      System.out.println("Enter the string: ");
      String input = scan.next();

      System.out.println("The entered string is: "+reverse(input));


  }

}
