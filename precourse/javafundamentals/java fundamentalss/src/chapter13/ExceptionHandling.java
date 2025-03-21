package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        //  createNewFile();

        // numbersExceptionHandling();
        try {
            createNewFileRethrow();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            calculateSalary(41);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void calculateSalary(double hours) {
        if (hours > 40) {
            throw new IllegalArgumentException("Overtime not allowed");
        }
    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();

    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);

            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
        }
    }
}
