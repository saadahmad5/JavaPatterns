package StructuralPatterns.FlyWeightPattern.Vehicles;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    Map<Integer, Vehicle> vehicleFactory = new HashMap<>();

    public Vehicle generateVehicle(int type) {
        if (vehicleFactory.containsKey(type)) {
            return vehicleFactory.get(type);
        } else {
            Vehicle vehicle = null;
            if (type == 0) {
                vehicle = new Car();
            } else if (type == 1) {
                vehicle = new Truck();
            } else {
                System.exit(128);
            }
            vehicleFactory.put(type, vehicle);
            return vehicle;
        }
    }
}
