package StructuralPatterns.BridgePattern.ColorShape;

import java.awt.*;

public class Triangle extends Shape {

    ColorShape colorShape;

    Triangle(ColorShape colorShape) {
        this.colorShape = colorShape;
    }

    @Override
    public void draw(Graphics graphics) {
        colorShape.setColor(graphics);

        int[] x = {200, 250, 150};
        int[] y = {15, 65, 65};
        int n = 3;
        graphics.fillPolygon(x, y, n);

        System.out.println("Triangle");
    }
}
