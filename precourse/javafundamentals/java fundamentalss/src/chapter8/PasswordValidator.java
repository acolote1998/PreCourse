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

        verifyingPassword(newPassowrd, currentPassowrd, username);

    }

    public static boolean isMoreThanEight(String password) {
        char[] passArray = password.toCharArray();

        if (passArray.length >= 8) {
            return true;
        } else return false;
    }

    public static boolean containsUppercase(String password) {
        char[] passArray = password.toCharArray();
        boolean containsUppercase = false;

        for (int i = 0; i < passArray.length; i++) {
            if (String.valueOf(passArray[i]).equals(String.valueOf(passArray[i]).toUpperCase())) {
                containsUppercase = true;
                break;

            }
        }
        return containsUppercase;
    }

    public static boolean containsLowercase(String password) {
        char[] passArray = password.toCharArray();
        boolean containsLowercase = false;

        for (int i = 0; i < passArray.length; i++) {
            if (String.valueOf(passArray[i]).equals(String.valueOf(passArray[i]).toLowerCase())) {
                containsLowercase = true;
                break;

            }
        }
        return containsLowercase;
    }

    public static boolean containsAnotherString(String desiredPassword, String toBeTheContent) {
        return desiredPassword.contains(toBeTheContent);
    }

    public static boolean containsSpecialCharacters(String desiredPassword) {
        boolean containsSpecialCharacter = false;
        char[] charArray = desiredPassword.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (!Character.isLetterOrDigit(charArray[i])) {
                containsSpecialCharacter = true;
                break;
            }
        }
        return containsSpecialCharacter;
    }

    public static void verifyingPassword(String password, String currentPassword, String currentUsername) {
        if (!isMoreThanEight(password)) {
            System.out.println("Your password is not at least 8 characters long");
        }

        if (!containsUppercase(password)) {
            System.out.println("Your password does not contain an uppercase character");
        }

        if (!containsLowercase(password)) {
            System.out.println("Your password does not contain a lowercase character");
        }

        if (!containsSpecialCharacters(password)) {
            System.out.println("Your password does not contain a special character");
        }

        if (containsAnotherString(password, currentPassword)) {
            System.out.println("Your new password cannot contain your current password");
        }

        if (containsAnotherString(password, currentUsername)) {
            System.out.println("Your new password cannot contain your current username");
        }

        if (isMoreThanEight(password) && containsUppercase(password) && containsLowercase(password)
                && containsSpecialCharacters(password) && !containsAnotherString(password, currentPassword)
                && !containsAnotherString(password, currentUsername)) {
            System.out.println("Your new password meets all the required criteria!");
        }
    }


}
