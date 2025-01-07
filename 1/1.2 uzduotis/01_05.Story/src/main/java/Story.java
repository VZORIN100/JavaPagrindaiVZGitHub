
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story," +
                " but I need some information first.\n" +
                "What is the main character called?");

        String messageOne = scanner.nextLine();

        System.out.println("What is their job?");

        String messageTwo = scanner.nextLine();

        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + (messageOne) + ", who was " + (messageTwo) + ".");
        System.out.println("On the way to work, " + (messageOne) + " reflected on life.");
        System.out.println("Perhaps " + (messageOne) + " will not be " + (messageTwo) + " forever.");
    }
}
