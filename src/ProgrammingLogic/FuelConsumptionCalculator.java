package ProgrammingLogic;

import java.util.Scanner;

public class FuelConsumptionCalculator {
    public static void main(String[] args) {

        int fuelEfficiency = 12;

        Scanner sc = new Scanner(System.in);
        System.out.println("How many HOURS the ride takes?");
        double timeTravel = sc.nextDouble();
        System.out.println("Which was your avg speed?");
        double speed = sc.nextDouble();

        double distanceKm = timeTravel * speed;
        double fuelConsumption = distanceKm / fuelEfficiency;

        System.out.printf("You ride about %.2f KM%n", distanceKm);
        System.out.printf("With speed avg of: %.2f Km/hr%n", speed);
        System.out.printf("With consumption of %.2f Liters%n", fuelConsumption);
    }
}
