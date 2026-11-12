

package com.temperature;

public class TemperatureConverter {

    public static void validateCelsius(double c) {
        if (c < -273.15)
            throw new IllegalArgumentException("Invalid Celsius");
    }

    public static void validateFahrenheit(double f) {
        if (f < -459.67)
            throw new IllegalArgumentException("Invalid Fahrenheit");
    }

    public static void validateKelvin(double k) {
        if (k < 0)
            throw new IllegalArgumentException("Invalid Kelvin");
    }

    public static double celsiusToFahrenheit(double c) {
        validateCelsius(c);
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        validateFahrenheit(f);
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double c) {
        validateCelsius(c);
        return c + 273.15;
    }

    public static double kelvinToCelsius(double k) {
        validateKelvin(k);
        return k - 273.15;
    }

    public static double fahrenheitToKelvin(double f) {
        validateFahrenheit(f);
        return (f - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinToFahrenheit(double k) {
        validateKelvin(k);
        return (k - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        double c = 25;

        System.out.println("Temperature Converter");
        System.out.println("Celsius: " + c);
        System.out.println("Fahrenheit: " + celsiusToFahrenheit(c));
        System.out.println("Kelvin: " + celsiusToKelvin(c));
    }
}