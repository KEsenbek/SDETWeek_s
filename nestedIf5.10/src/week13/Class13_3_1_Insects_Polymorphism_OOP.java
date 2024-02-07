package week13;

public class Class13_3_1_Insects_Polymorphism_OOP {
    public static void main(String[] args) {
        Insects insect = new Insects();
        Bee bee = new Bee();
        Ant ant = new Ant();

        System.out.println("Different Insects:");

        // Using the default displayInfo() method of Insect
        System.out.println("\nInsect:");
        insect.displayInfo();

        // Using the overridden displayInfo() method of Bee
        System.out.println("\nBee:");
        bee.displayInfo();

        // Using the overridden displayInfo() method of Ant
        System.out.println("\nAnt:");
        ant.displayInfo();

        // Additional Test Cases
        System.out.println("\nAdditional Test Cases:");

        Insects customInsect = new Insects();
        customInsect.setName("Custom Insect");
        customInsect.setLifeSpan(10);
        System.out.println("Custom Insect:");
        customInsect.displayInfo();

        Bee customBee = new Bee();
        customBee.displayInfo(); // Using overridden method to set Bee's info

        Ant customAnt = new Ant();
        customAnt.setLifeSpan(45);
        customAnt.displayInfo(); // Using overridden method to set Ant's info
    }
}

class Insects {
    protected String name;

    protected int lifeSpan;

    public void setName(String name) {
        this.name=name;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan=lifeSpan;
    }

    public void displayInfo() {
        System.out.println("This is an insect");
    }
}

class Bee extends Insects{
    @Override
    public void displayInfo() {
        setName("Bee");
        setLifeSpan(30);
        System.out.println(name+" has a lifespan of "+lifeSpan+" days");
    }
}

class Ant extends Insects {
    public void displayInfo() {
        setName("Ant");
        setLifeSpan(45);
        System.out.println(name+" has a lifespan of "+lifeSpan+" days");
    }
}
