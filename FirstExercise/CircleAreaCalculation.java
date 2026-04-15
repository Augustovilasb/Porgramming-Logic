package FirstExercise;

import java.util.Scanner;

public class CircleAreaCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the circle radius: ");
        double value = input.nextDouble();

        double pi = 3.141592654;
        double radius = value;
        double circleArea =  ((pi)*(radius*radius));

        System.out.println("The total area is: " + circleArea);
    }
}
