package StructuralPatterns.DecoratorPattern.DifferentCircles;

import java.awt.*;

public class Circle implements Shape {

    int x;
    int y;

    Circle(int x, int y) {
        System.out.println("Constructor called");
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics graphics) {
        System.out.println("Drawing Normal Circle");
        graphics.fillOval(x, y, 50, 50);
    }
}
