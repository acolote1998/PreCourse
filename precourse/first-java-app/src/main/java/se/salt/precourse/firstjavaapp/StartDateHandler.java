package se.salt.precourse.firstjavaapp;

import java.time.LocalDate;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class StartDateHandler {
    public boolean dateHasOnlyNumbers(String startDateInput) {
        String[] dateParts = startDateInput.split("-");
        for (String part : dateParts) {
            if (!StringUtils.isNumeric(part)) {
                return false;
            }
        }
        return true;
    }

    public LocalDate parseDate(String startDateInput) {
        return LocalDate.parse(startDateInput);
    }
}
