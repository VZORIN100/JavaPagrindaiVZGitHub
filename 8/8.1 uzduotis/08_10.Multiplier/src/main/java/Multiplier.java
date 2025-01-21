
public class Multiplier {

    private int number;  // an object variable for storing the value of the counter

    public Multiplier(int number) {
        this.number = number;
    }

    public int multiply(int number) {
        number = this.number * number;
        return number;
    }
}