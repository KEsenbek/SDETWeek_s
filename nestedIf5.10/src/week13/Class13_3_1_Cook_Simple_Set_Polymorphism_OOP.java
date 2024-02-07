package week13;

import java.text.CollationKey;

public class Class13_3_1_Cook_Simple_Set_Polymorphism_OOP {
    public static void main(String[] args) {
        // Create instances and test cookFood() method
        System.out.println("\nTesting cookFood() method:");
        Cook chef = new Chef();
        chef.cookFood(); // Output: Cooking Pasta for 90 minutes.
        System.out.println("Chef's dish: " + chef.name + ", Time: " + chef.time);

        Cook baker = new Baker();
        baker.cookFood(); // Output: Baking Cake for 180 minutes.
        System.out.println("Baker's dish: " + baker.name + ", Time: " + baker.time);
    }
}

class Cook {
    String name;

    int time;

    public Cook(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public Cook() {
    }

    public void cookFood(){

    }
}

class Chef extends Cook{

    public Chef(String name, int time) {
        super(name, time);
    }

    public Chef() {
        super();
    }

    @Override
    public void cookFood() {
        super.cookFood();
    }
}

class Baker extends Cook{
    public Baker(String name, int time) {
        super(name, time);
    }

    public Baker() {
    }

    @Override
    public void cookFood() {
        super.cookFood();
    }
}