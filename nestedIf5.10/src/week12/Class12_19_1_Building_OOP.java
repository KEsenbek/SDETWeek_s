package week12;

public class Class12_19_1_Building_OOP {
    public static void main(String[] args) {

    }

}

class Building {
private String name;
private int floors;

    public Building(String name, int floors) {
        this.name = name;
        this.floors = floors;
    }

    public Building(String name) {
        this.name = name;
        this.floors=1;
    }

    public String getName() {
        return name;
    }

    public int getFloors() {
        return floors;
    }
}

class House extends Building{
private int bedrooms;

    public House(String name, int floors, int bedrooms) {
        super(name, floors);
        this.bedrooms = bedrooms;
    }

    public int getBedrooms() {
        return bedrooms;
    }
}

class Skyscraper extends Building {
    private int elevators;

    public Skyscraper(String name, int floors, int elevators) {
        super(name, floors);
        this.elevators = elevators;
    }

    public int getElevators() {
        return elevators;
    }
}