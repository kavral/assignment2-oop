public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Nick", "DLN000001");

        Car car1 = new Car("Mazda", 2024, driver1, 4, "gasoline");
        Motorcycle moto1 = new Motorcycle("Suzuki", 2022, driver1, false);
        Truck truck1 = new Truck("IVECO", 2023, driver1, 3.5f, 3);

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car1;
        vehicles[1] = moto1;
        vehicles[2] = truck1;

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayVehicleInfo();
            v.driver.displayDriverInfo();
            v.stopEngine();
        }
    }
}