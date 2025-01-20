public class Gauge {

    private int value;

    //Constructor
    public Gauge() {
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
