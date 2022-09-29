package tictactoe;
import java.util.Scanner;

public class Game{

    private int depth = 0;
    private Player newPlayer = new Player();
    private Board newBoard = new Board();
    private Winner newWinner = new Winner();
    private Scanner input = new Scanner(System.in); 

    public void startGame(){

        System.out.println(newBoard.getBoard());
        System.out.println("Turn = " + newPlayer.getTurn());

        while(newWinner.checkWinner(depth, newBoard.getBoard(), newBoard)){
            System.out.print("Enter position between 1 and 9:\n");
            newPlayer.setPosition(input.nextInt());

            if(newPlayer.getPosition() > newBoard.getBoard().length){
                System.out.println("Error - out of bounds");
            } else {
                if(newBoard.checkBoard(newPlayer.getPosition())){
                    System.out.println("Illegal move! Try again");
                } else {
                    depth++;
                    newBoard.setBoardSpot(newPlayer.getPosition(), newPlayer.getTurn());
                    System.out.println(newBoard.getBoard());
                    newPlayer.setTurn(newPlayer.getTurn());
                    if(depth != 9){
                        System.out.println("Turn = " + newPlayer.getTurn());
                    }
                }
            }

        }
        newPlayer.setTurn(newPlayer.getTurn());
        System.out.println("Winner = " + newPlayer.getTurn());
    }
}