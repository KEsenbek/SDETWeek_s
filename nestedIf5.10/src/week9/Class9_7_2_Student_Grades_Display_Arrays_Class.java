package week9;

import java.util.Arrays;

public class Class9_7_2_Student_Grades_Display_Arrays_Class {
    public static void main(String[] args) {
        displayStudentGrades(new double[]{85.0, 90.5, 78.0, 92.5, 87.5});
    }

    public static void displayStudentGrades(double[] grades) {

        System.out.println(Arrays.toString(grades));
    }
}
