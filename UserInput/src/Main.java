import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//        System.out.println(4.5-2.7);
//        System.out.format("I have %d cats, %.1f dogs, and 1 %s.", 7, 2.5, "panther");

        System.out.println("what is your name?");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        System.out.println(userInput + " is a nice name");

        System.out.println("\nHow old are you?");
        int userAge = scanner.nextInt();
        System.out.println("Your name is " + userInput + " and you are " + userAge + " years old.");

//        System.out.println("\nHow tall are you?");
//        double userHeight = Scanner.nextDouble();
//        System.out.println("You are " + userHeight + " tall ");
        int x = 2;
        int y = userAge + x;

        System.out.println("You've lived " + userAge + " years, in another " + x + " years you'll be " + y + " years old");

        int nameLength = userInput.length();

        System.out.println("your name is " + nameLength + " characters long!");






    }
}
