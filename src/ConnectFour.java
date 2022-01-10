import java.util.Scanner;

public class ConnectFour
{
    public static void main(String[] args)
    {
        // initialize variables
        Scanner scan = new Scanner(System.in);
        char chipType = 'x';
        int column;
        boolean game = true;
        boolean draw;
        int r;

        // asks the user for what they wish the height of the board to be
        System.out.print("What would you like the height of the board to be? ");
        int row = scan.nextInt();

        // asks the user for what they wish the length of the board to be
        System.out.print("What would you like the length of the board to be? ");
        int col = scan.nextInt();

        // initialize the 2D array board
        char[][] board = new char[row][col];

        // calls method initializeBoard
        initializeBoard(board);
        // calls method printBoard
        printBoard(board);
        System.out.println();

        // tells players what their tokens are
        System.out.println("Player 1: x");
        System.out.println("Player 2: o");
        System.out.println();

        // while loops through until false
        while(true)
        {
            // asks player 1 for column
            System.out.print("Player 1: Which column would you like to choose? ");
            column = scan.nextInt();
            chipType = 'x';
            // calls insertChip method
            r = insertChip(board, column, chipType);
            // calls printBoard method
            printBoard(board);
            System.out.println();
            // calls checkIfWinner method
            game = checkIfWinner(board, column, r, chipType);
            // calls checkIfDraw method
            draw = checkIfDraw(board);

            // checks if player 1 won the game
            if(game == true)
            {
                System.out.println("Player 1 won the game!");
                break;
            }

            // checks if player 1 and player 2 tie: the board has no '-'
            if(draw == true)
            {
                System.out.println("Draw. Nobody wins.");
                break;
            }

            // asks player 2 for column
            System.out.print("Player 2: Which column would you like to choose? ");
            chipType = 'o';
            column = scan.nextInt();
            // calls insertChip method
            r = insertChip(board, column, chipType);
            // calls printBoard method
            printBoard(board);
            System.out.println();
            // calls checkIfWinner method
            game = checkIfWinner(board, column, r, chipType);
            // calls checkIfDraw method
            draw = checkIfDraw(board);

            // checks if player 1 won the game
            if(game == true)
            {
                System.out.println("Player 2 won the game!");
                break;
            }

            // checks if player 1 and player 2 tie: the board has no '-'
            if(draw == true)
            {
                System.out.println("Draw. Nobody wins.");
                break;
            }
        }
    }

    // printBoard method: prints out the board
    public static void printBoard(char[][] array)
    {
        // loops through the rows of the array
        for(int i = array.length - 1; i >= 0 ; i--)
        {
            System.out.println();
            // loops through the columns of the array
            for(int j = 0; j < array[0].length; j++)
            {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
        }
    }

    // initializeBoard method: sets each spot in the array to '-'
    public static void initializeBoard(char[][] array)
    {
        // loops through the rows of the array
        for(int i = 0; i < array.length; i++)
        {
            // loops through the columns of the array
            // makes the bottom left of the board [0][0]
            for(int j = 0; j < array[0].length; j++)
            {
                array[i][j] = '-';
            }
        }
    }

    // insertChip method: places the token in the column that the user has chosen
    public static int insertChip(char[][] array, int col, char chipType)
    {
        // initialize variables
        int i;

        // loops through the rows of the array
        for(i = 0; i < array.length; i++)
        {
            // will find the next available spot in that column if there are already tokens there
            if(array[i][col] != 'x' && array[i][col] != 'o')
            {
                array[i][col] = chipType;
                break;
            }
        }
        // the row that the token is placed in is returned
        return i;
    }

    // checkIfWinner method: after a token is added, checks whether the token in this location, of the specified chip type, creates four in a row
    public static boolean checkIfWinner(char[][] array, int col, int row, char chipType)
    {
        // initialize variables
        int count = 1;

        // loops through the rows of the array
        for(int i = 0; i < array.length - 1; i++)
        {
            // if the current chip and the chip to the right is equal to the same chip type, add one to count
            if(array[i][col] == chipType && array[i + 1][col] == chipType)
            {
                count++;
            }
            // if the current chip and the chip to the right is not equal to the same chip type, restart count to 1
            else if(!(array[i][col] == chipType && array[i + 1][col] == chipType))
            {
                count = 1;
            }

            // returns true is someone won
            if(count == 4)
            {
                return true;
            }
        }

        // initialize variables
        count = 1;
        // loops through the columns of the array
        for(int j = 0; j < array[0].length - 1; j++)
        {
            // if the current chip and the chip above is equal to the same chip type, add one to count
            if(array[row][j] == chipType && array[row][j + 1] == chipType)
            {
                count++;
            }
            // if the current chip and the chip above is not equal to the same chip type, restart count to 1
            else if(!(array[row][j] == chipType && array[row][j + 1] == chipType))
            {
                count = 1;
            }

            // returns true is someone won
            if(count == 4)
            {
                return true;
            }
        }
        // returns false if nobody won
        return false;
    }

    // checkIfDraw method: checks if there is '-' in the board
    public static boolean checkIfDraw(char[][] board)
    {
        // loops through the rows of the array
        for(int i = 0; i < board.length; i++)
        {
            // loops through the columns of the array
            for(int j = 0; j < board[0].length; j++)
            {
                // if there is a '-', return false
                if(board[i][j] == '-')
                {
                    return false;
                }
            }
        }
        // if there is no '-', return false
        return true;
    }
}
