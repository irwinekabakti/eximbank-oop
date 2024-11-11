public class ElectricVehicles extends Vehicles {
    private int batteryCapacity; // in kWh
    private int range;           // in miles

    // Constructor
    public ElectricVehicles(String brand, String model, int year, int batteryCapacity, int range) {
        super(brand, model, year); // Call the superclass (Vehicle) constructor
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    // Getters and Setters for batteryCapacity and range
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    // Implement the abstract method
    @Override
    public void startEngine() {
        System.out.println("The electric car's engine starts silently.");
    }

    // Override displayInfo to include battery and range details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh, Range: " + range + " miles");
    }
}
