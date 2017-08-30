package TicTacToe;

public class TicTacToe {

    public static void main(String[] args) {
        //char x = 'O';
        
        //if ((x == 'X') && (x == 'X') && (x == 'X')) {
          //  System.out.printf("True");
        
        Game gameStart = new Game();
        gameStart.setupGame();
        gameStart.gamePlay();

    }

}
