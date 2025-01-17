public class Circle {

    private int radius = 5; // Encapsulate radius
    //private static int numberOfObjects = 0;

    public Circle(int i) {
    }

    //public Circle() {
    //    numberOfObjects++;
    //}

    //public Circle(int newRadius) {
    //     radius = newRadius;
    //     numberOfObjects++;
    // }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int newRadius) {
        radius = newRadius;
        //radius = (newRadius >= 0) ? newRadius : 0;
    }

    // public static int getNumberOfObjects() {
    //      return numberOfObjects;
    // }
}