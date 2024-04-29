package StructuralPatterns.FacadePattern.Vacation;

import java.time.LocalDate;

public class BookFlight implements Book {

    @Override
    public void book(LocalDate startDate, LocalDate endDate) {
        System.out.printf("Flight booked from %s to %s\n", startDate, endDate);
    }
}
