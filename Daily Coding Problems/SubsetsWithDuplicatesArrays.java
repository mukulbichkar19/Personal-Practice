import java.util.*;
public class SubsetsWithDuplicatesArrays{



  private static void subsets(int[] a, int i, int[] output, int j){

      if(i == a.length){
        System.out.println("hits base case");
        for(int k=0;k<j;k++){
          System.out.print(output[k] + " ");
        }
        System.out.println();
        return;
      }


      // Inclusive Case
      output[j] = a[i];

      subsets(a, i+1, output, j+1);

      if(j==0 || j > 0 && output[j-1] != a[i]){
        // For exclusive condition additional duplicates check
        subsets(a, i+1, output, j);
      }


  }





  private static void subsetsMain(int[] a){
    subsets(a, 0, new int[a.length], 0);
  }



  public static void main(String args[]){

    int[] a = {2,2};

    int[] b = {1,2,2};

    int[] c = {1,2,2,2};

    subsetsMain(b);



  }
}
