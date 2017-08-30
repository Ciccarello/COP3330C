/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import java.util.Scanner;

public class Player {

    Scanner input = new Scanner(System.in);
    private String name = "MissingNo.";
    private int userInput;
    //private int lastSelection = 0;

    public void setName() {
        System.out.printf("What is your name?");
        name = input.next();
        //name = newName;
    }

    public String getName() {
        return name;
    }

    public GameBoard requestInput(GameBoard activeGameBoard) {
        System.out.printf("\nPlease enter a value between 1 and 9.\n");

        userInput = input.nextInt();

        if (((userInput < 1) || (userInput > 9))) {
            System.out.printf("\nError invalid input, please try again.\n");
            requestInput(activeGameBoard);
        }
        
        
       //System.out.printf("\n\n"+userInput+activeGameBoard.getPosition(userInput)+userInput+"\n\n");//debug to see what is currently in a position on the board
        if (activeGameBoard.getPosition(userInput) != ' ')
        {
            System.out.printf("\nSomeone is already there, please try again.\n");
            requestInput(activeGameBoard);
        }

        activeGameBoard.setPosition(userInput, 'X');
        return activeGameBoard;
    }
}
