package chapter4;

import java.util.Scanner;

public class FindLetterA {
    public static void main(String args[]){
        // Loop break
        // Search a string to determine if it contains the letter 'A'
        boolean letterFound = false;
        String text = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write down a text and lets find out if it contains the letter A");
        text=scanner.nextLine();

        for (int i=0;i<text.length();i++){
        char currentLetter = text.charAt(i);
            if (currentLetter =='A' || currentLetter=='a'){
             letterFound=true;
             break;
            }
        }

        if (letterFound){
            System.out.println("The text contains the letter 'A' at some point");
        }else System.out.println("The text does not contain the letter 'A'");

    }
}
