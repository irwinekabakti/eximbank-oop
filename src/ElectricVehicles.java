public class ElectricVehicles extends Cars {
    private int batteryCapacity;
    private int range;

    public ElectricVehicles(String make, String model, int year, double price, int batteryCapacity, int range) {
        super(make, model, year, price);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }


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

    // Overriding startEngine to demonstrate polymorphism
    @Override
    public void startEngine() {
        System.out.println("The electric car's engine starts silently.");
    }

    // Display info with additional electric car details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh, Range: " + range + " miles");
    }
}
