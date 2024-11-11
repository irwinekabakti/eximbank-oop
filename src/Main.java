public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars("Toyota", "Camry", 2020, 24000);
        car1.displayInfo();
        car1.startEngine();

        System.out.println();

        ElectricVehicles electricCar1 = new ElectricVehicles("Tesla", "Model S", 2022, 79999, 100, 396);
        electricCar1.displayInfo();  // call the inheritance methods using polymorphism, but will overriding the methods from parents and have different task
        electricCar1.startEngine();  // call the inheritance methods using polymorphism, but will overriding the methods from parents and have different task
    }
}
