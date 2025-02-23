package chapter8;

import java.util.Scanner;

/*

Validate the complexity of a proposed password by assuring it meets
these rules:

At least 8 characters long
Contain an uppercase letter
Contain a special character
Not containing the username
Not containing same as the old password

 */
public class PasswordValidator {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username");
        String username = scanner.next();
        System.out.println("Please enter your current password");
        String currentPassowrd = scanner.next();
        System.out.println("Please enter your new desired password");
        String newPassowrd = scanner.next();

        scanner.close();
    }

    public static boolean isMoreThanEight(String password) {
        char[] passArray = password.toCharArray();

        if (passArray.length >= 8) {
            return true;
        } else return false;
    }

}
