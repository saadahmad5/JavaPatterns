package StructuralPatterns.DecoratorPattern.DifferentCircles;

import java.awt.*;

public class ShapeWithYellowFill implements Shape {

    Shape shape;

    ShapeWithYellowFill(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw(Graphics graphics) {
        System.out.println("Overriding Yellow fill Circle");
        graphics.setColor(Color.yellow);
        shape.draw(graphics);
        System.out.println("Reverting Yellow fill Circle");
        graphics.setColor(Color.yellow);
    }
}
