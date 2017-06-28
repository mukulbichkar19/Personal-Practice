public class stringReversal{


  private static String reverse(String s, int n){

    if(n==0){
      return "";
    }else{
      return s.charAt(n-1) + reverse(s, n-1);
    }



  }

  public static void main(String args[]){

    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the string to be reversed: ");
    String s = scan.nextLine();
    String rev = reverse(s, s.length());
    System.out.println("Reversed String is: "+rev);
  }


}
