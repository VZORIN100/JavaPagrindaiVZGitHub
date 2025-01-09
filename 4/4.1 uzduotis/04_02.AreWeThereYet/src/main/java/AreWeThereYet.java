
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stopper = 4;
        while (true) {
            System.out.println("Give a number");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == stopper) {
                break;
            }
        }
    }
}