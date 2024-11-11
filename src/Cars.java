public class Cars extends Vehicles {
    private double price;

    // Constructor
    public Cars(String brand, String model, int year, double price) {
        super(brand, model, year); // Call the superclass (Vehicle) constructor
        this.price = price;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Implement the abstract method
    @Override
    public void startEngine() {
        System.out.println("The car's engine starts with a basic sound.");
    }

    // Override displayInfo to include price
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Price: $" + price);
    }
}


