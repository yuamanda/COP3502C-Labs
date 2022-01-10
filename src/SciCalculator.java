import java.util.Scanner;

public class SciCalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // initialize variables
        double result = 0.0;
        int menuSelection = 1;
        int input = 1;
        double firstOperand = 0.0;
        double secondOperand = 0.0;
        String firstOperandString;
        String secondOperandString;
        int count = 0;
        double currentResult = 0.0;
        double sumResult = 0.0;
        double resultAverage;

        // prints out the first result, only once
        System.out.println("Current Result: " + result);

        while(menuSelection != 0)
        {
            // prints out the calculator menu
            System.out.println("Calculator Menu");
            System.out.println("---------------");
            // user input = [0, 7]
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm ");
            System.out.println("7. Display Average");

            // asks for user input
            System.out.print("Enter Menu Selection: ");
            input = scan.nextInt();

            // loop if the input is less than or equal to 0 and if the input is greater than or equal to 7
            while(input <= 0 || input >= 7)
            {
                // prints out if input is 0
                if(input == 0)
                {
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    menuSelection = 0;
                    break;
                }
                // prints out if input is 7
                else if(input == 7)
                {
                    if(sumResult == 0)
                    {
                        System.out.println("Error: No calculations yet to average!");
                    }
                    else
                    {
                        System.out.println("Sum of calculations: " + sumResult);
                        System.out.println("Number of calculations: " + count);
                        resultAverage = Math.round(sumResult * 100.0 / (double)count) / 100.0;
                        System.out.println("Average of calculations: " + resultAverage);
                    }
                }
                // if input value is anything other than [0, 7]
                else
                {
                    System.out.println("Error: Invalid selection!");
                }
                System.out.print("Enter Menu Selection: ");
                input = scan.nextInt();
            }

            // goes in if input is 1
            if(input == 1)
            {
                System.out.print("Enter first operand: ");
                firstOperandString = scan.next();
                // if firstOperandString equals "RESULT", then set firstOperand to currentResult
                if(firstOperandString.equals("RESULT"))
                {
                    firstOperand = currentResult;
                }
                // else parse firstOperandString into a double and set it to firstOperand
                else
                {
                    firstOperand = Double.parseDouble(firstOperandString);
                }
                System.out.print("Enter second operand: ");
                secondOperandString = scan.next();
                // if secondOperandString equals "RESULT", then set secondOperand to currentResult
                if(secondOperandString.equals("RESULT"))
                {
                    secondOperand = currentResult;
                }
                // else parse secondOperandString into a double and set it to secondOperand
                else
                {
                    secondOperand = Double.parseDouble(secondOperandString);
                }
                currentResult = firstOperand + secondOperand;
                System.out.println("Current Result: " + currentResult);
            }
            // goes in if input is 2
            else if(input == 2)
            {
                System.out.print("Enter first operand: ");
                firstOperandString = scan.next();
                // if firstOperandString equals "RESULT", then set firstOperand to currentResult
                if(firstOperandString.equals("RESULT"))
                {
                    firstOperand = currentResult;
                }
                // else parse firstOperandString into a double and set it to firstOperand
                else
                {
                    firstOperand = Double.parseDouble(firstOperandString);
                }
                System.out.print("Enter second operand: ");
                secondOperandString = scan.next();
                // if secondOperandString equals "RESULT", then set secondOperand to currentResult
                if(secondOperandString.equals("RESULT"))
                {
                    secondOperand = currentResult;
                }
                // else parse secondOperandString into a double and set it to secondOperand
                else
                {
                    secondOperand = Double.parseDouble(secondOperandString);
                }
                currentResult = firstOperand - secondOperand;
                System.out.println("Current Result: " + currentResult);
            }
            // goes in if input is 3
            else if(input == 3)
            {
                System.out.print("Enter first operand: ");
                firstOperandString = scan.next();
                // if firstOperandString equals "RESULT", then set firstOperand to currentResult
                if(firstOperandString.equals("RESULT"))
                {
                    firstOperand = currentResult;
                }
                // else parse firstOperandString into a double and set it to firstOperand
                else
                {
                    firstOperand = Double.parseDouble(firstOperandString);
                }
                System.out.print("Enter second operand: ");
                secondOperandString = scan.next();
                // if secondOperandString equals "RESULT", then set secondOperand to currentResult
                if(secondOperandString.equals("RESULT"))
                {
                    secondOperand = currentResult;
                }
                // else parse secondOperandString into a double and set it to secondOperand
                else
                {
                    secondOperand = Double.parseDouble(secondOperandString);
                }
                currentResult = firstOperand * secondOperand;
                System.out.println("Current Result: " + currentResult);
            }
            // goes in if input is 4
            else if(input == 4)
            {
                System.out.print("Enter first operand: ");
                firstOperandString = scan.next();
                // if firstOperandString equals "RESULT", then set firstOperand to currentResult
                if(firstOperandString.equals("RESULT"))
                {
                    firstOperand = currentResult;
                }
                // else parse firstOperandString into a double and set it to firstOperand
                else
                {
                    firstOperand = Double.parseDouble(firstOperandString);
                }
                System.out.print("Enter second operand: ");
                secondOperandString = scan.next();
                // if secondOperandString equals "RESULT", then set secondOperand to currentResult
                if(secondOperandString.equals("RESULT"))
                {
                    secondOperand = currentResult;
                }
                // else parse secondOperandString into a double and set it to secondOperand
                else
                {
                    secondOperand = Double.parseDouble(secondOperandString);
                }
                currentResult = firstOperand / secondOperand;
                System.out.println("Current Result: " + currentResult);
            }
            // goes in if input is 5
            else if(input == 5)
            {
                System.out.print("Enter first operand: ");
                firstOperandString = scan.next();
                // if firstOperandString equals "RESULT", then set firstOperand to currentResult
                if(firstOperandString.equals("RESULT"))
                {
                    firstOperand = currentResult;
                }
                // else parse firstOperandString into a double and set it to firstOperand
                else
                {
                    firstOperand = Double.parseDouble(firstOperandString);
                }
                System.out.print("Enter second operand: ");
                secondOperandString = scan.next();
                // if secondOperandString equals "RESULT", then set secondOperand to currentResult
                if(secondOperandString.equals("RESULT"))
                {
                    secondOperand = currentResult;
                }
                // else parse secondOperandString into a double and set it to secondOperand
                else
                {
                    secondOperand = Double.parseDouble(secondOperandString);
                }
                currentResult = Math.pow(firstOperand, secondOperand);
                System.out.println("Current Result: " + currentResult);
            }
            // goes in if input is 6
            else if(input == 6)
            {
                System.out.print("Enter first operand: ");
                firstOperandString = scan.next();
                // if firstOperandString equals "RESULT", then set firstOperand to currentResult
                if(firstOperandString.equals("RESULT"))
                {
                    firstOperand = currentResult;
                }
                // else parse firstOperandString into a double and set it to firstOperand
                else
                {
                    firstOperand = Double.parseDouble(firstOperandString);
                }
                System.out.print("Enter second operand: ");
                secondOperandString = scan.next();
                // if secondOperandString equals "RESULT", then set secondOperand to currentResult
                if(secondOperandString.equals("RESULT"))
                {
                    secondOperand = currentResult;
                }
                // else parse secondOperandString into a double and set it to secondOperand
                else
                {
                    secondOperand = Double.parseDouble(secondOperandString);
                }
                currentResult = Math.round((Math.log(secondOperand)) / (Math.log(firstOperand)) * 100.0 / 100.0);
                System.out.println("Current Result: " + currentResult);
            }
            // always add the new result to the sum and add 1 to count
            sumResult += currentResult;
            count++;
        }
    }
}
