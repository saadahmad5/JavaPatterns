package StructuralPatterns.ProxyPattern.Images;

public class ImageFileProxy implements DisplayImage {

    String filePath;

    ImageFile imageFile;

    ImageFileProxy(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void display() {
        if (imageFile == null) {
            imageFile = new ImageFile(filePath);
        }

        imageFile.display();
    }
}
