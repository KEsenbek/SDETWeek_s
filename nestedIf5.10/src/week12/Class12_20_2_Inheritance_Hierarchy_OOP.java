package week12;

public class Class12_20_2_Inheritance_Hierarchy_OOP {
    public static void main(String[] args) {
        Animal animal = new Animal("Unknown");
        Mammal mammal = new Mammal("Horse", 4);
        Dog dog = new Dog("Canine", 4, "Buddy");
        System.out.println("Animal Species: " + animal.getSpecies());
        System.out.println();
        System.out.println("Mamal Species: " + mammal.getSpecies());
        System.out.println("Number of Legs: " + mammal.getNumOfLegs());
        System.out.println();
        System.out.println("Dog Species: " + dog.getSpecies());
        System.out.println("Dog of Legs: " + dog.getNumOfLegs());
        System.out.println("Dog Name: " + dog.getName());
    }
}

class Animal{
private String species;

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }
}
class Mammal extends Animal{
private int numOfLegs;

    public Mammal(String species, int numOfLegs) {
        super(species);
        this.numOfLegs = numOfLegs;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }
}
class Dog extends Mammal{
private String name;

    public Dog(String species, int numOfLegs, String name) {
        super(species,numOfLegs);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

