
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int sum = firstNumber + secondNumber;
        int subtract = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
        double division = (double) firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtract);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiply);
        System.out.println(firstNumber + " / " + secondNumber + " = " + division);

    }
}
