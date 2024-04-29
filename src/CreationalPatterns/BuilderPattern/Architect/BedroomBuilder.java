package CreationalPatterns.BuilderPattern.Architect;

import java.awt.*;

public class BedroomBuilder {

    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;

    public BedroomBuilder() {
        this.dimensions = new Dimension(10, 10);
        this.ceilingHeight = 8;
        this.floorNumber = 1;
        this.wallColor = Color.white;
        this.numberOfWindows = 1;
        this.numberOfDoors = 1;
    }

    public BedroomBuilder setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public BedroomBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    public BedroomBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    public BedroomBuilder setWallColor(Color wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    public BedroomBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public BedroomBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public Bedroom build() {
        return new Bedroom(
                dimensions,
                ceilingHeight,
                floorNumber,
                wallColor,
                numberOfWindows,
                numberOfDoors
        );
    }


}
