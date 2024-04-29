package BehavioralPatterns.ChainOfResponsibility.FileExtension;

public class SpreadsheetDocumentHandler extends DocumentHandler {

    public SpreadsheetDocumentHandler(DocumentHandler next) {
        super(next);
    }

    @Override
    public void openDocument(String fileExt) {
        if (fileExt.equals("xlsx")) {
            System.out.println("Opening file using Excel");
        } else {
            super.openDocument(fileExt);
        }
    }

}
