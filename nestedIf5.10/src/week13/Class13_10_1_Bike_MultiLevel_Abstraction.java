package week13;

public class Class13_10_1_Bike_MultiLevel_Abstraction {
    public static void main(String[] args) {
        Bike bike = new Bike("Honda", 10.0, 250.0, 5);

        bike.start();
        bike.stop();
        bike.balance();

        double fuelEfficiency = bike.fuelEfficiency(100.0, 5.0);
        System.out.println("Fuel Efficiency: " + fuelEfficiency);

        double maxSpeed = bike.calculateMaxSpeed();
        System.out.println("Max Speed: " + maxSpeed);
    }
}

abstract class Vehicle{
    String brand;
    double fuelCapacity;

    public Vehicle(String brand, double fuelCapacity) {
        this.brand = brand;
        this.fuelCapacity = fuelCapacity;
    }

    public abstract void start();
    public abstract void stop();

    public double fuelEfficiency(double distanceTraveled, double fuelConsumed) {
        return distanceTraveled/fuelConsumed;
    }
}

abstract class TwoWheeler extends Vehicle{
    double enginePower;

    public TwoWheeler(double enginePower) {
        super("", 0);
        this.enginePower = enginePower;
    }
    public abstract void balance();

    public double calculateMaxSpeed() {
        return 2.5 * enginePower;
    }
}
class Bike extends TwoWheeler{
    int gears;

    @Override
    public void start() {
        System.out.println("Starting the bike...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the bike...");
    }

    @Override
    public void balance() {
        System.out.println("Balancing the bike...");
    }

    @Override
    public double calculateMaxSpeed() {
        return super.calculateMaxSpeed();
    }

    public Bike(String brand, double fuelCapacity, double enginePower, int gears) {
        super(enginePower);
        this.gears = gears;
        this.brand=brand;
        this.fuelCapacity=fuelCapacity;
    }
}