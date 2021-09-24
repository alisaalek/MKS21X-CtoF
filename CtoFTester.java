// The functions should have doubles as parameters. They should return doubles as well.

public class CtoFTester {
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static void main(String[] argv) {
        System.out.println(celsiusToFahrenheit(100));
        System.out.println(fahrenheitToCelsius(100));
    }
}