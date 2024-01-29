package week12;

import java.util.Map;
import java.util.Set;

public class Class12_13_1_Library_OOP {
    public static void main(String[] args) {

    }

}

class Library {
private Employee employee;
private String name;
private Map<String,String> openHours;
private Set<Floor> floors;

    public Library(String name, Map<String, String> openHours) {
        this.name = name;
        this.openHours = openHours;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getOpenHours() {
        return openHours;
    }

    public void setOpenHours(Map<String, String> openHours) {
        this.openHours = openHours;
    }

    public Set<Floor> getFloors() {
        return floors;
    }

    public void setFloors(Set<Floor> floors) {
        this.floors = floors;
    }
}

class Employee{
private String title;
private int age;
private double salary;
private Floor floor;

    public Employee(String title, int age, double salary, Floor floor) {
        this.title = title;
        this.age = age;
        this.salary = salary;
        this.floor = floor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}

class Floor{
    private int numberOfRooms;
    private String floorName;
    private boolean isBusy;

    public Floor(int numberOfRooms, String floorName, boolean isBusy) {
        this.numberOfRooms = numberOfRooms;
        this.floorName = floorName;
        this.isBusy = isBusy;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }
}