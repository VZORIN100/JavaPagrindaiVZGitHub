
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.parseInt(scanner.nextLine());

        int seconds = days * 24 * 60 * 60;

        System.out.println(seconds);

    }
}
