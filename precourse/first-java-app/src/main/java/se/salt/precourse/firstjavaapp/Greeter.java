package se.salt.precourse.firstjavaapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Greeter implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(Greeter.class, args);
  }

  @Override
  public void run(String... args) throws IOException {
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

  private static String greet(String namePassedIn) {
    return "Welcome to SALT, " + namePassedIn;
  }

  private static String calculateDate(LocalDate courseStartDate) {
    LocalDate actualDate = LocalDate.now();
    long daysLeft = ChronoUnit.DAYS.between(actualDate, courseStartDate);
    return "There are " + daysLeft + " days left until the course starts.";
  }

  private static boolean dateHasOnlyNumbers(String startDateInput) {
    String[] dateParts = startDateInput.split("-");
    for (String datePart : dateParts) {
      if (!StringUtils.isNumeric(datePart)) {
        return false;
      }
    }
    return true;
  }
}
