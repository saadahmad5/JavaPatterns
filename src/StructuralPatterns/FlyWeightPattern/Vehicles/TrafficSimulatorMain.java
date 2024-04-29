package StructuralPatterns.FlyWeightPattern.Vehicles;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TrafficSimulatorMain {
    static List<VehicleCoordinatesCombiner> vehicles = new ArrayList<>();
    static VehicleFactory vehicleFactory = new VehicleFactory();

    public static void main(String[] args) {

        Runnable createVehicles = TrafficSimulatorMain::createRandomVehicle;
        Runnable showVehicles = TrafficSimulatorMain::showVehicles;

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleAtFixedRate(createVehicles, 0, 1, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(showVehicles, 10, 30, TimeUnit.SECONDS);

    }

    private static void createRandomVehicle() {
        Random random = new Random();
        int randomInt = random.nextInt(2);
        Vehicle vehicle = vehicleFactory.generateVehicle(randomInt);

// For non-factory implementation uncomment below

//        Vehicle vehicle;
//        if (randomInt == 0) {
//            vehicle = new Car();
//        } else {
//            vehicle = new Truck();
//        }

        int x = random.nextInt(100);
        int y = random.nextInt(100);
        Coordinates coordinates = new Coordinates(x, y);

        System.out.printf("Adding Vehicle:   %-40s Type: %-10s %s {%d, %d}\n", vehicle, vehicle.getType(), coordinates, coordinates.getX(), coordinates.getY());

        VehicleCoordinatesCombiner vehicleCoordinatesCombiner = new VehicleCoordinatesCombiner(vehicle, coordinates);
        vehicles.add(vehicleCoordinatesCombiner);

    }

    private static void showVehicles() {
        System.out.println("================================================================================");
        vehicles.forEach(System.out::println);
        System.out.println("================================================================================");
    }

}
