public class anagram{



  public static void main(String args[]){

    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the first String: ");
    String a = scan.next();
    //System.out.println("The entered string is: "+str);
    System.out.println("Enter the second String: ");
    String b = scan.next();
    int xor_a = 0;
    int xor_b = 0;
    for(int i=0;i<a.length();i++){
      xor_a = xor_a^(int)a.charAt(i);
      //System.out.println((int)a.charAt(i));
    }
    for(int j=0;j<b.length();j++){
      xor_b = xor_b^(int)b.charAt(j);
    }
    if(xor_a == xor_b){
      System.out.println("Anagram");
    }
    else{
      System.out.println("Not an angram");
    }



  }



}
