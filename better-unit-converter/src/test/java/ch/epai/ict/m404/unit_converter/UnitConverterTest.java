package ch.epai.ict.m404.unit_converter;

import org.junit.*;
import org.junit.Assert;

public class UnitConverterTest {

    // Tests pour la fonction convertToKelvin
    //
    // La fonction convertToKelvin prend une valeur de
    // température et un symbole d'unité en paramètre et
    // renvoie la valeur correspondantes en kelvin.
    //
    // Le symbole d'unité indique l'unité de la valeur a
    // convertir.

    @Test
    public void convertToKelvin_373_15_Kelvin_should_return_373_15() {
        double value = 373.15;
        String unitSymbol = "K";
        double expectedValue = 373.15;
        double actualValue = UnitConverter.convertToKelvin(value, unitSymbol);
        double epsilon = 0.002;

        Assert.assertEquals(expectedValue, actualValue, epsilon);
    }

    @Test
    public void convertToKelvin_671_67_Rankine_should_return_373_15() {
        double value = 671.67;
        String unitSymbol = "Ra";
        double expectedValue = 373.15;
        double actualValue = UnitConverter.convertToKelvin(value, unitSymbol);
        double epsilon = 0.002;

        Assert.assertEquals(expectedValue, actualValue, epsilon);
    }

    @Test
    public void convertToKelvin_100_Celsius_should_return_373_15() {
        double value = 100;
        String unitSymbol = "°C";
        double expectedValue = 373.15;
        double actualValue = UnitConverter.convertToKelvin(value, unitSymbol);
        double epsilon = 0.002;

        Assert.assertEquals(expectedValue, actualValue, epsilon);
    }

    @Test
    public void convertToKelvin_212_Fahrenheit_should_return_373_15() {
        double value = 212;
        String unitSymbol = "°F";
        double expectedValue = 373.15;
        double actualValue = UnitConverter.convertToKelvin(value, unitSymbol);
        double epsilon = 0.002;

        Assert.assertEquals(expectedValue, actualValue, epsilon);
    }

    @Test
    public void convertToKelvin_0_Delisle_should_return_373_15() {
        double value = 0;
        String unitSymbol = "°De";
        double expectedValue = 373.15;
        double actualValue = UnitConverter.convertToKelvin(value, unitSymbol);
        double epsilon = 0.002;

        Assert.assertEquals(expectedValue, actualValue, epsilon);
    }

    @Test
    public void convertToKelvin_33_Newton_should_return_373_15() {
        double value = 33;
        String unitSymbol = "°N";
        double expectedValue = 373.15;
        double actualValue = UnitConverter.convertToKelvin(value, unitSymbol);
        double epsilon = 0.002;

        Assert.assertEquals(expectedValue, actualValue, epsilon);
    }

    // Tests pour la fonction convertFromKelvin
    //
    // La fonction convertFromKelvin prend une valeur de
    // température en kelvin et un symbole d'unité en paramètre
    // et renvoie la valeur correspondantes dans cette unité.
    //
    // Le symbole d'unité indique l'unité dans laquel on veut
    // convertir la température en kelvin.

    @Test
    public void convertFromKelvin_373_15_Kelvin_should_return_373_15() {
        double value = 373.15;
        String toUnitSymbol = "K";
        double expectedValue = 373.15;
        double actualValue = UnitConverter.convertFromKelvin(value, toUnitSymbol);
        double epsilon = 0.002;

        Assert.assertEquals(expectedValue, actualValue, epsilon);
    }

    @Test
    public void convertFromKelvin_373_15_Rankine_should_return_671_67() {
        double value = 373.15;
        String toUnitSymbol = "Ra";
        double expectedValue = 671.67;
        double actualValue = UnitConverter.convertFromKelvin(value, toUnitSymbol);
        double epsilon = 0.002;

        Assert.assertEquals(expectedValue, actualValue, epsilon);
    }

    @Test
    public void convertFromKelvin_373_15_Celsius_should_return_100() {
        double value = 373.15;
        String toUnitSymbol = "°C";
        double expectedValue = 100;
        double actualValue = UnitConverter.convertFromKelvin(value, toUnitSymbol);
        double epsilon = 0.002;

        Assert.assertEquals(expectedValue, actualValue, epsilon);
    }

    @Test
    public void convertFromKelvin_373_15_Fahrenheit_should_return_212() {
        double value = 373.15;
        String toUnitSymbol = "°F";
        double expectedValue = 212;
        double actualValue = UnitConverter.convertFromKelvin(value, toUnitSymbol);
        double epsilon = 0.002;

        Assert.assertEquals(expectedValue, actualValue, epsilon);
    }

    @Test
    public void convertFromKelvin_373_15_Delisle_should_return_0() {
        double value = 373.15;
        String toUnitSymbol = "°De";
        double expectedValue = 0;
        double actualValue = UnitConverter.convertFromKelvin(value, toUnitSymbol);
        double epsilon = 0.002;

        Assert.assertEquals(expectedValue, actualValue, epsilon);
    }

    @Test
    public void convertFromKelvin_373_15_Newton_should_return_33() {
        double value = 373.15;
        String toUnitSymbol = "°N";
        double expectedValue = 33;
        double actualValue = UnitConverter.convertFromKelvin(value, toUnitSymbol);
        double epsilon = 0.002;

        Assert.assertEquals(expectedValue, actualValue, epsilon);
    }


    // Tests pour la fonction convert
    //
    // La fonction convert prend une valeur de température
    // et deux sympboles d'unité en paramètre. Le premier
    // symbole indique l'unité de la valeur à convertir et
    // le second indique l'unité de la valeur converti.

    @Test
    public void convert_100_Celsius_Fahrenheit_should_return_212() {
        double value = 100.00;
        String fromUnitSymbol = "°C";
        String toUnitSymbol = "°F";
        double expectedValue = 212;
        double actualValue = UnitConverter.convert(value, fromUnitSymbol, toUnitSymbol);
        double epsilon = 0.002;

        Assert.assertEquals(expectedValue, actualValue, epsilon);
    }

    @Test
    public void convert_100_Celsius_Newton_should_return_33() {
        double value = 100.00;
        String fromUnitSymbol = "°C";
        String toUnitSymbol = "°N";
        double expectedValue = 33;
        double actualValue = UnitConverter.convert(value, fromUnitSymbol, toUnitSymbol);
        double epsilon = 0.002;

        Assert.assertEquals(expectedValue, actualValue, epsilon);
    }

    @Test
    public void convert_75_Delisle_Celsius_should_return_50() {
        double value = 75;
        String fromUnitSymbol = "°De";
        String toUnitSymbol = "°C";
        double expectedValue = 50;
        double actualValue = UnitConverter.convert(value, fromUnitSymbol, toUnitSymbol);
        double epsilon = 0.002;

        Assert.assertEquals(expectedValue, actualValue, epsilon);
    }
}
