public class BitManipulation{


  public static void main(String args[]){

      int a = 5; //101
      int b = 3; //011

      System.out.println(a&b); //001 = 1
      System.out.println(a|b); //111 = 7
      System.out.println(a^b); //110 = 6
      System.out.println(~a); //010 = -6
      System.out.println(~b); //100 = -4
  }

}
