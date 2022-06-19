package ch.epai.ict.m404.unit_converter;

public class UnitConverter {

    // Constates pour le facteur de conversion (rapport entre °F et °C)
    // et pour le décalage (température en °F correspondant à 0°C).
    private static final double FAHRENHEIT_PER_CELSIUS =  9.0 / 5.0;
    private static final double FAHRENHEIT_FOR_0_CELSIUS = 32.0;


    public static double celsiusToFahrenheit(double a){
        return (a * FAHRENHEIT_PER_CELSIUS) + FAHRENHEIT_FOR_0_CELSIUS;
    }
    public static double fahrenheitToCelsius(double b){
        return (b - FAHRENHEIT_FOR_0_CELSIUS) / FAHRENHEIT_PER_CELSIUS;
    }
}
