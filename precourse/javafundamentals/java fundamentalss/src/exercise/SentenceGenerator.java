package exercise;

import java.util.Scanner;

public class SentenceGenerator {
    public static void main(String arg[]){


        //Taks:
        //Create a program that asks a user for a season of the year
        //then a whole number, then an adjective. Use input to complete the
        // sentence below then output the result:

        //"On a [adjective] [season of the year] day, I drink a minimum
        // of [whole number] cups of coffee."

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write a season of the year");
        String season = scanner.next();

    }
}
