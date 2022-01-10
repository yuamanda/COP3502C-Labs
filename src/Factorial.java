// import scanner class
import java.util.Scanner;

public class Factorial
{
    // main method
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int factorial = scan.nextInt();

        // throws exception
        if(factorial <= 0)
        {
            System.out.println("throws IllegalArgumentException");
        }

        // base case
        else if(factorial == 1)
        {
            System.out.println("1");
        }

        // recurrence relations
        else
        {
            System.out.println(pureRecursive(factorial));
        }
    }

    // a purely recursive function that calculates the factorial of n
    // this function should call only itself
    public static long pureRecursive(int n)
    {
        if(n == 1)
        {
            return 1;
        }

        else
        {
            return n * pureRecursive(n - 1);
        }
    }

    // a kickoff method for tail recursion; it should call only the tail() method
    public static long tailRecursive(int n)
    {
        return tail(n);
    }

    // a  private  method  called  by  the  tail  recursion  kickoff  method
    // students  may  select  the  parameters  for  this method, but it must be present and used
    // this method should only call itself, and only via tail recursion
    // i.e., it should call itself on the last line with no other computation after the function call
    private static long tail(int n)
    {
        if(n == 1)
        {
            return 1;
        }

        return n * tail(n - 1);
    }

    // an  iterative  version  of  the  factorial  calculation
    // this  method  should  be  an  “unwound”  version  of  the tailRecursive() method outlined above
    // it should not call itself or any other method but should instead using a looping structure to calculate the factorial
    public static long iterative(int n)
    {
        long total = n;

        for(int i = 0; i < n; i++)
        {
            total *= n - 1;
            n -= 1;
        }

        return total;
    }
}
