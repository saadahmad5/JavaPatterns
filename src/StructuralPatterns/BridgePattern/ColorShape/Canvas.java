package StructuralPatterns.BridgePattern.ColorShape;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(640, 480);
        jFrame.add(new Canvas());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public void paint(Graphics graphics) {

        Circle redCircle = new Circle(new RedColorShape());
        redCircle.draw(graphics);

        Square greenSquare = new Square(new GreenColorShape());
        greenSquare.draw(graphics);

        Triangle blueTriangle = new Triangle(new BlueColorShape());
        blueTriangle.draw(graphics);
    }
}
