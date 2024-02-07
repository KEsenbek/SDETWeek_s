package week13;

public class Class13_9_1_Drink_Abstraction {
    public static void main(String[] args) {
        Drink coffee = new Coffee("Espresso", 3.99, "Strong");
        Drink juice = new Juice("Orange Juice", 2.49, "Orange");

        coffee.serve();
        juice.serve();
    }
}

abstract class Drink{
    String name;
    double price;

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract void serve();
}

class Coffee extends Drink {

    String strength;

    public Coffee(String name, double price, String strength) {
        super(name, price);
        this.strength = strength;
    }

    public Coffee(String name, double price) {
        super(name, price);
    }

    @Override
    public void serve() {
        System.out.println("Serving a cup of coffee");
    }
}

class Juice extends Drink {

    String flavor;

    public Juice (String name, double price, String flavor) {
        super(name, price);
        this.flavor = flavor;
    }

    @Override
    public void serve() {
        System.out.println("Serving a glass of juice");
    }
}