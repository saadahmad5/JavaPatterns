package BehavioralPatterns.ChainOfResponsibility.FileExtension;

public class Client {

    public static void main(String[] args){

        DocumentHandler handler = new SlideshowDocumentHandler(new SpreadsheetDocumentHandler(new TextDocumentHandler(null)));

        handler.openDocument("docx");
        handler.openDocument("xlsx");
        handler.openDocument("pptx");

        //BOGUS
        handler.openDocument("one");

    }

}
