package tictactoe;

public class Winner{


  public static boolean checkWinner(int depth,char[] board, Board newBoard) {

    char winner = '?';
    for (int i = 0; i < 3; i++){
      if (newBoard.getBoardSpot(i) == newBoard.getBoardSpot(i + 3) 
            && newBoard.getBoardSpot(i + 3) == newBoard.getBoardSpot(i + 6)) {
        winner = newBoard.getBoardSpot(i);
        break;
      }
    }
    if(winner == '?'){
      if (newBoard.getBoardSpot(0) == newBoard.getBoardSpot(4) 
        && newBoard.getBoardSpot(4) == newBoard.getBoardSpot(8)){
        winner = newBoard.getBoardSpot(0);
    }
      if (newBoard.getBoardSpot(2) == newBoard.getBoardSpot(4) 
        && newBoard.getBoardSpot(4) == newBoard.getBoardSpot(6)){
        winner = newBoard.getBoardSpot(2);
    }
    }

    if(winner == '?'){
      for (int i = 0; i <= 6; i+=3){
        if (newBoard.getBoardSpot(i) == newBoard.getBoardSpot(i + 1) 
          && newBoard.getBoardSpot(i + 1) == newBoard.getBoardSpot(i + 2)) {
          winner = newBoard.getBoardSpot(i);
          break;
        }
      }
    }
    if (depth == 9) {
      System.out.println("The Game was a Tie!");
      System.exit(0);
    } else if (winner != '?'){
      System.out.println("The winner is " + winner);
      System.exit(0);
    } 
    return true;
  }
}