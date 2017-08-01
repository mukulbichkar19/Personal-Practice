public class lis{

  private static int[] mem;
  private static int[] mem2;
  private static int[] actualSolution;
  private static int findLIS(int[] a){

    for(int i=1;i<a.length;i++){
      for(int j=0;j<i;j++){
        if(a[i] > a[j]){
          if(mem[j]+1 > mem[i]){
            mem[i] = mem[j] + 1;
            actualSolution[i] = j;
          }
        }
      }
    }
    int max = 0;
    for(int i=0;i<mem.length;i++){
      if(mem[i] > max){
        max = i;
      }
    }

    int t = max;
    int newT = max;
    do{
      t = newT;
      System.out.print(a[t] + " ");
      newT = actualSolution[t];
    }while(t!=newT);
    System.out.println();
    return max;
  }

  private static int findMax(int[] a, int n){
    if(n==1){
      return 1;
    }
    if(mem2[n-1]>1){
      return mem2[n-1];
    }
    for(int i=1;i<n;i++){
      int res = findMax(a,i);
      if(a[i-1] < a[n-1]){
        mem2[n-1] = Math.max(mem2[n-1], 1+res);
      }
    }
    return mem2[n-1];
  }

  public static void main(String args[]){
    int[] a = {3,4,-1,0,6,2,3};
    //int[] a = {2,3,5};
    mem = new int[a.length];
    actualSolution = new int[a.length];
    for(int i=0;i<mem.length;i++){
      mem[i] = 1;
      actualSolution[i] = i;
    }

    mem2 = new int[a.length];
    for(int i=0;i<mem2.length;i++){
      mem2[i] = 1;
    }
    int len = findMax(a,a.length);
    for(int i=0;i<mem.length;i++){
      System.out.print(mem[i] + " ");
    }
    System.out.println();
    System.out.println("Max length is: "+len);



  }

}
