public class MaximumSizeSubMatrixof1{

  // Reference:- http://www.geeksforgeeks.org/maximum-size-sub-matrix-with-all-1s-in-a-binary-matrix/

  private static void display(int[][] s){
    for(int i=0;i<s.length;i++){
      for(int j=0;j<s[i].length;j++){
        System.out.print(s[i][j] + " ");
      }
      System.out.println();
    }
  }

  private static void findMaxSubMatrix(int[][] mat){

    int[][] s = new int[mat.length][mat[0].length];

    // Copy first row of mat into s
    for(int i=0;i<mat[0].length;i++){
      s[0][i] = mat[0][i];
    }

    // Copy first column of mat into s
    for(int j=0;j<mat.length;j++){
      s[j][0] = mat[j][0];
    }

    for(int i=1;i<mat.length;i++){
      for(int j=1;j<mat[i].length;j++){
        if(mat[i][j] == 1){
          s[i][j] = Math.min(s[i][j-1], Math.min(s[i-1][j],s[i-1][j-1])) + 1;
        }else{
          s[i][j] = 0;
        }
      }
    }

    // Find max_of_s, max_of_i, max_of_j
    int max_of_s = 0;
    int max_of_i = 0;
    int max_of_j = 0;
    for(int i=0;i<s.length;i++){
      for(int j=0;j<s[i].length;j++){
        if(s[i][j] > max_of_s){
          max_of_s = s[i][j];
          max_of_i = i;
          max_of_j = j;
        }
      }
    }


    System.out.println("Maximum size sub-matrix is: ");
    for(int i = max_of_i; i > max_of_i - max_of_s; i--)
    {
        for(int j = max_of_j; j > max_of_j - max_of_s; j--)
        {
            System.out.print(mat[i][j] + " ");
        }
        System.out.println();
    }




  }



  public static void main(String args[]){

    int[][] mat = {{0,1,1,0,1},{1,1,0,1,0},{0,1,1,1,0},{1,1,1,1,0},{1,1,1,1,1},{0,0,0,0,0}};
    findMaxSubMatrix(mat);







  }


}
