package StructuralPatterns.FacadePattern.Vacation;

import java.time.LocalDate;

public interface Book {

    public void book(LocalDate startDate, LocalDate endDate);

}
