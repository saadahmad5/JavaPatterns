package StructuralPatterns.CompositePattern.Books;

public class FictionBook implements Book {

    @Override
    public void showDetails() {
        System.out.println("Fiction Book");
    }
}
