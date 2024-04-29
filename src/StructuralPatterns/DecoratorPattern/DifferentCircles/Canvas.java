package StructuralPatterns.DecoratorPattern.DifferentCircles;

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

        graphics.setColor(Color.white);

        // Normal Circle
        Shape circle1 = new Circle(25, 15);
        circle1.draw(graphics);

        // Red Circle Decorator
        Shape circle2 = new Circle(100, 15);
        circle2 = new ShapeWithRedFill(circle2);
        circle2.draw(graphics);

        // Yellow Circle Decorator
        Shape circle3 = new Circle(175, 15);
        circle3 = new ShapeWithYellowFill(circle3);
        circle3.draw(graphics);

    }

}
