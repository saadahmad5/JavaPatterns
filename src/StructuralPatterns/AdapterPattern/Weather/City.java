package StructuralPatterns.AdapterPattern.Weather;

public interface City {
    String getName();

    double getTemperature();

    TemperatureScale getStandardTemperatureScale();

}
