package StructuralPatterns.FlyWeightPattern.Vehicles;

public class Car implements Vehicle {

    Coordinates coordinates;
    String type;

    Car() {
        coordinates = new Coordinates();
        type = "Car";
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public Coordinates getCoordinates() {
        return this.coordinates;
    }

    @Override
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates.setCoordinates(coordinates);
    }
}
