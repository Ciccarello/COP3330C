package TicTacToe;

import java.security.SecureRandom;
import java.util.Random;
import java.lang.*;
import java.util.concurrent.TimeUnit; //Used when testing random values
import jdk.nashorn.internal.ir.BreakNode;

public class CPUopponent {

    public boolean CPUwinCondition(GameBoard activeGameBoard) {//CPU win conditions
        if ((activeGameBoard.getPosition(1) == 'O') && (activeGameBoard.getPosition(2) == 'O') && (activeGameBoard.getPosition(3) == 'O')) {
            return true;
        }
        if ((activeGameBoard.getPosition(4) == 'O') && (activeGameBoard.getPosition(5) == 'O') && (activeGameBoard.getPosition(6) == 'O')) {
            return true;
        }
        if ((activeGameBoard.getPosition(7) == 'O') && (activeGameBoard.getPosition(8) == 'O') && (activeGameBoard.getPosition(9) == 'O')) {
            return true;
        }
        if ((activeGameBoard.getPosition(1) == 'O') && (activeGameBoard.getPosition(4) == 'O') && (activeGameBoard.getPosition(7) == 'O')) {
            return true;
        }
        if ((activeGameBoard.getPosition(2) == 'O') && (activeGameBoard.getPosition(5) == 'O') && (activeGameBoard.getPosition(8) == 'O')) {
            return true;
        }
        if ((activeGameBoard.getPosition(3) == 'O') && (activeGameBoard.getPosition(6) == 'O') && (activeGameBoard.getPosition(9) == 'O')) {
            return true;
        }
        if ((activeGameBoard.getPosition(1) == 'O') && (activeGameBoard.getPosition(5) == 'O') && (activeGameBoard.getPosition(9) == 'O')) {
            return true;
        }
        if ((activeGameBoard.getPosition(3) == 'O') && (activeGameBoard.getPosition(5) == 'O') && (activeGameBoard.getPosition(7) == 'O')) {
            return true;
        }

        return false; //If no win conidition found, return false to continue the game.
    }

    public GameBoard difficulty1(GameBoard activeGameBoard) {

        Random rand = new SecureRandom();
        int randomCPUselection;
        do { //Unable to figure out how to remove 0 from the pool of possible number, so forced program to reroll random if it lands on 0.
            randomCPUselection = rand.nextInt(10);
            System.out.printf("CPU selected: " + randomCPUselection + "\n");

        } while (randomCPUselection == 0);

        //Check to see if spot is already taken
        if (activeGameBoard.getPosition(randomCPUselection) != ' ') //If CPU selects a position other than an empty one it will recussively continue to reguess.
        {
            //System.out.printf("Before the reroll"); //debug code
            difficulty1(activeGameBoard);
            //System.out.printf("After the reroll");

        } else {
            activeGameBoard.setPosition(randomCPUselection, 'O');
        }

        //System.out.printf("\nrandom move executed\n");
        return activeGameBoard;
    }

    public GameBoard difficulty2(GameBoard activeGameBoard) {

        //check each spot for a whitespace. check win condition if it would succeed. Do move. Else, move onto random.
        boolean foundWinningMove = false;
        for (int i = 1; i < 10; i++) {
            if (activeGameBoard.getPosition(i) == ' ') {
                System.out.printf("In position " + i + " is " + activeGameBoard.getPosition(i));
                activeGameBoard.setPosition(i, 'O');
                if (CPUwinCondition(activeGameBoard)) {
                    System.out.printf("CPU won!");
                    foundWinningMove = true;
                    i = 99;
                } else {
                    System.out.printf("this should be resetting the position");
                    activeGameBoard.setPosition(i, ' ');
                }

            }

        }
        //if no winning match found, call difficulty 1
        if (!foundWinningMove) {
            difficulty1(activeGameBoard);
        }
        return activeGameBoard;
    }

}
