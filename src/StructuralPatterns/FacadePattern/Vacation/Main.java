package StructuralPatterns.FacadePattern.Vacation;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Main {

    public static void main(String[] main) {

        LocalDate startDate = LocalDate.of(1997, 9, 5);
        LocalDate endDate = LocalDate.of(2001, 7, 12);

        Book booking = new Booking();
        booking.book(startDate, endDate);

        long diff = DAYS.between(startDate, endDate);
        System.out.println("Days: " + diff);
        System.out.println("Approx: " + diff/365 + " years, " + diff%365/30 + " months, " + diff%365%30 + " days.");

    }

}
