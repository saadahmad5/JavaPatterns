package CreationalPatterns.AbstractFactoryPattern.Bikes;

import static CreationalPatterns.AbstractFactoryPattern.Bikes.BikeFactoryCreator.createBikeWithAbstractFactory;

public class Main {

    public static void main(String[] args){

        createBikeWithAbstractFactory(BikeTypes.MOUNTAIN_BIKE);
        createBikeWithAbstractFactory(BikeTypes.MOUNTAIN_BIKE);

        createBikeWithAbstractFactory(BikeTypes.ROAD_BIKE);

    }

}
