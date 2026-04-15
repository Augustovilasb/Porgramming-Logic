package ProgrammingLogic;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        double percentageDiscount = 0;
        double limiteTax1 = 625;
        double limiteTax2 = 825;
        double limiteTax3 = 1025;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name please: ");
        String name = sc.nextLine();
        System.out.println("Enter your Surname please: ");
        String surname = sc.nextLine();
        System.out.println("How much is the hour worked value?");
        double valueHour = sc.nextDouble();
        System.out.println("How many hours did u work this week?");
        int hoursWorked = sc.nextInt();

        double salaryBeforeTax = hoursWorked * valueHour;

        if (salaryBeforeTax <= limiteTax1) {
            percentageDiscount = 10;
        } else if (salaryBeforeTax <= limiteTax2) {
            percentageDiscount = 18;
        } else if (salaryBeforeTax <= limiteTax3) {
            percentageDiscount = 26;
        } else {
            percentageDiscount = 32;
        }

        double totalDiscount = ((percentageDiscount / 100) * salaryBeforeTax);
        double salaryAfterTax = salaryBeforeTax - totalDiscount;

        System.out.println("-------- PAYSLIP WEEKLY --------");
        System.out.println("Sr. " + name + " " + surname);
        System.out.println("Amount hrs worked weekly: " + hoursWorked);
        System.out.println("Salary/hours: " + valueHour + " Euros");
        System.out.println("Your salary before tax: " + salaryBeforeTax + " Euros");
        System.out.println("Your tax rate is: " + percentageDiscount + "%");
        System.out.printf("Total discounted: %.2f Euros%n", totalDiscount);
        System.out.printf("Your salary after tax: %.2f Euros%n", salaryAfterTax);
        System.out.println("--------------------------------");
    }
}