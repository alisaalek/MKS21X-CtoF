// The functions should have doubles as parameters. They should return doubles as well.

public class CtoFTester {
    public double celsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}