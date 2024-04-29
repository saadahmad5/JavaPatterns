package CreationalPatterns.AbstractFactoryPattern.Bikes;

public class BikeFactoryCreator {

    public static BikeFactory createFactory(BikeTypes type) {
        switch (type) {
            case ROAD_BIKE -> {
                return  new RoadBikeFactory();
            }
            case MOUNTAIN_BIKE -> {
                return new MountainBikeFactory();
            }
        }

        return null;
    }

    public static BikeFactory createBikeWithAbstractFactory(BikeTypes type) {

        BikeFactory bikeFactory = BikeFactoryCreator.createFactory(type);
        Wheel frontWheel = bikeFactory.getWheel();
        Wheel rearWheel = bikeFactory.getWheel();
        Handle handlebar = bikeFactory.getHandle();

        frontWheel.getDescription();
        rearWheel.getDescription();
        handlebar.getDescription();

        return bikeFactory;

    }

}
