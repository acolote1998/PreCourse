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

        System.out.println("You are now in the cell "+userSlot);

        System.out.println("We will roll the dice for you");

        for(int i=0;i<timesToRoll;i++){
            Random randomNumber = new Random();
            int rolledNumber = randomNumber.nextInt(6)+1;
            System.out.println("Your die number "+(i+1)+" rolled a "+rolledNumber);
            userSlot= userSlot+rolledNumber;

            if(userSlot<20){
                System.out.println("You are now in the cell "+userSlot);
                System.out.println("You need to advance "+(20-userSlot)+" more cells.");
            }
            if(userSlot==20){
                System.out.println("You are now in the cell "+userSlot);
                System.out.println("Congratulations, you have won");
                break;
            }else if ((i==4 && userSlot<20) || (userSlot>20)){
                System.out.println("Sadly, you did not finish on the cell 20. Your end cell was "+userSlot+". You lost");
            }
        }

    }
}
