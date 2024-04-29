package StructuralPatterns.BridgePattern.ColorShape;

import java.awt.*;

public class RedColorShape implements ColorShape {

    @Override
    public void setColor(Graphics graphics) {
        graphics.setColor(Color.red);
        System.out.println("Red");
    }
}
