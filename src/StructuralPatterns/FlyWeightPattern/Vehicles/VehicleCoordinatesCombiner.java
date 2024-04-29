package StructuralPatterns.FlyWeightPattern.Vehicles;

public class VehicleCoordinatesCombiner {

    Vehicle vehicle;
    Coordinates coordinates;

    VehicleCoordinatesCombiner(Vehicle vehicle, Coordinates coordinates) {
        this.vehicle = vehicle;
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "VehicleCoordinatesCombiner" +
                " vehicle=" + vehicle +
                ", coordinates=" + coordinates +
                " Type: " + this.vehicle.getType() +
                " Coordinates: {" + this.coordinates.getX() + ", " + this.coordinates.getY() + "}";
    }
}
