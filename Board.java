package tictactoe;

public class Board{
  private static char[] board = {'1','|','2','|','3','\n','-','+','-','+','-','\n','4','|','5',
                                  '|','6','\n','-','+','-','+','-','\n','7','|','8','|','9','\n'};
  private static int[] posToIndex = {0, 2, 4, 12, 14, 16, 24, 26, 28};

  public static boolean checkBoard(int position) {
    if (
      board[posToIndex[position]] == 'X' 
      ||
      board[posToIndex[position]] == 'O'
      ) {
      return true;
  } 
  return false;
}

public char[] getBoard(){
  return board;
}

public void setBoardSpot(int pos, char turn){
  board[posToIndex[pos]] = turn;
}

public char getBoardSpot(int pos){
  return board[posToIndex[pos]];
}

}