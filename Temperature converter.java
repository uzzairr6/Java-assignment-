package Salary;
import java.util.Scanner;

public class temConversion {

    private static void convertCelsius(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;
        System.out.printf("Celsius: %.2f\nFahrenheit: %.2f\nKelvin: %.2f\n", celsius, fahrenheit, kelvin);
    }

    private static void convertFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        double kelvin = celsius + 273.15;
        System.out.printf("Fahrenheit: %.2f\nCelsius: %.2f\nKelvin: %.2f\n", fahrenheit, celsius, kelvin);
    }

    private static void convertKelvin(double kelvin) {
        if (kelvin < 0) {
            System.out.println("Invalid input: Kelvin cannot be negative.");
            return;
        }
        double celsius = kelvin - 273.15;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Kelvin: %.2f\nCelsius: %.2f\nFahrenheit: %.2f\n", kelvin, celsius, fahrenheit);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // scanner.close();

        while(true) { 
            System.out.println("\n--- Temperature Converter ---");
            System.out.println("Enter the temperature scale (C, F, K): ");
            char scale = scanner.next().toUpperCase().charAt(0);
            System.out.println("Enter the temperature: ");
            double temp = scanner.nextDouble();

            switch (scale) {
                case 'C':
                    convertCelsius(temp);
                    break;
                case 'F':
                    convertFahrenheit(temp);
                    break;
                case 'K':
                    convertKelvin(temp);
                    break;
                default:
                    System.out.println("Invalid scale. Please enter C, F, or K.");
            }
        }
        
    }
}
