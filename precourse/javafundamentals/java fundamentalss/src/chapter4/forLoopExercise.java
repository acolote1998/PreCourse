package chapter4;

import java.util.Scanner;

public class forLoopExercise {
    public static void main(String args[]){
        //Write a for loop that allows a cashier to scan a given
        // number of items, and sum up the total cost

        Scanner scanner = new Scanner(System.in);
        int quantity;
        double totalPrice=0;
        double itemPrice=0;

        System.out.println("Please introduce the number of items you will scan");
        quantity = scanner.nextInt();

        for (int i=0;i<quantity;i++){
        System.out.println("Please introduce the price of the item number "+(i+1));
        itemPrice=scanner.nextDouble();
        totalPrice=totalPrice+itemPrice;
        }

        System.out.println("Thank you for your cooperation");
        System.out.println("The total to pay is "+totalPrice+" SEK");

    }
}
