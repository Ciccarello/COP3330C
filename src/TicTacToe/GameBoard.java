package TicTacToe;

import java.util.Scanner;

public class GameBoard {

    char[][] gameBoardArray = new char[3][3];

    public GameBoard() {
        //char gameBoardArray[][] = new char[3][3];

    }

    public void resetBoard() //Pre-fills the gameboard with white space values
    {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                gameBoardArray[x][y] = ' ';
            }
        }
    }

    public void setPosition(int userPosInput, char moveSelection) {
        switch (userPosInput) {
            case 1: {
                gameBoardArray[0][0] = moveSelection;
                System.out.printf("\nuserPosInput:  "+userPosInput+" moveSelector: "+moveSelection);
                break;
            }
            case 2: {
                gameBoardArray[0][1] = moveSelection;
                System.out.printf("\nuserPosInput:  "+userPosInput+" moveSelector: "+moveSelection+"\n");
                break;
            }
            case 3: {
                gameBoardArray[0][2] = moveSelection;
                System.out.printf("\nuserPosInput:  "+userPosInput+" moveSelector: "+moveSelection+"\n");
                break;
            }
            case 4: {
                gameBoardArray[1][0] = moveSelection;
                System.out.printf("\nuserPosInput:  "+userPosInput+" moveSelector: "+moveSelection+"\n");
                break;
            }
            case 5: {
                gameBoardArray[1][1] = moveSelection;
                System.out.printf("\nuserPosInput:  "+userPosInput+" moveSelector: "+moveSelection+"\n");
                break;
            }
            case 6: {
                gameBoardArray[1][2] = moveSelection;
                System.out.printf("\nuserPosInput:  "+userPosInput+" moveSelector: "+moveSelection+"\n");
                break;
            }
            case 7: {
                gameBoardArray[2][0] = moveSelection;
                System.out.printf("\nuserPosInput:  "+userPosInput+" moveSelector: "+moveSelection+"\n");
                break;
            }
            case 8: {
                gameBoardArray[2][1] = moveSelection;
                System.out.printf("\nuserPosInput:  "+userPosInput+" moveSelector: "+moveSelection+"\n");
                break;
            }
            case 9: {
                gameBoardArray[2][2] = moveSelection;
                System.out.printf("\nuserPosInput:  "+userPosInput+" moveSelector: "+moveSelection+"\n");
                break;
            }
            default:
                System.out.printf("setPosition default text");
        }
    }

    public char getPosition(int inputPosition) {
        switch (inputPosition) {
            case 1:
                return gameBoardArray[0][0];
            case 2:
                return gameBoardArray[0][1];
            case 3:
                return gameBoardArray[0][2];
            case 4:
                return gameBoardArray[1][0];
            case 5:
                return gameBoardArray[1][1];
            case 6:
                return gameBoardArray[1][2];
            case 7:
                return gameBoardArray[2][0];
            case 8:
                return gameBoardArray[2][1];
            case 9:
                return gameBoardArray[2][2];
            default: {
                System.out.printf("Error retrieving board position");
                return '#';
            }

        }

    }

    public void displayBoard() {
        System.out.printf("\n\n\nGame Board:\tPositions:\n");
        System.out.println(" " + gameBoardArray[0][0] + " | " + gameBoardArray[0][1] + " | " + gameBoardArray[0][2] + "\t 1 | 2 | 3 ");
        System.out.println("-----------\t-----------");
        System.out.println(" " + gameBoardArray[1][0] + " | " + gameBoardArray[1][1] + " | " + gameBoardArray[1][2] + "\t 4 | 5 | 6 ");
        System.out.println("-----------\t-----------");
        System.out.println(" " + gameBoardArray[2][0] + " | " + gameBoardArray[2][1] + " | " + gameBoardArray[2][2] + "\t 7 | 8 | 9 ");
        /* //Empty
        System.out.println("   |   |   \t 1 | 2 | 3 ");
        System.out.println("-----------\t-----------");
        System.out.println("   |   |   \t 4 | 5 | 6 ");
        System.out.println("-----------\t-----------");
        System.out.println("   |   |   \t 7 | 8 | 9 ");
         */
    }

    public void setPos(int x, int y, char input) {
        if ((x > 2) || (x < 0) || (y > 2) || (y < 0)) {
            //invalid parameters
            return;
        }

    }

}
