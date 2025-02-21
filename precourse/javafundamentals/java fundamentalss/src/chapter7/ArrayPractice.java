package chapter7;

import java.util.Random;

public class ArrayPractice {
    public static void main(String args[]) {
        //Create a Lottery Quick
        // Pick application that
        // will generate a lottery
        // ticket with 6 random numbers
        // between 0 and 69

        Random randomNumber = new Random();

        int[] loteryRandomNumbers = {randomNumber.nextInt(70), randomNumber.nextInt(70), randomNumber.nextInt(70), randomNumber.nextInt(70), randomNumber.nextInt(70), randomNumber.nextInt(70)};

        for (int i = 0; i < loteryRandomNumbers.length; i++) {
            System.out.println("Number " + (i + 1) + " " + loteryRandomNumbers[i]);
        }

    }

}
