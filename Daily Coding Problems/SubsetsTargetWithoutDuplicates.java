public class SubsetsTargetWithoutDuplicates{




  private static void subsets(int[] a, int i, int[] output, int j, int target, int sum){

      if(i == a.length){
          if(sum == target){
            for(int k=0;k<j;k++){
              System.out.print(output[k] + " ");
            }
            System.out.println();
          }
          return;
      }

      // Add the current element to output
      output[j] = a[i];
      subsets(a, i+1, output, j+1, target, sum + a[i]);

      // Without the current element
      subsets(a, i+1, output, j, target, sum);

  }



  private static void subsetsMain(int[] a, int target){
      subsets(a, 0, new int[a.length], 0, target, 0);
  }

  public static void main(String args[]){

      int[] a = {1,2,3,4};
      int target = 9;
      subsetsMain(a, target);


  }
}
