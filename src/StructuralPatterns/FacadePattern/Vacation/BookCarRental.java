package StructuralPatterns.FacadePattern.Vacation;

import java.time.LocalDate;

public class BookCarRental implements Book {

    public void book(LocalDate startDate, LocalDate endDate) {
        System.out.printf("Car rental booked from %s to %s\n", startDate, endDate);
    }

}
