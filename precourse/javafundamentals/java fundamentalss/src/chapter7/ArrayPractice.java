package chapter7;

import java.util.Random;

public class ArrayPractice {

    static Random randomNumber = new Random();
    static int amountOfTickets = 6;
    static int maximumTicketNumber = 69;


    public static void main(String args[]) {
        //Create a Lottery Quick
        // Pick application that
        // will generate a lottery
        // ticket with 6 random numbers
        // between 1 and 69

        int[] ticket = generateNumbers();

        for (int i = 0; i < amountOfTickets; i++) {
            System.out.print("|" + ticket[i] + "|");
        }
    }

    public static int[] generateNumbers() {
        int[] loteryRandomNumbers = new int[amountOfTickets];

        for (int i = 0; i < amountOfTickets; i++) {
            int newRandomNumber;
            do {
                newRandomNumber = randomNumber.nextInt(maximumTicketNumber) + 1; // Generate new number
            } while (search(loteryRandomNumbers, newRandomNumber));

            loteryRandomNumbers[i] = newRandomNumber; // Assign only after confirming uniqueness
        }
        return loteryRandomNumbers;
    }

    public static boolean search(int[] array, int numberToSearchFor) {
        for (int value : array) {
            if (value == numberToSearchFor) {
                return true;
            }
        }
        return false;
    }

}
