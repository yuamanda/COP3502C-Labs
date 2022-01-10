import java.util.Scanner;

public class NumericConversion
{
    public static void main(String[] args)
    {
        // declaring scanner
        Scanner scan = new Scanner(System.in);

        // initializing variables
        int menuNumber = 0;
        String numericString = "";
        Long hexDecode;
        short binaryDecode;
        String binaryToHex;

        // while loop, breaks when menuNumber does not equal 4
        while(menuNumber != 4)
        {
            // prints out decoding menu
            System.out.println("Decoding Menu");
            System.out.println("-------------");
            System.out.println("1. Decode hexadecimal");
            System.out.println("2. Decode binary");
            System.out.println("3. Convert binary to hexadecimal");
            System.out.println("4. Quit");

            // asks user for menuNumber
            System.out.print("Please enter an option: ");
            // takes in user menuNumber
            menuNumber = scan.nextInt();

            // if menuNumber is 1, use hexStringDecode and print
            if(menuNumber == 1)
            {
                // asks user for numericString
                System.out.print("Please enter the numeric string to convert: ");
                // takes in user numericString
                numericString = scan.next();

                // if numericString has a second character of 'x' or 'b' then substring the first and second character out
                if(numericString.charAt(1) == 'x' || numericString.charAt(1) == 'b')
                {
                    numericString = numericString.substring(1);
                }

                hexDecode = hexStringDecode(numericString);
                System.out.println("Result: " + hexDecode);
            }
            // if menuNumber is 2, use binaryStringDecode and print
            else if(menuNumber == 2)
            {
                // asks user for numericString
                System.out.print("Please enter the numeric string to convert: ");
                // takes in user numericString
                numericString = scan.next();

                // if numericString has a second character of 'x' or 'b' then substring the first and second character out
                if(numericString.charAt(1) == 'x' || numericString.charAt(1) == 'b')
                {
                    numericString = numericString.substring(1);
                }

                binaryDecode = binaryStringDecode(numericString);
                System.out.println("Result: " + binaryDecode);
            }
            // if menuNumber is 3, use binaryToHex and print
            else if(menuNumber == 3)
            {
                // asks user for numericString
                System.out.print("Please enter the numeric string to convert: ");
                // takes in user numericString
                numericString = scan.next();

                // if numericString has a second character of 'x' or 'b' then substring the first and second character out
                if(numericString.charAt(1) == 'x' || numericString.charAt(1) == 'b')
                {
                    numericString = numericString.substring(1);
                }

                binaryToHex = binaryToHex(numericString);
                System.out.println("Result: " + binaryToHex);
            }
            // if menuNumber is 4, print "Goodbye!"
            else if(menuNumber == 4)
            {
                System.out.println("Goodbye!");
            }
        }
    }

    // if menuNumber is 1, use hexStringDecode and print
    public static Long hexStringDecode(String hex)
    {
        // initializing variables
        long hexSum = 0;
        int count = 0;

        // for loops backwards and uses Math.pow(16, count) to raise the power
        for(int i = hex.length()-1; i >= 0; i--)
        {
            int singleHex;
            singleHex = hexCharDecode(hex.charAt(i));
            hexSum += (singleHex) * (Math.pow(16, count));
            count++;
        }
        return hexSum;
    }

    public static short hexCharDecode(char digit)
    {
        // initializing variable
        short singleHex = 0;

        // if digit is '1', set singleHex as 1
        if(digit == '1')
        {
            singleHex = 1;
        }
        // if digit is '2', set singleHex as 2
        else if(digit == '2')
        {
            singleHex = 2;
        }
        // if digit is '3', set singleHex as 3
        else if(digit == '3')
        {
            singleHex = 3;
        }
        // if digit is '4', set singleHex as 4
        else if(digit == '4')
        {
            singleHex = 4;
        }
        // if digit is '5', set singleHex as 5
        else if(digit == '5')
        {
            singleHex = 5;
        }
        // if digit is '6', set singleHex as 6
        else if(digit == '6')
        {
            singleHex = 6;
        }
        // if digit is '7', set singleHex as 7
        else if(digit == '7')
        {
            singleHex = 7;
        }
        // if digit is '8', set singleHex as 8
        else if(digit == '8')
        {
            singleHex = 8;
        }
        // if digit is '9', set singleHex as 9
        else if(digit == '9')
        {
            singleHex = 9;
        }
        // if digit is 'A', set singleHex as 10
        else if(digit == 'A' || digit == 'a')
        {
            singleHex = 10;
        }
        // if digit is 'B', set singleHex as 11
        else if(digit == 'B' || digit == 'b')
        {
            singleHex = 11;
        }
        // if digit is 'C', set singleHex as 12
        else if(digit == 'C' || digit == 'c')
        {
            singleHex = 12;
        }
        // if digit is 'D', set singleHex as 13
        else if(digit == 'D' || digit == 'd')
        {
            singleHex = 13;
        }
        // if digit is 'E', set singleHex as 14
        else if(digit == 'E' || digit == 'e')
        {
            singleHex = 14;
        }
        // if digit is 'F', set singleHex as 15
        else if(digit == 'F' || digit == 'f')
        {
            singleHex = 15;
        }
        return singleHex;
    }

    // if menuNumber is 2, use binaryStringDecode and print
    public static short binaryStringDecode(String binary)
    {
        // initializing variables
        short binarySum = 0;
        int count = 0;

        // for loops backwards and uses Math.pow(2, count) to raise the power
        for(int i = binary.length()-1; i >= 0; i--)
        {
            if(binary.charAt(i) == '1')
            {
                binarySum += Math.pow(2, count);
            }
            count++;
        }
        return binarySum;
    }

    // if menuNumber is 3, use binaryToHex and print
    public static String binaryToHex(String binary)
    {
        // initializing variables
        int remainder = 0;
        int decimal = binaryStringDecode(binary);
        String hex = "";

        // while loops until decimal can't be divided by 16
        while(decimal > 0)
        {
            // finding remainder
            remainder = decimal % 16;

            // if remainder is less than 10, add that number into String hex
            if(remainder < 10)
            {
                hex = remainder + hex;
            }
            // if remainder is 10, add that 'A' into String hex
            else if(remainder == 10)
            {
                hex = 'A' + hex;
            }
            // if remainder is 11, add that 'B' into String hex
            else if(remainder == 11)
            {
                hex = 'B' + hex;
            }
            // if remainder is 12, add that 'C' into String hex
            else if(remainder == 12)
            {
                hex = 'C' + hex;
            }
            // if remainder is 13, add that 'D' into String hex
            else if(remainder == 13)
            {
                hex = 'D' + hex;
            }
            // if remainder is 14, add that 'E' into String hex
            else if(remainder == 14)
            {
                hex = 'E' + hex;
            }
            // if remainder is 15, add that 'F' into String hex
            else if(remainder == 15)
            {
                hex = 'F' + hex;
            }
            decimal /= 16;
        }
        return hex;
    }
}
