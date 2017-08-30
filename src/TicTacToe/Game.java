/*
//Finished difficulty 1 and 2.
need to create level system. Beat level 1 go to level 2. Fail a level and the game ends.
Beg for help on the AI.
 */
package TicTacToe;

import java.security.SecureRandom;
import java.util.Random;

public class Game {

    GameBoard newGameBoard = new GameBoard(); //Why does new make a difference. What does new mean

    /*public int gameStatus(int gameStatusValue) {
        switch (gameStatusValue) {
            case 0: //Game unstarted
            {
                //If game won
                //gameStatusValue = 3
                //Call GameStatus to move onto next round or end game           
            }
        }
    }*/
    
        Player newPlayer = new Player();
        CPUopponent newCPU = new CPUopponent();
        int currentDifficulty = 1;
        
        public void setupGame()
    {
        newPlayer.setName();

        //public int gameStatusValue = 0;
        System.out.printf("\nWelcome " + newPlayer.getName() + " to TicTacToe\n");
    }

    public void gamePlay() {
        newGameBoard.resetBoard();
        newGameBoard.displayBoard();

        int i = 0;
        boolean resultDraw = true;

        while (i < 5) {
            newGameBoard = newPlayer.requestInput(newGameBoard);
            newGameBoard.displayBoard();
            if (winCondition()) {
                System.out.printf("You won!");
                resultDraw = false;
                break;
            }

            if (i < 4) { //Boggy way to allow the player a final turn without CPU getting stuck trying to find a spot
                switch (currentDifficulty) {
                    case 1: {
                        newGameBoard = newCPU.difficulty1(newGameBoard);
                        break;
                    }
                    case 2: {
                        newGameBoard = newCPU.difficulty2(newGameBoard);
                        break;
                    }
                    case 3: {
                        newGameBoard = newCPU.difficulty1(newGameBoard);
                        break;
                    }
                    default:
                        System.out.printf("Error selecting difficulty");

                }
                newGameBoard.displayBoard();
                if (CPUwinCondition()) {
                    System.out.printf("You lost");
                    resultDraw = false;
                    break;
                }
            }
            i++;
        }
        if (resultDraw) { //If neither player nor cpu wins, it defaults to a draw
            System.out.printf("Draw");
        }
        //newGameBoard.setPosition(1,'X');
        /*boolean neverEnd = true; //Debug code intended for running commands mid-game
        while(neverEnd)
        {
            //System.out.printf(" ");
        }*/
    }
//public GameBoard difficulty1(GameBoard activeGameBoard) {
//}

    public boolean winCondition() {
        //All possible win conditions
        //Order of conditions rows, columns, diaganols
        //System.out.printf(" " + newGameBoard.getPosition(1) + newGameBoard.getPosition(2) + newGameBoard.getPosition(3)); //Debug code to ensure getPosition is pulling the correct information
        if ((newGameBoard.getPosition(1) == 'X') && (newGameBoard.getPosition(2) == 'X') && (newGameBoard.getPosition(3) == 'X')) {
            return true;
        }
        if ((newGameBoard.getPosition(4) == 'X') && (newGameBoard.getPosition(5) == 'X') && (newGameBoard.getPosition(6) == 'X')) {
            return true;
        }
        if ((newGameBoard.getPosition(7) == 'X') && (newGameBoard.getPosition(8) == 'X') && (newGameBoard.getPosition(9) == 'X')) {
            return true;
        }
        if ((newGameBoard.getPosition(1) == 'X') && (newGameBoard.getPosition(4) == 'X') && (newGameBoard.getPosition(7) == 'X')) {
            return true;
        }
        if ((newGameBoard.getPosition(2) == 'X') && (newGameBoard.getPosition(5) == 'X') && (newGameBoard.getPosition(8) == 'X')) {
            return true;
        }
        if ((newGameBoard.getPosition(3) == 'X') && (newGameBoard.getPosition(6) == 'X') && (newGameBoard.getPosition(9) == 'X')) {
            return true;
        }
        if ((newGameBoard.getPosition(1) == 'X') && (newGameBoard.getPosition(5) == 'X') && (newGameBoard.getPosition(9) == 'X')) {
            return true;
        }
        if ((newGameBoard.getPosition(3) == 'X') && (newGameBoard.getPosition(5) == 'X') && (newGameBoard.getPosition(7) == 'X')) {
            return true;
        }
        return false;
    }

    public boolean CPUwinCondition() {//CPU win conditions
        if ((newGameBoard.getPosition(1) == 'O') && (newGameBoard.getPosition(2) == 'O') && (newGameBoard.getPosition(3) == 'O')) {
            return true;
        }
        if ((newGameBoard.getPosition(4) == 'O') && (newGameBoard.getPosition(5) == 'O') && (newGameBoard.getPosition(6) == 'O')) {
            return true;
        }
        if ((newGameBoard.getPosition(7) == 'O') && (newGameBoard.getPosition(8) == 'O') && (newGameBoard.getPosition(9) == 'O')) {
            return true;
        }
        if ((newGameBoard.getPosition(1) == 'O') && (newGameBoard.getPosition(4) == 'O') && (newGameBoard.getPosition(7) == 'O')) {
            return true;
        }
        if ((newGameBoard.getPosition(2) == 'O') && (newGameBoard.getPosition(5) == 'O') && (newGameBoard.getPosition(8) == 'O')) {
            return true;
        }
        if ((newGameBoard.getPosition(3) == 'O') && (newGameBoard.getPosition(6) == 'O') && (newGameBoard.getPosition(9) == 'O')) {
            return true;
        }
        if ((newGameBoard.getPosition(1) == 'O') && (newGameBoard.getPosition(5) == 'O') && (newGameBoard.getPosition(9) == 'O')) {
            return true;
        }
        if ((newGameBoard.getPosition(3) == 'O') && (newGameBoard.getPosition(5) == 'O') && (newGameBoard.getPosition(7) == 'O')) {
            return true;
        }
        

        return false; //If no win conidition found, return false to continue the game.
    }

}
