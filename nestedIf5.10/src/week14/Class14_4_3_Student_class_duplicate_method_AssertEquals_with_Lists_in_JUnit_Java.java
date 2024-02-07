package week14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Class14_4_3_Student_class_duplicate_method_AssertEquals_with_Lists_in_JUnit_Java {
}
class Student {
    private static int nextId = 1; // Tracks the next available ID
    private int id;
    private String name;
    private int age;

    public Student(String name, int age) {
        this.id = nextId++;
        this.name = name;
        this.age = age;

        // Print student details
        System.out.println("New Student created:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public Student duplicate() {
        return new Student(this.name, this.age); // ID will be auto-incremented
    }

    // Getters for name, age, and id (for testing purposes)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}

class MainTest4_3{
    //write your tests here
    @Test
    public void testDuplicate(){
        Student student = new Student("Alice",20);

        Student duplicate = student.duplicate();
        assertEquals(student.getName(),duplicate.getName());
        assertEquals(student.getAge(),duplicate.getAge());
        assertEquals(student.getId()+1,duplicate.getId());


    }

    @Test
    public void testDuplicateMultipleStudents(){
        Student student = new Student("Alice",20);
        Student student2 = new Student("Bob",22);

        Student duplicateStudent = student.duplicate();
        Student duplicateStudent2 = student2.duplicate();

        assertEquals(student.getName(),duplicateStudent.getName());
        assertEquals(student.getAge(),duplicateStudent.getAge());

        assertEquals(student2.getName(),duplicateStudent2.getName());
        assertEquals(student2.getAge(),duplicateStudent2.getAge());


        assertEquals(student.getId()+2,duplicateStudent.getId());
        assertEquals(student2.getId()+2,duplicateStudent2.getId() );

    }
}

