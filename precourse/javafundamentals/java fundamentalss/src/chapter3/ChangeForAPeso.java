package chapter3;

import java.util.Scanner;

public class ChangeForAPeso {
    public static void main(String args[]){
        //The objective of the game is to enter enough change
        //to exactly 1 peso. Create a program that asks a user to
        //enter quantities for the following coins:
        //1 cent, 5 cents, 25 cents, 50 cents
        //If it is exactly 1 peso, they win. If it is more tell them
        //by how much, and if it is less than 1 peso, tell them by how much.

        int oneCent, fiveCents, twentyFiveCents, fiftyCents;
        int goal = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.println("We have to collect enough coins to reach one peso.");

        System.out.println("Please enter how many 1 cent coins you own:");
        oneCent = scanner.nextInt();

        System.out.println("Please enter how many 5 cent coins you own:");
        fiveCents = scanner.nextInt();

        System.out.println("Please enter how many 25 cent coins you own:");
        twentyFiveCents = scanner.nextInt();

        System.out.println("Please enter how many 50 cent coins you own:");
        fiftyCents = scanner.nextInt();

    }
}
