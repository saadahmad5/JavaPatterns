package StructuralPatterns.AdapterPattern.Weather;

public class CelsiusAdapter implements City {

    City city;

    CelsiusAdapter(AsianCity asianCity) {
        this.city = asianCity;
    }

    @Override
    public String getName() {
        return city.getName();
    }

    @Override
    public double getTemperature() {
        return 9.0 / 5.0 * city.getTemperature() + 32;
    }

    @Override
    public TemperatureScale getStandardTemperatureScale() {
        return TemperatureScale.FAHRENHEIT;
    }
}
