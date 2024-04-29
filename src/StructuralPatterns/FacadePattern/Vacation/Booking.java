package StructuralPatterns.FacadePattern.Vacation;

import java.time.LocalDate;

public class Booking implements Book {


    @Override
    public void book(LocalDate startDate, LocalDate endDate) {
        Book flight = new BookFlight();
        flight.book(startDate, endDate);

        Book carRental = new BookCarRental();
        carRental.book(startDate, endDate);

        Book hotel = new BookHotel();
        hotel.book(startDate, endDate);
    }
}
