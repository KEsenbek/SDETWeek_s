package week13;

public class Class13_2_1_Employee_Overriding_OOP {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "John Doe", 5000.0);
        employee1.displayDetails();
        System.out.println("Calculated Salary: " + employee1.calculateSalary());

        System.out.println();

        Manager manager1 = new Manager(2, "Jane Smith", 8000.0, 2000.0);
        manager1.displayDetails();
        System.out.println("Calculated Salary: " + manager1.calculateSalary());

        System.out.println();

        Developer developer1 = new Developer(3, "Mike Johnson", 4000.0, 150);
        developer1.displayDetails();
        System.out.println("Calculated Salary: " + developer1.calculateSalary());
    }
}

class Employee {
    protected int id;

    protected String name;

    protected double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: "+id+"\n" +
                "Name: "+name+"\n" +
                "Salary: "+salary);
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return bonus+salary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: "+bonus);
    }
}

class Developer extends Employee {
    private int hoursWorked;

    public Developer(int id, String name, double salary, int hoursWorked) {
        super(id, name, salary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        double hourlySalary = salary/160;
        return hourlySalary * hoursWorked;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hours Worked: "+hoursWorked);
    }
}