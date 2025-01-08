
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here.
        System.out.println("Give speed:");
        int number = Integer.parseInt(scanner.nextLine());
        if (number <= 120) {
        } else {
            System.out.println("Speeding ticket!");
        }
    }
}
