public abstract class Vehicle {
    protected String brand;
    protected int year;
    protected Driver driver;

    public Vehicle(String brand, int year, Driver driver) { // A constructor
        this.brand = brand;
        this.year = year;
        this.driver = driver;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void displayVehicleInfo() {
        System.out.println("Vehicle brand: " + brand + "\nVehicle year: " + year);

    }
}
