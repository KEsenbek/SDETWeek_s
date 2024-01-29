package week12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class12_11_1_Student_OOP {
    public static void main(String[] args) {

    }
}

class Students {

    private static List<String> studentList = new ArrayList<>();
    private Map<String, Integer> marks = new HashMap<>();
    private final String yearOfBirth;


    public Students(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public static List<String> getStudentList() {
        return studentList;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void addStudent(String name) {
        studentList.add(name);
    }

    public void addMarks(String subject, int mark) {
        if (mark >= 0 && mark <= 100) {
            this.marks.put(subject, mark);
        } else {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
        }
    }
}