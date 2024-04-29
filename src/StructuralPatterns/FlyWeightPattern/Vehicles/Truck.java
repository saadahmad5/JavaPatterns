package StructuralPatterns.FlyWeightPattern.Vehicles;

public class Truck implements Vehicle {

    Coordinates coordinates;
    String type;

    Truck() {
        coordinates = new Coordinates();
        type = "Truck";
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
