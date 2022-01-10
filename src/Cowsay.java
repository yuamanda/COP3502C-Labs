public class Cowsay
{
    public static void main(String[] args)
    {
        // declare and initialize variable
        Cow[] cowArray = HeiferGenerator.getCows();

        // if statement checks is args[0] is equal to "-l"
        if(args[0].equals("-l"))
        {
            System.out.print("Cows available: ");
            listCows(cowArray);
        }
        // else if statement checks is args[0] is equal to "-n"
        else if(args[0].equals("-n"))
        {
            if(args[1].equals(findCow(args[1],cowArray).getName()))
            {
                // for loops through the args array and prints out the message
                for(int i = 2; i < args.length; i++)
                {
                    System.out.print(args[i] + " ");
                }

                System.out.println();
                System.out.println(findCow(args[1], cowArray).getImage());
            }
            else
            {
                System.out.println("Could not find " + args[1] + "cow!");
            }
        }
        else
        {
            // for loops through the args array and prints out the message
            for (int i = 0; i < args.length; i++)
            {
                System.out.print(args[i] + " ");
            }

            System.out.println();
            System.out.println(cowArray[0].getImage());
        }

        if(args[1].equals("dragon"))
        {
            System.out.println("This dragon can breathe fire.");
        }

        else if(args[1].equals("ice-dragon"))
        {
            System.out.println("This dragon cannot breathe fire.");
        }
    }

    // displays the list of available cows from an array of cow objects
    private static void listCows(Cow[] cows)
    {
        // for loops through the cows array and prints out the message
        for(int i = 0; i < cows.length; i++)
        {
            System.out.print(cows[i].getName() + " ");
        }

        System.out.println();
    }

    // given a name and an array of Cow objects, return the Cow object with the specified name
    private static Cow findCow(String name, Cow[] cows)
    {
        // declare and initialize variable
        Cow cow = new Cow(" ");

        // for loops through the cows array and prints out the message
        for(int i = 0; i < cows.length; i++)
        {
            if(cows[i].getName().equals(name))
            {
                cow = cows[i];
            }
        }
        return cow;
    }
}
