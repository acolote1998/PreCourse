package chapter4;

import java.util.Random;
import java.util.Scanner;

public class RollTheDieGame {
    public static void main(String args[]){

        //The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls
        // - Roll the die for the user (generate random between 1 and 6) and advance the user
        // that number of spaces on the game board

        //After each roll, tell the user which game space they are on and how many more spaces they have to go to win.

        //Repeat this 4 additional times for 5 rolls in total

        //However, if the user gets to 20 before 5 rolls, end the game. They have won

        // If they are greater than or less than 20 spaces exactly, they lose.

        // Remember there are only 20 spaces on the board, so a message like 'You advanced to space 22' is a bug

        int timesToRoll = 5;
        int userSlot=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("We will roll the dice for you");

        for(int i=0;i<timesToRoll;i++){
            Random randomNumber = new Random();
            int rolledNumber = randomNumber.nextInt(6)+1;
            System.out.println("Your die number "+(i+1)+" rolled a "+rolledNumber);
        }

    }
}
