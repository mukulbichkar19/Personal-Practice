public class Test{

  public static void main(String args[]){
    int n = 11;
    String binary = Integer.toBinaryString(n);
    System.out.println("Integer in binary format: "+binary);
    int ones = Integer.bitCount(n);
    System.out.println("Number of 1's: " + ones);
    int complement = ~n;
    int len_ones = (Integer.highestOneBit(n) << 1)-1;
    System.out.println("A number's complement (not using ~): " +len_ones ^ n);



  }

}
