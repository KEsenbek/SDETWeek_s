package week12;

public class Class12_19_1_Device_OOP {
    public static void main(String[] args) {

    }
}

class Device {
    private String brand;

    private String model;

    private double price;

    public Device(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 0.0;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}

class Laptop extends Device {
    private double screenSize;

    public Laptop(String brand, String model, double price, double screenSize) {
        super(brand, model, price);
        this.screenSize = screenSize;
    }

    public Laptop(String brand, String model, double screenSize) {
        super(brand, model);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }
}

class Smartphone extends Device {
    private String operatingSystem;

    public Smartphone(String brand, String model, double price, String operatingSystem) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
    }

    public Smartphone(String brand, String model, String operatingSystem) {
        super(brand, model);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
}