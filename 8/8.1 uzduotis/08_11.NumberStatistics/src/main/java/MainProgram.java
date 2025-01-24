
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();

        //Can use above statistics instead of start for new GENERAL SUM used for input part of exercise.
        Statistics start = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        //These bellow were commented out so not to intervene with part 2 of exercise.
        //Where personal input is needed.

//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());


        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        //Sum of user input exercise starts here.
        //ArrayList<Integer> list = new ArrayList<>() was not needed.
        //As exercise asked to use only our Statistics Big Block.

        System.out.println("Enter numbers:");
        int input = 0;

        //while (true) can write as well. Also, int input; without int input = 0;
        while (input != -1) {
            input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }
            start.addNumber(input);
            if (input % 2 == 0) {
                even.addNumber(input);
            }
            if (input % 2 != 0) {
                odd.addNumber(input);
            }

        }
        System.out.println("Sum: " + start.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());

    }
}


// In order for the tests to work, the objects must be created in the
// correct order in the main program. First the object that tracks the total
// sum, secondly the object that tracks the sum of even numbers,
// and lastly the one that tracks the sum of odd numbers!
// Enter numbers: 4,2,5,2,-1. Sum = 13; Sum of even= 8; Sum of odd= 5
