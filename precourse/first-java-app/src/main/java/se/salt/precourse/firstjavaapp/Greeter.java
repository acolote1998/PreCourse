package se.salt.precourse.firstjavaapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import org.apache.commons.lang3.StringUtils;

public class Greeter {
  private static String greet(String namePassedIn) {
    return "Welcome to SALT, " + namePassedIn;
  }

  private static String calculateDate(LocalDate courseStartDate){
    LocalDate actualDate = LocalDate.now();

    long daysLeft = ChronoUnit.DAYS.between(actualDate,courseStartDate);

    return "There are "+daysLeft+" days left until the course starts.";
  }

  private static boolean dateHasOnlyNumbers(String startDateInput){
    String[] dateparts = startDateInput.split("-");
    for(String datePart : dateparts){
      if (!StringUtils.isNumeric(datePart)){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) throws IOException {
    System.out.print("What is your name? ");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();

    System.out.print("When does the course start? ");
    String startDateInput = reader.readLine();

    String greeting = greet(name);
    System.out.println(greeting);

    if (dateHasOnlyNumbers(startDateInput)) {
      LocalDate courseStart = LocalDate.parse(startDateInput);
      String calculatingDaysLeft = calculateDate(courseStart);
      System.out.println(calculatingDaysLeft);
    } else {
      System.out.println("Please provide a valid date");
    }

  }
}

