import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // This is just an empty main method you can use to test
        // the Whistle class. Try for example:

        Scanner scanner = new Scanner(System.in);
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

//        System.out.println(duckWhistle.getDuckWhistle());
//        System.out.println(roosterWhistle.getRoosterWhistle());
//        System.out.println(roosterWhistle.getDuckWhistle());
//
        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
}
