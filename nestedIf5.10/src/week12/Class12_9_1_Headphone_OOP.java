package week12;

public class Class12_9_1_Headphone_OOP {
    public static void main(String[] args) {

    }
}

class Headphone  {

    private static String manufacturer = "Unknown";

    private static int totalHeadphones;

    private String model;// Represents the model of the headphone.

    private double price;// Represents the price of the headphone.

    private String color;// Represents the color of the headphone.

    private boolean isWireless;// Indicates whether the headphone is wireless or not.

    public Headphone() {
        totalHeadphones++;
    }

    public static int getTotalHeadphones(){
        return totalHeadphones;
    }

    public static void setManufacturer(String manufacturer) {
        Headphone.manufacturer = manufacturer;
    }

    public void displayDetails() {
        System.out.println("Model: "+model+"\n" +
                "Price: "+price+"\n" +
                "Color: "+color+"\n" +
                "Wireless: "+isWireless);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }
}