public class rotateMatrixClockWise{

  private static void rotateClockwise(int[][] mat){

    int rowBegin = 0;
    int rowEnd = mat.length-1;
    int colBegin = 0;
    int colEnd = mat[0].length-1;

    while(rowBegin < rowEnd && colBegin < colEnd){



      int prev = mat[rowBegin+1][colBegin];
      // Shift elements in right direction
      for(int i=colBegin;i<=colEnd;i++){
        int curr = mat[rowBegin][i];
        mat[rowBegin][i] = prev;
        prev = curr;
      }
      rowBegin++;


      // Now move elements down
      for(int i=rowBegin;i<=rowEnd;i++){
        int curr = mat[i][colEnd];
        mat[i][colEnd] = prev;
        prev = curr;
      }
      colEnd--;



      // Move elements to left
      // Additional check to prevent duplicates
      if(rowBegin <= rowEnd){
          for(int i=colEnd;i>=colBegin;i--){
            int curr = mat[rowEnd][i];
            mat[rowEnd][i] = prev;
            prev = curr;
          }
      }
      rowEnd--;


      // Shift elements up
      // Additional check to prevent duplicates
      if(colBegin <= colEnd){

        for(int i=rowEnd;i>=rowBegin;i--){
          int curr = mat[i][colBegin];
          mat[i][colBegin] = prev;
          prev = curr;
        }
      }
      colBegin++;




    }

    // Print matrix
    // After each iteration
    System.out.println("After each iteration: ");
    printMatrix(mat);
    System.out.println();

  }

  private static void printMatrix(int[][] mat){
    for(int i=0;i<mat.length;i++){
      for(int j=0;j<mat[i].length;j++){
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
  }


  public static void main(String args[]){

      int[][] mat = {{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};

      rotateClockwise(mat);




  }


}
