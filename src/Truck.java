public class Truck extends Vehicle {
    private float capacity;
    private int numAxles;

    public Truck(String brand, int year, Driver driver, float capacity, int numAxles) {
        super(brand, year, driver);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started" + "\n");
    }
    @Override
    public void stopEngine() {
        System.out.println("Engine stopped" + "\n" + "========" + "\n");
    }
}
