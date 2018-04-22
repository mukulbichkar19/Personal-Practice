public class NQueens{

  private static int N; //board size

  private static boolean isSafe(int[][] board, int row, int col){

    // Check in the same row to the left
    for(int i=0;i<col;i++){
      if(board[row][i] == 1){
        return false;
      }
    }

    // Check for diagonal upper left
    for(int i=row, j=col; i>=0 && j>=0; i--,j--){
      if(board[i][j] == 1){
        return false;
      }
    }

    // Check for diagonal lower left
    for(int i=row,j=col;i<N && j>=0;i++,j--){
      if(board[i][j] == 1){
        return false;
      }
    }

    return true;

  }


  private static boolean solveNQUtil(int[][] board, int col){

    // Base Case - All queens placed
    if(col >= N){
      return true;
    }

    for(int i=0;i<N;i++){

      if(isSafe(board, i, col)){

          // place queen
          board[i][col] = 1;

          // check recursively
          if(solveNQUtil(board, col+1) == true){
            return true;
          }

          // backtrack and remove queen
          board[i][col] = 0;
      }
    }


    return false;



  }


  private static void printSolution(int[][] board){
    for(int i=0;i<board.length;i++){
      for(int j=0;j<board[i].length;j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }



  public static void main(String args[]){

      N = 4; //Board size
      int[][] board = new int[N][N]; // Initialize the Board

      if(solveNQUtil(board, 0) == false){
        System.out.println("No solution exists");
      }else{
        System.out.println("Safe Configuration: ");
        printSolution(board);
      }
  }



}
