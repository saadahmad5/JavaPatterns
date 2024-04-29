package StructuralPatterns.ProxyPattern.Images;

public class ImageGallery {

    public static void main(String[] args) {

    // Without Proxy Pattern
    //        DisplayImage image1 = new ImageFile("src/StructuralPatterns.ProxyPattern/Images/resources/image1.jpeg");
    //        DisplayImage image2 = new ImageFile("src/StructuralPatterns.ProxyPattern/Images/resources/image2.jpeg");
    //        DisplayImage image3 = new ImageFile("src/StructuralPatterns.ProxyPattern/Images/resources/image3.jpeg");
    //        DisplayImage image4 = new ImageFile("src/StructuralPatterns.ProxyPattern/Images/resources/image4.jpeg");
    //
    //        image1.display();
    //        image2.display();
    //        image3.display();
    //        image4.display();

    // With Proxy Pattern
        DisplayImage image1 = new ImageFileProxy("src/StructuralPatterns.ProxyPattern/Images/resources/image1.jpeg");
        DisplayImage image2 = new ImageFileProxy("src/StructuralPatterns.ProxyPattern/Images/resources/image2.jpeg");
        DisplayImage image3 = new ImageFileProxy("src/StructuralPatterns.ProxyPattern/Images/resources/image3.jpeg");
        DisplayImage image4 = new ImageFileProxy("src/StructuralPatterns.ProxyPattern/Images/resources/image4.jpeg");

        image1.display();
        image2.display();
        image3.display();
        image4.display();

    }

}
