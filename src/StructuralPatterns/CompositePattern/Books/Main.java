package StructuralPatterns.CompositePattern.Books;

public class Main {

    public static void main(String[] args) {

        Book fictionBook = new FictionBook();
        Book nonFictionBook = new NonFictionBook();

        BookCollection bookCollection = new BookCollection();
        bookCollection.books.add(fictionBook);
        bookCollection.books.add(nonFictionBook);

        bookCollection.showDetails();

    }

}
