package ProgrammingLogic;

public class SwapVariables {
    public static void main(String[] args) {

        //Creating the valiables X & Y
        String variableX = "VariableX";
        String variableY = "VariableY";

        //Printing the first value of X & Y
        System.out.println(" ");
        System.out.println("Value variable X before the Swap: " + variableX);
        System.out.println("Value variable Y before the Swap: " + variableY);
        System.out.println(" ");

        // Add and printing the value of X on "tempValue"
        String tempValue = variableX;
        System.out.println("Variable 'tempValue' now worth: " + tempValue);
        System.out.println(" ");

        // Add and printing the value of "variableY" on "variableX"
        variableX = variableY;
        System.out.println("Variable X now worth: " + variableX);
        System.out.println(" ");

        // Add and printing the value of "tempValue" on "variableY"
        variableY = tempValue;
        System.out.println("Variable Y now worth: " + tempValue);
        System.out.println(" ");

        //Printing the Final value of "variableX" & "variableY"
        System.out.println("Final Value of Variable X: " + variableX);
        System.out.println("Final Value of Variable Y: " + variableY);
        System.out.println();
    }
}
