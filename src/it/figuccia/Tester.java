package it.figuccia;

/**
 * This class tests the methods in the ArithmeticOperators class
 * @author Figuccia
 */
public class Tester {
    public static void main(String[] args) {
        /**
         * Created a new object called ao
         */
        ArithmeticOperators ao = new ArithmeticOperators();
        /**
         * assigned a int value to params
         */
        int num1 = 5, num2 = 3;
        /**
         * make a single println for all methods separated from \n for print in new line
         */
        System.out.println(
                "Sum: " + ao.sum(num1, num2)+
                "\n"+"Subtraction: " + ao.sub(num1, num2)+
                "\n"+"Multiplication: " + ao.mul(num1, num2)+
                "\n"+"Division: " + ao.div(num1, num2)
        );
    }
}
