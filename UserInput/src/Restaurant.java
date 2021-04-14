import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("How much was the bill?");
        Scanner scanner = new Scanner(System.in);
        Double billTotal = Double.valueOf(scanner.next());
        System.out.println("How Many People in your party?");
        Double partySize = Double.valueOf(scanner.next());

        Double x = billTotal / partySize;

        System.out.format("Each person should pay %.2f", x);

    }


}
