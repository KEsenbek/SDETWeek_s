package week12;

public class Class12_21_1_Person_OOP {
    public static void main(String[] args) {

    }
}
class Person{
    String name;

    int age;

    double height;

    double weight;

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}

class Student extends Person{
    String studentId;

    int gradeLevel;

    double GPA;

    String major;

    public Student(String name, int age, double height, double weight, String studentId, int gradeLevel, double GPA, String major) {
        super(name, age, height, weight);
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
        this.GPA = GPA;
        this.major = major;
    }

    public Student(String name, int age, double height, double weight) {
        this(name, age, height, weight, "N/A", 0, 0, "N/A");
    }

    public Student(String name, int age, String studentId, int gradeLevel) {
        this(name,age,0,0,studentId,gradeLevel,0,"N/A");
    }

    public Student(String name, int age) {
        this(name,age,0,0,"N/A",0,0,"N/A");
    }

    public Student() {
        this("N/A",0,0,0,"N/A",0,0,"N/A");
    }
}