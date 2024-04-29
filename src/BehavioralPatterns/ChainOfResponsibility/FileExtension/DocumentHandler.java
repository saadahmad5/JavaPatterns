package BehavioralPatterns.ChainOfResponsibility.FileExtension;

import java.util.NoSuchElementException;

public abstract class DocumentHandler {

    DocumentHandler next;

    public DocumentHandler(DocumentHandler next) {
        this.next = next;
    }

    public void openDocument(String fileExt) {
        if (next != null) {
            this.next.openDocument(fileExt);
        } else {
            System.out.println("No App found to open this file");
        }
    }

}
