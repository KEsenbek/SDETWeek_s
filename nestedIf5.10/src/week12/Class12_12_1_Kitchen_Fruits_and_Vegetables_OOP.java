package week12;

import java.util.HashMap;
import java.util.Map;

public class Class12_12_1_Kitchen_Fruits_and_Vegetables_OOP {
    public static void main(String[] args) {

    }
}

class Kitchen {

    private Map<Veges, Double> vegesInventory;// Represents the inventory of vegetables in the kitchen, where the key is a Vege instance and the value is the weight in kilograms.

    private Map<Fruits, Double> fruitsInventory;

    public Kitchen() {
        this.vegesInventory = new HashMap<>();
        this.fruitsInventory = new HashMap<>();
    }

    public void addVegetable(Veges vege, double weight) {
        vegesInventory.put(vege, weight);
    }

    public void addFruit(Fruits fruit, double weight) {
        fruitsInventory.put(fruit, weight);
    }

    public Map<Veges, Double> getVegeInventory() {
        return vegesInventory;
    }

    public Map<Fruits, Double> getFruitInventory() {
        return fruitsInventory;
    }

    public void removeVegetable(Veges vege) {
        vegesInventory.remove(vege);
    }

    public void removeFruit(Fruits fruit) {
        fruitsInventory.remove(fruit);
    }
}

class Veges{
    private String name;// Represents the name of the vegetable.

    private final String arrivalTime;// Represents the arrival time of the vegetable.

    private final String expireDate;

    public Veges(String name, String arrivalTime, String expireDate) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.expireDate = expireDate;
    }

    public String getName() {
        return name;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getExpireDate() {
        return expireDate;
    }
}

class Fruits {
    private String name;// Represents the name of the fruit.

    private final String arrivalTime;// Represents the arrival time of the fruit.

    private final String expireDate;//

    public Fruits(String name, String arrivalTime, String expireDate) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.expireDate = expireDate;
    }

    public String getName() {
        return name;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getExpireDate() {
        return expireDate;
    }
}