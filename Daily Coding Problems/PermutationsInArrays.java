public class PermutationsInArrays{


  private static void permutations(int[] a, int i) {

      if(i == a.length-1){
        print(a);
        return;
      }

      for(int j=i;j<a.length;j++){
          a = swap(a, i,j);
          permutations(a, i+1);
          a = swap(a, i,j);
      }
  }


  private static int[] swap(int[] a, int i, int j){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
    return a;
  }


  private static void print(int[] a){
      for(int i=0;i<a.length;i++){
        System.out.print(a[i] + " ");
      }
      System.out.println();
  }


  private static void permutationsMain(int[] a){
    permutations(a, 0);
  }


  public static void main(String args[]){

    int[] a = {1,2};
    int[] b = {1,2,3};
    int[] c = {1,2,3,4};
    permutationsMain(c);
  }

}
