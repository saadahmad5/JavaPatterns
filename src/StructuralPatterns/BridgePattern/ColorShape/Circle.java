package StructuralPatterns.BridgePattern.ColorShape;

import java.awt.*;

public class Circle extends Shape {

    ColorShape colorShape;

    Circle(ColorShape colorShape) {
        this.colorShape = colorShape;
    }

    @Override
    public void draw(Graphics graphics) {
        colorShape.setColor(graphics);

        graphics.fillOval(5, 15, 50, 50);

        System.out.println("Circle");
    }
}
