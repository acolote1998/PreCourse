package se.salt.precourse.firstjavaapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Greeter {
  private static String greet(String namePassedIn) {
    return "Welcome to SALT, " + namePassedIn;
  }

  private static String calculateDate(LocalDate courseStartDate){
    LocalDate actualDate = LocalDate.now();

    long daysLeft = ChronoUnit.DAYS.between(actualDate,courseStartDate);

    return "There are "+daysLeft+" days left until the course starts.";
  }

  public static void main(String[] args) throws IOException {
    System.out.print("What is your name? ");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();

    System.out.print("When does the course start?");

    LocalDate courseStart = LocalDate.parse(reader.readLine());

    String greeting = greet(name);

    System.out.println(greeting);

    String calculatingDaysLeft = calculateDate(courseStart);

    System.out.println(calculatingDaysLeft);
  }
}
