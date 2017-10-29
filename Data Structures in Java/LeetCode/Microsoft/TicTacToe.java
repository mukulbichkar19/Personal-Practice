public class TicTacToe{

  private int[][] tic_board;
  private int[] rows;
  private int[] cols;
  int diag;
  int anti_diag;
  public TicTacToe(int n) {

        // Create a board first
        tic_board = new int[n][n];
        rows = new int[n];
        cols = new int[n];
        // Brute force approach 1




  }

  /** Player {player} makes a move at ({row}, {col}).
       @param row The row of the board.
       @param col The column of the board.
       @param player The player, can be either 1 or 2.
       @return The current winning condition, can be either:
               0: No one wins.
               1: Player 1 wins.
               2: Player 2 wins. */
   public int move(int row, int col, int player) {

       tic_board[row][col] = player;
       int n = tic_board.length;
       int add = player == 1 ? 1:-1;
       /*
       Approach 1: Brute force
       Time complexity: O(moves*n)
       boolean win = true;
       // Check for row
       for(int i=0;i<n;i++){
         if(tic_board[row][i] != player){
           win = false;
           break;
         }
       }

       if(win){
         return player;
       }

       win = true;
       // Check for col
       for(int j=0;j<n;j++){
         if(tic_board[j][col] != player){
           win = false;
           break;
         }
       }

       if(win){
         return player;
       }

       // Check for Diagonal elements
       win = true;
         for(int i=0;i<n;i++){

             if(tic_board[i][i] != player){
               win = false;
               break;
             }

         }


       if(win){
         return player;
       }

       // Check for Anti-Diagonal
       win = true;
      //  if(n-1-row == col){
         for(int i=0;i<n;i++){
           if(tic_board[i][n-i-1] != player){
             win = false;
             break;
           }
         }
      //  }

       if(win){
         return player;
       }

       return 0;*/

       if(row == col){
         diag += add;
       }

       if(col == n-1-row){
         anti_diag += add;
       }

       rows[row] += add;
       cols[col] += add;

       if(Math.abs(rows[row]) == n || Math.abs(cols[col]) == n ||
          Math.abs(diag) == n || Math.abs(anti_diag) == n){
         return player;
       }

       return 0;

   }





  public static void main(String args[]){


      int n = 3;
      TicTacToe t = new TicTacToe(n);
      int res = 0;
      res = t.move(0,0,1);
      res = t.move(0,2,2);
      res = t.move(2,2,1);
      res = t.move(1,1,2);
      res = t.move(2,0,1);
      res = t.move(1,0,2);
      res = t.move(2,1,1);
      //res = t.move(1,2,2);
      if(res == 1){
        System.out.println("Player 1 wins");
      }else if(res == 2){
        System.out.println("Player 2 wins");
      }else if(res == 0){
        System.out.println("No one wins");
      }


  }


}
