public class copyPaste{

  private static int minSteps(int n) {
    int[] mem = new int[n+1];

    for(int i=2;i<=n;i++){
      mem[i] = i;
      int val = Integer.MAX_VALUE;
      for(int j=i-1;j>1;j--){
        if(i%j == 0){
          mem[i] = Math.min(val, mem[j] + (i/j));
          val = mem[i];
        }
      }
    }

    for(int i=0;i<mem.length;i++){
      System.out.print(mem[i] + " ");
    }
    System.out.println();
    return mem[n];


  }



  public static void main(String args[]) {
    java.util.Scanner scan  = new java.util.Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n = scan.nextInt();
    int s = minSteps(n);
    System.out.println("Min steps needed are: "+s);
  }

}
