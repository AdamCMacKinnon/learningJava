import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loops {
    public static void main(String[]args) {

//        for (int i = 1; i <= 5; i++) {
//            if (i == 3){
//                continue;
//            }
//            System.out.println(i);
//        }

//        int i = 0;
//
//        while (i < 10) {
//            System.out.println("Test");
//            i = i + 1;
//            i++;
//        }

        // DO WHILE LOOP

//        Scanner scanner = new Scanner(System.in);
//        String again;
//        do {
//            int num = ThreadLocalRandom.current().nextInt(1, 7);
//            System.out.println("You Rolled a " + num);
//            System.out.println("Roll again? y/n ");
//            String again = scanner.next();
//
//        } while (!again.equals("y"));

        for (int x = 89; x <= 117; x++) {
            System.out.println(x);
        }
        for (int y = 1; y <= 40; y++){
            if (y % 3 ==0){
                System.out.println("quack");
            } else {
                System.out.println(y);
            }
        }

        Scanner scanner = new Scanner(System.in);
        String password;
        do {
            System.out.println("Enter your password: ");
            password = scanner.next();

        } while (!password.equals("shark50"));
        System.out.println("ACCESS GRANTED");


        for (int z = 0; z <=10; z++){
            System.out.println(z);
        }



    }

}
