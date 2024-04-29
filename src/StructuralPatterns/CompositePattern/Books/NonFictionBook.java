package StructuralPatterns.CompositePattern.Books;

public class NonFictionBook implements Book {

    @Override
    public void showDetails() {
        System.out.println("Not a Fiction book");
    }
}
