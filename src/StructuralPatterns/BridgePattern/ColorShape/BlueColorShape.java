package StructuralPatterns.BridgePattern.ColorShape;

import java.awt.*;

public class BlueColorShape implements ColorShape {

    @Override
    public void setColor(Graphics graphics) {
        graphics.setColor(Color.blue);
        System.out.println("Blue");
    }
}
