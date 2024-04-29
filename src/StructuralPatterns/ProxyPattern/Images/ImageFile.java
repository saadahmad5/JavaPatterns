package StructuralPatterns.ProxyPattern.Images;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageFile implements DisplayImage {

    BufferedImage image;

    public ImageFile(String path) {
        image = load(path);
    }

    @Override
    public void display() {
        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon);
        JOptionPane.showMessageDialog(null, label);
    }

    BufferedImage load(String path) {
        System.out.println("Loading " + path + " from disk");
        BufferedImage image = null;

        try {
            image = ImageIO.read(new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return image;
    }
}
