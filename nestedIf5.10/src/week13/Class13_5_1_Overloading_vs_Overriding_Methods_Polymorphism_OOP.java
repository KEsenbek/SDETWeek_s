package week13;

public class Class13_5_1_Overloading_vs_Overriding_Methods_Polymorphism_OOP {
    public static void main(String[] args) {

    }
}

class Employees {
    private String name;
    private double salary;

    public Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }

    public double calculateSalary(double bonus) {
        return salary + bonus;
    }
}

class Managers extends Employees {
    public Managers(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (super.calculateSalary() * 0.1);
    }
}

class Salesperson extends Employees {
    private double salesAmount;

    public Salesperson(String name, double salary, double salesAmount) {
        super(name, salary);
        this.salesAmount = salesAmount;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (salesAmount * 0.05);
    }
}