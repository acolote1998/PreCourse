package se.salt.precourse.firstjavaapp;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateCalculator {
    public String calculateDate(LocalDate courseStartDate) {
        LocalDate actualDate = LocalDate.now();
        long daysLeft = ChronoUnit.DAYS.between(actualDate, courseStartDate);
        return "There are " + daysLeft + " days left until the course starts.";
    }
}
