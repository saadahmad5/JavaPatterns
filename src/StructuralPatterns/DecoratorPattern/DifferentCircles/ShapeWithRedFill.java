package StructuralPatterns.DecoratorPattern.DifferentCircles;

import java.awt.*;

public class ShapeWithRedFill implements Shape {

    Shape shape;

    ShapeWithRedFill(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw(Graphics graphics) {
        System.out.println("Overriding Red fill Circle");
        graphics.setColor(Color.red);
        shape.draw(graphics);
        System.out.println("Reverting Red fill Circle");
        graphics.setColor(Color.white);
    }
}
