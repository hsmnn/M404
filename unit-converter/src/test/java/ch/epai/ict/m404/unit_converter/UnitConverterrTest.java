package ch.epai.ict.m404.unit_converter;

import org.junit.*;
import org.junit.Assert;

public class UnitConverterrTest {


    // Tests pour la fonction celsiusToFahrenheit
    //
    // La fonction celsiusToFahrenheit prend une température en °C
    // en paramètre et renvoie cette même température en °F.

    @Test
    public void celsiusToFahrenheit_0_should_return_32() {
        double celsius = 0.0;

        double expectedValue = 32.0;
        double actualValue = UnitConverter.celsiusToFahrenheit(celsius);
        double epsilon = 0;

        Assert.assertEquals("0°C doit correspondre à 32°F (0°C * 9°F/5°C + 32°C)", expectedValue, actualValue, epsilon);
    }

    @Test
    public void celsiusToFahrenheit_100_should_return_212() {
        double celsius = 100.0;

        double expectedValue = 212.0;
        double actualValue = UnitConverter.celsiusToFahrenheit(celsius);
        double epsilon = 0;

        Assert.assertEquals("100°C doit correpondre à 212°F", expectedValue, actualValue, epsilon);
    }


    // Tests pour la fonction fahrenheitToCelsius
    //
    // La fonction fahrenheitToCelsius prend une température en °F
    // en paramètre et renvoie cette même température en °C.

    @Test
    public void fahrenheitToCelsius_32_should_return_0() {
        double fahrenheit = 32.0;

        double expectedValue = 0.0;
        double actualValue = UnitConverter.fahrenheitToCelsius(fahrenheit);
        double epsilon = 0;

        Assert.assertEquals("32°F doit correpondre à 0°C", expectedValue, actualValue, epsilon);
    }

    @Test
    public void fahrenheitToCelsius_212_should_return_100() {
        double fahrenheit = 212.0;

        double expectedValue = 100.0;
        double actualValue = UnitConverter.fahrenheitToCelsius(fahrenheit);
        double epsilon = 0;

        Assert.assertEquals("212°F doit correpondre à 100°C", expectedValue, actualValue, epsilon);
    }
}
