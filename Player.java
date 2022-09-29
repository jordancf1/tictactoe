package tictactoe;

public class Player{
  private static char playerTurn = 'X'; 
  private static int position;

  public static void setTurn(char turn) {
    if (turn == 'X') {
      turn = 'O';
    } else {
      turn = 'X';
    }
    playerTurn = turn;
  }

  public char getTurn(){
    return playerTurn;
  }

  public void setPosition(int pos){
    position = pos - 1;
  }

  public int getPosition(){
    return position;
  }
}