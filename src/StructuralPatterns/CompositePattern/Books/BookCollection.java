package StructuralPatterns.CompositePattern.Books;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements Book {

    public List<Book> books;

    BookCollection() {
        books = new ArrayList<>();
    }

    @Override
    public void showDetails() {
        books.forEach(Book::showDetails);
    }
}
