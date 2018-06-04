public class NQueens{


  private static String[][] find_all_arrangements(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
            board[i][j] = '-';
          }
        }
        findArrangement(board, n, 0);
        return new String[n][n];
  }


  private static boolean isSafe(char[][] board, int row, int col){

      int n = board.length;
      for(int i=col;i>=0;i--){
        if(board[row][i] == 'q'){
          return false;
        }
      }

      for(int i=row,j=col;i>=0 && j>=0;i--,j--){
        if(board[i][j] == 'q'){
          return false;
        }
      }


      for(int i=row, j=col;i<n && j>=0;i++,j--){
        if(board[i][j] == 'q'){
          return false;
        }
      }

      return true;
  }

  private static boolean findArrangement(char[][] board, int n, int col){

    if(col >= n){
      return true;
    }

    for(int row = 0; row < n; row++){
        if(isSafe(board, row, col)){
          board[row][col] = 'q';
          if(findArrangement(board, n, col+1) == true){
             System.out.println("Hits base case");
             printOut(board);
          }
          board[row][col] = '-';
        }
    }

    return false;
  }

  private static void printOut(char[][] board){
    for(int i=0;i<board.length;i++){
      for(int j=0;j<board[i].length;j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }


  public static void main(String args[]){

      int n = 5;
      find_all_arrangements(n);
  }


}
