package StructuralPatterns.AdapterPattern.Weather;

public class Main {

    public static void main(String[] args) {
        System.out.println("Adapter Pattern!");

        WeatherWarnings ww = new WeatherWarnings();

        AmericanCity chicago = new AmericanCity("Chicago", 70);
        ww.checkForExtremeWeather(chicago);


        AsianCity lahore = new AsianCity("Lahore", 70);
        CelsiusAdapter celsiusAdapter = new CelsiusAdapter(lahore);
        ww.checkForExtremeWeather(celsiusAdapter);

    }
}