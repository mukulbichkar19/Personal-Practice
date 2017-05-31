public class convertIntToBinary{

  public static void main(String args[]) {
    int n = 11;
    int n2 = 1;
    String bin1 = Integer.toBinaryString(n);
    String bin2 = Integer.toBinaryString(n2);
    System.out.println("Binary string: "+bin1);
    System.out.println("Bit count: "+Integer.bitCount(n^n2));
    int ones = (Integer.highestOneBit(n) << 1) -1;
    System.out.println(ones^n);






  }

}
