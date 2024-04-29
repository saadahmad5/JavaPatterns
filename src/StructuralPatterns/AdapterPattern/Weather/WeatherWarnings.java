package StructuralPatterns.AdapterPattern.Weather;

public class WeatherWarnings {

    private static final double MAX_TEMPERATURE = 100;

    private static final double MIN_TEMPERATURE = 16;

    public boolean checkForExtremeWeather (City city) {
        if (city.getTemperature() >= MAX_TEMPERATURE || city.getTemperature() <= MIN_TEMPERATURE) {

            System.out.printf("Extreme weather conditions in %s at %f %s\n", city.getName(), city.getTemperature(), city.getStandardTemperatureScale());

            return true;
        } else {

            System.out.printf("Normal weather conditions in %s at %f %s\n", city.getName(), city.getTemperature(), city.getStandardTemperatureScale());

            return false;
        }
    }

}
