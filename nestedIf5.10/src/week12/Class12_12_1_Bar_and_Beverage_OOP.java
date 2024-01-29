package week12;

import java.util.List;

public class Class12_12_1_Bar_and_Beverage_OOP {
    public static void main(String[] args) {

    }
}

class Bar {
    private String name;// Represents the name of the bar.
    private List<Beverage> beverages;

    private static int totalBars = 0;

    private final int MAX_CAPACITY = 100;

    public Bar(String name, List<Beverage> beverages) {
        this.name = name;
        this.beverages = beverages;
        totalBars++;
    }
    public void addBeverage(Beverage beverage) {
        if (beverages.size() < MAX_CAPACITY) {
            beverages.add(beverage);
            System.out.println(beverage.getName() + " added to " + this.getName());
        } else {
            System.out.println("Maximum capacity reached. Cannot add more beverages.");
        }
    }
    public void serveBeverages() {
        System.out.println("Beverages available at " + this.getName() + ":");
        for (Beverage beverage : beverages) {
            System.out.println("- " + beverage.getName() + " ($" + beverage.getPrice() + ")");
        }
    }

    public String getName() {
        return name;
    }

    public static int getTotalBars() {
        return totalBars;
    }
}

class Beverage {

    private String name;

    private double price;

    private static int totalBeverages = 0;

    private final double MAX_PRICE = 100;

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;

        totalBeverages++;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static int getTotalBeverages() {
        return totalBeverages;
    }

}