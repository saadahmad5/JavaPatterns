package BehavioralPatterns.ChainOfResponsibility.FileExtension;

public class TextDocumentHandler extends DocumentHandler {

    public TextDocumentHandler(DocumentHandler next) {
        super(next);
    }

    @Override
    public void openDocument(String fileExt) {
        if (fileExt.equals("docx")) {
            System.out.println("Opening file using Word");
        } else {
            super.openDocument(fileExt);
        }
    }

}
