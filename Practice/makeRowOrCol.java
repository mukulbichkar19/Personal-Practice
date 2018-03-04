import java.util.Arrays;
public class makeRowOrCol{

  // Total Time Complexity: 2*O(n) ~ O(n)
  // Total Space Complexity: O(m) + O(n)
  private static void transForm(int[][] mat){

    if(mat.length == 0 || mat[0].length == 0){
      return;
    }

    // Extra space:- O(n) + O(m) where n = no. of rows, m = no. of cols
    int[] rows = new int[mat.length];
    int[] cols = new int[mat[0].length];

    // Time Complexity : O(n)
    for(int i=0;i<mat.length;i++){
      for(int j=0;j<mat[i].length;j++){
        if(mat[i][j] == 1){
          rows[i] = 1;
          cols[j] = 1;
        }
      }
    }

    // Time Complexity: O(n)
    for(int i=0;i<mat.length;i++){
      for(int j=0;j<mat[i].length;j++){
        if(rows[i] == 1 || cols[j] == 1){
          mat[i][j] = 1;
        }
      }
    }

    printMatrix(mat);

  }

  // Time Complexity: 2*O(n) ~ O(n)
  // Space Complexity: O(1)
  private static void transFormWithoutSpace(int[][] mat){

    if(mat.length == 0 || mat[0].length==0){
      return;
    }

    boolean row_one = false;
    boolean col_one = false;

    for(int i=0;i<mat.length;i++){
      for(int j=0;j<mat[i].length;j++){
        if(mat[i][j] == 1 && i==0){
          row_one = true;
        }
        if(mat[i][j] == 1 && j==0){
          col_one = true;
        }
        if(mat[i][j] == 1){
          mat[0][j] = 1; //Set first column 1
          mat[i][0] = 1; //Set first row 1
        }
      }
    }

    for(int i=1;i<mat.length;i++){
      for(int j=1;j<mat[i].length;j++){
        if(mat[0][j] == 1 || mat[i][0] == 1){
          mat[i][j] = 1;
        }
      }
    }

    if(row_one){
      for(int i=0;i<mat.length;i++){
        mat[0][i] = 1;
      }
    }

    if(col_one){
      for(int j=0;j<mat[0].length;j++){
        mat[j][0] = 1;
      }
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

    int[][] mat = {{0,1,0},{1,0,0},{0,0,0}};

    // transForm(mat);
    transFormWithoutSpace(mat);

  }


}
