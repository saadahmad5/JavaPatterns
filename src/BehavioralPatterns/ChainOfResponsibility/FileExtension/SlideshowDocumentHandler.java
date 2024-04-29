package BehavioralPatterns.ChainOfResponsibility.FileExtension;

public class SlideshowDocumentHandler extends DocumentHandler {

    public SlideshowDocumentHandler(DocumentHandler next) {
        super(next);
    }

    @Override
    public void openDocument(String fileExt) {
        if (fileExt.equals("pptx")) {
            System.out.println("Opening file using PowerPoint");
        } else {
            super.openDocument(fileExt);
        }
    }

}
