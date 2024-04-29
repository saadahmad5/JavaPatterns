package StructuralPatterns.BridgePattern.ColorShape;

import java.awt.*;

public class Square extends Shape {

    ColorShape colorShape;

    Square(ColorShape colorShape) {
        this.colorShape = colorShape;
    }

    @Override
    public void draw(Graphics graphics) {
        colorShape.setColor(graphics);

        graphics.fillRect(75, 15, 50, 50);

        System.out.println("Square");

    }
}
