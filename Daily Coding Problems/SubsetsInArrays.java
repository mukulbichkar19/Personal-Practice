public class SubsetsInArrays{

  private static void subsets(int[] a, int i, int[] output, int j) {
    if(i == a.length){
        for(int k=0;k<j;k++){
          System.out.print(output[k] + " ");
        }
        System.out.println();
        return;
    }
    // Add the current element to output array
    output[j] = a[i];
    subsets(a, i+1, output, j+1);
    // Do not add the current element to output array
    subsets(a, i+1, output, j);
  }




  private static void subsetsMain(int[] a) {
    subsets(a, 0, new int[a.length],0);
  }




  public static void main(String args[]){
    int[] a = {1,2,3};
    int[] b = {1,2,3,4};
    subsetsMain(b);
  }


}
