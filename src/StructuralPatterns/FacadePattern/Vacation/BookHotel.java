package StructuralPatterns.FacadePattern.Vacation;

import java.time.LocalDate;

public class BookHotel implements Book {

    @Override
    public void book(LocalDate startDate, LocalDate endDate) {
        System.out.printf("Hotel booked from %s to %s\n", startDate, endDate);
    }
}
