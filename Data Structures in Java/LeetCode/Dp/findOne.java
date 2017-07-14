public class findOne{

  private static int[] mem;
  private static int find(int n){
    if(n==1){
      return 0;
    }
    if(mem[n]!=-1){
      return mem[n];
    }
    int r = 1 + find(n-1);
    if(n%2 == 0){
      r = Math.min(r, 1 + find(n/2));
    }
    if(n%3 == 0){
      r = Math.min(r, 1 + find(n/3));
    }
    mem[n] = r;
    return r;
  }

  public static void main(String args[]){
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = scan.nextInt();
    mem = new int[n+1];
    for(int i=0;i<=n;i++){
      mem[i] = -1;
    }
    int res = find(n);
    System.out.println("Minimum number required is: "+mem[n]);
  }


}
