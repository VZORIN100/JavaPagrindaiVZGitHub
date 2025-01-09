
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String carryOnLoop;
        do {
            System.out.println("Shall we carry on?");
            carryOnLoop = scanner.nextLine();
        }
        while (!(carryOnLoop.equals("no")));

    }
}


