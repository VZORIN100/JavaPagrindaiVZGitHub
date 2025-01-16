public class Product {

    private String name;
    private double price;
    private int quantity;

    // Initialize Employee, add 1 to static count
    public Product(String initialName, double initialPrice,
                   int initialQuantity) {
        name = initialName;
        price = initialPrice;
        quantity = initialQuantity;
    }

    // static method to get static count value
    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + quantity + " pcs");
    }

}
