
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Value of the gift?");
        int grade = Integer.parseInt(scan.nextLine());
        if (grade >= 0 && grade < 5_000) {
            System.out.println("No tax!");
        } else if (grade >= 5_000 && grade < 25_000) {
            System.out.println("Tax: " + (100 + ((grade - 5_000) * 0.08)));
        } else if (grade >= 25_000 && grade < 55_000) {
            System.out.println("Tax: " + (1_700 + ((grade - 25_000) * 0.10)));
        } else if (grade >= 55_000 && grade < 200_000) {
            System.out.println("Tax: " + (4_700 + ((grade - 55_000) * 0.12)));
        } else if (grade >= 200_000 && grade < 1_000_000) {
            System.out.println("Tax: " + (22_100 + ((grade - 200_000) * 0.15)));
        } else {
            System.out.println("Tax: " + (142_100 + ((grade - 1_000_000) * 0.17)));
        }

    }
}
