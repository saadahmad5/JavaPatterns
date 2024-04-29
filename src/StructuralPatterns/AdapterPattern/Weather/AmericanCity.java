package StructuralPatterns.AdapterPattern.Weather;

public class AmericanCity implements City{

    private final String name;
    private final double temperature;

    AmericanCity(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public TemperatureScale getStandardTemperatureScale() {
        return TemperatureScale.FAHRENHEIT;
    }
}
