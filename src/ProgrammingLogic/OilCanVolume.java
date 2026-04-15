package ProgrammingLogic;

import java.util.Scanner;

public class OilCanVolume {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the Can Radius?");
        double radius = sc.nextDouble();
        System.out.println("What is the Can High?");
        double high = sc.nextDouble();

        double volume = (Math.PI*Math.pow(radius,2))*high;

        System.out.printf("The Volume can is: %.2f cm³%n", volume );

    }
}
