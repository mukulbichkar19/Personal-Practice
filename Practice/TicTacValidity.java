public class TicTacValidity{

  private static char X = 'X';
  private static char O = 'Y';

  private static int[][] win = {{0,1,2}, // First row win combination
                              {3,4,5}, // Second row win combination
                              {6,7,8}, // Third row win combination
                              {0,3,6}, // First col win combination
                              {1,4,7}, // Second col win combination
                              {2,5,8}, // Third col win combination
                              {0,4,8}, // Diagonal win combination
                              {2,4,6}}; //Diagonal 2 win combination


  private static boolean isWin(char[] board, char c){

    for(int i=0;i<8;i++){
      if(board[win[i][0]] == c &&
         board[win[i][1]] == c &&
         board[win[i][2]] == c){
           return true;
         }
    }
    return false;
  }



  private static boolean isValid(char[] board){

      int xCount = 0;
      int oCount = 0;

      for(int i=0;i<board.length;i++){
        if(board[i] == X){ xCount++; }
        if(board[i] == O){ oCount++; }
      }

      // Cond 1: Count of X equals count of O or Count of X is 1 more than Count of O
      if(xCount == oCount || xCount == oCount+1){

        // Check if O wins in any of the winning combinations
        if(isWin(board, O)){

          // If X also wins then it is an invalid combination
          if(isWin(board, X)){
            return false;
          }

          // Return true is xCount is equal to oCount
          return (xCount == oCount);
        }

        // If X wins,then count of x must be greater than o
        if(isWin(board, X) && xCount!=oCount+1){
          return false;
        }
        // X wins with valid O
        return true;
      }
      return false;
  }



  public static void main(String args[]){

    char[] board = {X,O,O,
                    X,O,X,
                    X,O,X};

    if(isValid(board)){
      System.out.println("It's a valid tic tac toe configuration");
    }else{
      System.out.println("Not a valid tic tac toe configuration");
    }


  }


}
