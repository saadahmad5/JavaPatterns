package CreationalPatterns.AbstractFactoryPattern.Bikes;

public class MountainBikeFactory extends BikeFactory {
    @Override
    public Wheel getWheel() {
        return new MountainBikeWheel();
    }

    @Override
    public Handle getHandle() {
        return new DropHandle();
    }
}
