package chapter7;

/*
Make an array that holds the textual values of the days of the week

Have the user input a number corresponding to the day of the week.
Assume that the week starts on monday

Your program should output the String that represents the day of the week

Example: User inputs the number 1, your program should print "Monday"
 */

import java.util.Scanner;

public class DaysOfTheWeek {

    private static String days[] = new String[7];

    private static Scanner scanner = new Scanner(System.in);

    private static int numberToConvert;

    public static void main(String args[]) {
        initialiseArray(days);

        do {
            System.out.println("Please write a number from 1 to 7 and we will assign a day to you");

            numberToConvert = scanner.nextInt();
        }
        while (numberToConvert < 1 || numberToConvert > 7);

        System.out.println("The day of the week for your number is " + returnDayString(numberToConvert));
    }

    public static void initialiseArray(String[] array) {
        array[0] = "Monday";
        array[1] = "Tuesday";
        array[2] = "Wednesday";
        array[3] = "Thursday";
        array[4] = "Friday";
        array[5] = "Saturday";
        array[6] = "Sunday";
    }

    public static String returnDayString(int number) {
        return days[(number - 1)];
    }

}
