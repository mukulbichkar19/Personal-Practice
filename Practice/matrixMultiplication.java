public class matrixMultiplication{

  static int rows = 2;
  static int cols = 2;
  private static int[][] multiply(int[][] a, int[][] b){
    int[][] c = new int[rows][cols];
    for(int i=0;i<rows;i++){
      for(int k=0;k<cols;k++){
        for(int j=0;j<rows;j++){
          c[i][k] += a[i][j]*b[j][k];
        }
      }
    }
    return c;
}


  private static void printRec(int n){
    for(int i=0;i<n;i++){
      printRec(n-1);
      System.out.print(n+" ");
    }
  }

  public static void main(String args[]) {

    int[][] a = {{1,2}, {5,0}};
    int[][] b = {{3,8}, {11,9}};
    int[][] c = multiply(a,b);
    // for(int i=0;i<rows;i++){
    //   for(int j=0;j<cols;j++){
    //     System.out.print(c[i][j] + " ");
    //   }
    //   System.out.println();
    // }

    printRec(3);

  }



}
