import java.util.Scanner;

public class Room {

    //08TeamsChatExampleCode //private static int count = 0; // number of Employees created
    private String code;
    private int seats;

    //08TeamsChatExampleCode // Initialize Employee, add 1 to static count
    public Room(String classCode, int numberOfSeats) {
        code = classCode;
        seats = numberOfSeats;
        //08TeamsChatExampleCode //++count; // increment static count of employees
        //08TeamsChatExampleCode // count++ should work too
    }

    //08TeamsChatExampleCode // static method to get static count value
    //08TeamsChatExampleCode //public static int getSomethingCount() {
    //08TeamsChatExampleCode //     return count;
    //08TeamsChatExampleCode //}

    //08TeamsChatExampleCode // public String getSomethingClassCode() {
    //08TeamsChatExampleCode //      return code;
    //08TeamsChatExampleCode //  }
}