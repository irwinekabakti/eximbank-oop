public abstract class Vehicles {
    // Fields common to all vehicles
    protected String brand;
    protected String model;
    protected int year;

    // Constructor
    public Vehicles(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Abstract method - to be implemented by subclasses
    public abstract void startEngine();

    // Concrete method for displaying vehicle info
    public void displayInfo() {
        System.out.println("Make: " + brand + ", Model: " + model + ", Year: " + year);
    }
}