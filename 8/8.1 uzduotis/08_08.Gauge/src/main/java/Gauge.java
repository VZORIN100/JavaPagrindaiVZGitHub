public class Gauge {

    private int value;

    //Constructor
    public Gauge() {
        //value = 0; //Sets initial value to 0 but empty constructor already does that.
    }

    public void increase() {
        if (value < 5) {
            value++;
        }
    }

    public void decrease() {
        if (value > 0) {
            value--;
        }
    }

    public int value() {
        return value;
    }

    public boolean full() {
        // Simplified return value == 5;
        if (value == 5) {
            return true;
        } else {
            return false;
        }
    }


}


//public void increase() {
//    if (value <= 5) {
//        value++;
//    }
//}
//
//public void decrease() {
//    if (value >= 0) {
//        value--;
//    }
//}
//
//public int value() {
//    return value;
//}
//
//public boolean full() {
//    if (value == 5) {
//        return true;
//    } else {
//        return false;
//    }
//}
