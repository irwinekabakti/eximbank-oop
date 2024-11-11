public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars("Toyota", "Camry", 2020, 24000);
        car1.displayInfo();
        car1.startEngine();

        System.out.println();

        ElectricVehicles electricCar1 = new ElectricVehicles("Tesla", "Model S", 2022, 79999, 100, 396);
        electricCar1.displayInfo();
        electricCar1.startEngine();
    }
}
