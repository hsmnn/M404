package ch.epai.ict.m404.unit_converter;


public class UnitConverter {

    // Constante pour les symboles d'unité

    private static final String SYMBOL_KELVIN = "K";
    private static final String SYMBOL_RANKIN = "Ra";
    private static final String SYMBOL_CELSIUS = "°C";
    private static final String SYMBOL_FAHRENHEIT = "°F";
    private static final String SYMBOL_DELISLE = "°De";
    private static final String SYMBOL_NEWTON = "°N";

    // Constante pour les facteurs de conversion et les décalages

    private static final double RANKIN_PER_KELVIN = 9.0 / 5.0;
    private static final double RANKIN_FOR_0_KELVIN = 0.0;

    private static final double CELSIUS_PER_KELVIN = 1.0 / 1.0;
    private static final double CELSIUS_FOR_0_KELVIN = -273.15;

    private static final double FAHRENHEIT_PER_KELVIN =  9.0 / 5.0;
    private static final double FAHRENHEIT_FOR_0_KELVIN = -459.67;

    private static final double DELISLE_PER_KELVIN = -150.0 / 100;
    private static final double DELISLE_FOR_0_KELVIN = 559.725;

    private static final double NEWTON_PER_KELVIN = 33.0 / 100;
    private static final double NEWTON_FOR_0_KELVIN = -90.14;


    // TODO

    public static double convertToKelvin (double value, String unitSymbol){
        throw new UnsupportedOperationException();
    }
    public static double convertFromKelvin (double value, String ToUnitSymbol){
        throw new UnsupportedOperationException();
    }
    public static double convert (double value, String FromUnitSymbol, String ToUnitSymbol){
        throw new UnsupportedOperationException();
    }
}
