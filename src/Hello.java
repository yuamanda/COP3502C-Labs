import java.util.Scanner;

public class Hello
{
    public static void main(String[] args)
    {
        System.out.print("Hello. What is your name? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        System.out.print("It's nice to meet you, " + name + ". How old are you? ");
        String age = scan.next();

        System.out.println("I see that you are still quite young at only " + age + ".");

        System.out.print("Where do you live? ");
        String live = scan.next();

        System.out.println("Wow! I've always wanted to go to " + live + ". Thanks for chatting with me. Bye!");
    }
}
