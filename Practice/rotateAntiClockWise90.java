public class rotateAntiClockWise90{


  private static void rotateMatrix(int[][] mat){

    int n = mat.length;

    for(int x=0;x<n/2;x++){

      for(int y=x;y<n-x-1;y++){

        // Copy the top element to temp
        int temp = mat[x][y];

        // Move right to top
        mat[x][y] = mat[y][n-1-x];

        // Move the bottom to right
        mat[y][n-1-x] = mat[n-1-x][n-1-y];

        // Move the left to bottom
        mat[n-1-x][n-1-y] = mat[n-1-y][x];

        //Move the top to left
        mat[n-1-y][x] = temp;
      }


    }



    displayMatrix(mat);

  }


  private static void rotateClockWise90(int[][] mat){

    int n = mat.length;

    for(int x=0;x<n/2;x++){
      for(int y=x;y<n-x-1;y++){

        // Copy top element in temp
        int temp = mat[x][y];
        //Move left to top
        mat[x][y] = mat[n-1-y][x];
        //Move bottom to left
        mat[n-1-y][x] = mat[n-1-x][n-1-y];

        // Move right to bottom
        mat[n-1-x][n-1-y] = mat[y][n-1-x];

        // Move top to right
        mat[y][n-1-x] = temp;
      }
    }

    displayMatrix(mat);

  }


  private static void displayMatrix(int[][] mat){
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
    //rotateMatrix(mat);
    rotateClockWise90(mat);




  }



}
