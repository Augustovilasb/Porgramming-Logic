package ProgrammingLogic;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        int constant1 = 9;
        int constant2 = 5;
        int constant3 = 32;

        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the Celsius value to convert: ");
        double celsius = sc.nextDouble();

       double fahrenheit = ((constant1 * celsius) / constant2) + constant3;

        System.out.println("The value of " + celsius + "°C converted to Fahrenheit is: " + fahrenheit + "°F");

    }
}
