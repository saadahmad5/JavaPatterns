package CreationalPatterns.AbstractFactoryPattern.Bikes;

public class RoadBikeFactory extends BikeFactory {


    @Override
    public Wheel getWheel() {
        return new RoadBikeWheel();
    }

    @Override
    public Handle getHandle() {
        return new StraightHandle();
    }
}
