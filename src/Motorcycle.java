public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, Driver driver, boolean hasSidebar) {
        super(brand, year, driver);
        this.hasSidecar = hasSidebar;
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
