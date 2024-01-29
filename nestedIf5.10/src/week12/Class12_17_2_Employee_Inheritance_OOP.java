package week12;

public class Class12_17_2_Employee_Inheritance_OOP {
    public static void main(String[] args) {

    }
}

class Employee{
    protected String name;// Represents the name of the employee;

    protected String employeeId;// Represents the id of the employee;

    protected double salary;// Represents the salary of the employee.

    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Employee ID: "+employeeId+"\n" +
                "Name: "+name+"\n" +
                "Salary: $"+salary);
    }
}

class Manager extends Employee{
    private String department;

    public Manager(String name, String employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    public void manageTeam() {
        System.out.println(name+" is managing the "+department+" team");
    }
}

class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, String employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void writeCode(){
        System.out.println(name+" is writing code in "+programmingLanguage);
    }
}