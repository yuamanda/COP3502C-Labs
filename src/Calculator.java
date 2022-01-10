import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double firstOperand;
        double secondOperand;
        int operator;

        // user input: first operand and second operand
        System.out.print("Enter first operand: ");
        firstOperand = scan.nextDouble();

        System.out.print("Enter second operand: ");
        secondOperand = scan.nextDouble();

        // prints out calculator menu for user
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Which operation do you want to perform? ");

        // user input: operator (1, 2, 3, or 4)
        operator = scan.nextInt();

        // if, else if, and else statements
        // determine which operation to utilize

        // adds firstOperand and secondOperand
        if(operator == 1)
        {
            System.out.println("The result of the operation is " + (firstOperand + secondOperand) + ". Goodbye!");
        }
        // subtracts firstOperand and secondOperand
        else if(operator == 2)
        {
            System.out.println("The result of the operation is " + (firstOperand - secondOperand) + ". Goodbye!");
        }
        // multiplies firstOperand and secondOperand
        else if(operator == 3)
        {
            System.out.println("The result of the operation is " + (firstOperand * secondOperand) + ". Goodbye!");
        }
        // divides firstOperand and secondOperand
        else if(operator == 4)
        {
            System.out.println("The result of the operation is " + (firstOperand / secondOperand) + ". Goodbye!");
        }
        // prints out if user input is NOT 1, 2, 3, or 4
        else
        {
            System.out.println("Error: Invalid selection! Terminating program.");
        }
    }
}
