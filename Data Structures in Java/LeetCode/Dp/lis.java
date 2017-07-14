public class lis{

  private static int[] mem;
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

  public static void main(String args[]){
    int[] a = {3,4,-1,0,6,2,3};
    mem = new int[a.length];
    actualSolution = new int[a.length];
    for(int i=0;i<mem.length;i++){
      mem[i] = 1;
      actualSolution[i] = i;
    }
    System.out.println("Max length is: "+findLIS(a));



  }

}
