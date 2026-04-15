package ProgrammingLogic;

import java.util.Scanner;

        public class FahrenheitToCelsius {
            public static void main(String[] args) {

                int constant1 = 9;
                int constant2 = 5;
                int constant3 = 32;

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Fahrenheit value to convert: ");
                double fahrenheit = sc.nextDouble();

                double celsius = ((fahrenheit - constant3) * constant2) / constant1;

                System.out.println("The value of " + fahrenheit + "°F converted to Celsius is: " + celsius + "°C");

            }
        }