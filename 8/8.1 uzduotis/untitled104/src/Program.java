public class Program {

    public static void main(String[] args) {
        // Create a circle with radius 5.0
        Circle myCircle = new Circle(5);
        // myCircle.radius = 5.5; // Compile error - radius is private

        // Increase myCircle's radius by 10%
        myCircle.setRadius(myCircle.getRadius() - 1);

        System.out.println("The radius of the circle is " + myCircle.getRadius());
        //System.out.println("The number of objects created is " + Circle.getNumberOfObjects());
    }

}
