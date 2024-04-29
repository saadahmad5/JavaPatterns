package CreationalPatterns.AbstractFactoryPattern.Bikes;

public abstract class BikeFactory {

    public abstract Wheel getWheel();

    public abstract Handle getHandle();

}
