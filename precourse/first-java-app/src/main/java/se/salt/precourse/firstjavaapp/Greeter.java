package se.salt.precourse.firstjavaapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
@SpringBootApplication
public class Greeter implements CommandLineRunner {
@Autowired
StartDateHandler startDateHandler;

  public static void main(String[] args) throws IOException {
    SpringApplication.run(Greeter.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("What is your name? ");
    String name = reader.readLine();
    System.out.println("Welcome to SALT, " + name);

    System.out.print("When does the course start? ");
    String startDateInput = reader.readLine();

    if (startDateHandler.dateHasOnlyNumbers(startDateInput)) {
      LocalDate courseStart = startDateHandler.parseDate(startDateInput);

      DateCalculator calculator = new DateCalculator();
      String daysLeftMessage = calculator.calculateDate(courseStart);

      System.out.println(daysLeftMessage);
    } else {
      System.out.println("Please provide a valid date.");
    }
  }
}
