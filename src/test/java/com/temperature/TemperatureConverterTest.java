
package com.temperature;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(77, TemperatureConverter.celsiusToFahrenheit(25), 0.01);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(25, TemperatureConverter.fahrenheitToCelsius(77), 0.01);
    }

    @Test
    void testCelsiusToKelvin() {
        assertEquals(298.15, TemperatureConverter.celsiusToKelvin(25), 0.01);
    }

    @Test
    void testKelvinToCelsius() {
        assertEquals(25, TemperatureConverter.kelvinToCelsius(298.15), 0.01);
    }

    @Test
    void testFahrenheitToKelvin() {
        assertEquals(298.15, TemperatureConverter.fahrenheitToKelvin(77), 0.01);
    }

    @Test
    void testKelvinToFahrenheit() {
        assertEquals(77, TemperatureConverter.kelvinToFahrenheit(298.15), 0.01);
    }

    @Test
    void testInvalidCelsius() {
        assertThrows(IllegalArgumentException.class,
            () -> TemperatureConverter.celsiusToKelvin(-300));
    }

    @Test
    void testInvalidFahrenheit() {
        assertThrows(IllegalArgumentException.class,
            () -> TemperatureConverter.fahrenheitToCelsius(-500));
    }

    @Test
    void testInvalidKelvin() {
        assertThrows(IllegalArgumentException.class,
            () -> TemperatureConverter.kelvinToCelsius(-10));
    }
}



