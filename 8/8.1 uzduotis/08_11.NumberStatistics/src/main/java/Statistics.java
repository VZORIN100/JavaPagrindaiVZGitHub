
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        count = 0;
        sum = 0;
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        count++;
        sum = sum + number;
    }

    public int getCount() {
        return count;
    }

//    public int sum() {
//        int number = 0;
//        for (int i = 0; i < count; i++) {
//            number = count;
//            sum = sum + number;
//        }
//        return sum;
//    }

    public int sum() {
        return sum;
    }

    public double average() {
        double average = 0;
        if (count != 0) {
            average = (1.0 * sum) / count;
            //Or just 1 line: return (1.0 * sum) / count;
        }
        return average;
    }

    //Was like this below. Tests did not pass since you can not divide by 0.
//    public double average() {
//        double average;
//        average = (1.0 * sum) / count;
//        return average;
//        //Or just 1 line: return (1.0 * sum) / count;
//    }
}
