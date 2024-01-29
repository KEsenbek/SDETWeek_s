package week12;

public class Class12_17_1_Vehicles_OOP {
    public static void main(String[] args) {

    }
}
class  Vehicle{
    protected String brand;

    public Vehicle(String brand) {
        this.brand=brand;
    }

    public void start() {
        System.out.println("Starting the "+ brand);
    }

    public void stop(){
        System.out.println("Stopping the "+ brand);
    }
}

class Car extends Vehicle{
    private int numOfDoors;

    public Car(String brand, int numOfDoors) {
        super(brand);
        this.numOfDoors = numOfDoors;
    }

    public void drive(){
        System.out.println("Driving the "+brand+" with "+numOfDoors+" doors");
    }
}

class Motorcycle extends Vehicle{

    private boolean hasSidecar;

    public Motorcycle(String brand, boolean hasSidecar) {
        super(brand);
        this.hasSidecar = hasSidecar;
    }

    public void ride(){
        if (hasSidecar) {
            System.out.println("Riding the " + brand + " " + "with a sidecar");
        }
        else {
            System.out.println("Riding the " + brand + " " + "without a sidecar");
        }
    }
}