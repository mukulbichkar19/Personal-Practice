public class PermutationsArrayWithDuplicates{


  private static void permutations(int[] a, int i){

    if(i == a.length-1){
      for(int k=0;k<a.length;k++){
        System.out.print(a[k] + " ");
      }
      System.out.println();
      return;
    }

    for(int j=i;j<a.length;j++){
        if(i==j || a[j] != a[j-1]){
          a = swap(a,i,j);
          permutations(a, i+1);
          a = swap(a, i,j);
        }
    }
  }

  private static int[] swap(int[] a, int i, int j){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
    return a;
  }



  private static void permutationsMain(int[] a){
      permutations(a, 0);
  }



  public static void main(String args[]){

    int[] a = {2,2};
    int[] b = {1,2,2};
    int[] c = {1,2,2,3};

    permutationsMain(c);


  }


}
