package Conditionals;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class If_statements {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Welcome to SuperFast Rollecroaster!");
        System.out.println("Please enter your height in CM ");

        int height = scanner.nextInt();

        if (height < 130 || height > 210) {
            System.out.println("Sorry, you do not meet the requirements.");
        }
        else {
            System.out.println("Height Accepted. Go Ahead");
        } */

//        System.out.println("The VIP Lounge");
//        System.out.print("Age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("Do you have a VIP Pass? Yes/No: ");
//        String vipPassReply = scanner.next();

//        if (age >= 18 && vipPassReply.equals("yes") || age >= 70) {
//            System.out.println("Thanks, go on in.");
//        }
//        else {
//            System.out.println("Sorry, no can do.");

//        if (age >= 18) {
//            if (vipPassReply.equals("yes")) {
//                System.out.println("Thanks, go on in");
//            }
//            else {
//                System.out.println("Sorry, no can do, you must have a pass");
//            }
//        }
//        else {
//            System.out.println("Sorry, you must be either over 70 or have a vip pass");
//        }
        int x = 13;
        int y = 7;
        int z = x - y;

        if (x > y) {
            System.out.format("X is greater than Y! it's off by " + z);
        } else {
            System.out.format("Y is greater than X!  It's off by " + z);
        }

        System.out.println("Pick a number between 1 and 5!");
        Scanner scanner = new Scanner(System.in);

        int userNumber = scanner.nextInt();
        int randomNumber = ThreadLocalRandom.current().nextInt(1,6);

        if (userNumber == randomNumber) {
            System.out.println("Congratulations!  You guessed right!");
        } else {
            System.out.println("Try again!");
        }

    }
}


