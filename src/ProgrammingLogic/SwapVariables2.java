package ProgrammingLogic;

public class SwapVariables2 {
    public static void main(String[] args) {

        String x = "X";
        String y = "Y";

        System.out.println("Before swap X: " + x + " &  Y: " + y);
        System.out.println(" ");

        String temp = x;
        x = y;
        y = temp;

        System.out.println("After swap X: " + x + " &  Y: " + y);
        System.out.println();
    }
}
