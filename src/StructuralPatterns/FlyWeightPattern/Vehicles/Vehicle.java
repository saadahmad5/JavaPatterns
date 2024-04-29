package StructuralPatterns.FlyWeightPattern.Vehicles;

public interface Vehicle {

    String getType();
    Coordinates getCoordinates();
    void setCoordinates(Coordinates coordinates);

}
