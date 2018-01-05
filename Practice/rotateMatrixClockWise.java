public class rotateMatrixClockWise{

  private static void rotateClockwise(int[][] mat){

    if(mat.length == 0 || mat[0].length == 0){
      return;
    }

    int rowBegin = 0;
    int rowEnd = mat.length-1;
    int colBegin = 0;
    int colEnd = mat[0].length-1;

    while(rowBegin <= rowEnd-1 && colBegin <= colEnd-1){

        int prev = mat[rowBegin+1][colBegin];

        // Move elements to right
        for(int j=colBegin;j<=colEnd;j++){
          int curr = mat[rowBegin][j];
          mat[rowBegin][j] = prev;
          prev = curr;
        }
        rowBegin++;

        // Move element down
        for(int j=rowBegin;j<=rowEnd;j++){
          int curr = mat[j][colEnd];
          mat[j][colEnd] = prev;
          prev = curr;
        }
        colEnd--;

        // Move elements to left
        if(rowBegin <= rowEnd){
          for(int j=colEnd;j>=colBegin;j--){
            int curr = mat[rowEnd][j];
            mat[rowEnd][j] = prev;
            prev = curr;
          }
        }
        rowEnd--;

        // Move elements up
        if(colBegin <= colEnd){
          for(int j=rowEnd;j>=rowBegin;j--){
            int curr = mat[j][colBegin];
            mat[j][colBegin] = prev;
            prev = curr;
          }
        }
        colBegin++;
    }

    printMatrix(mat);

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
