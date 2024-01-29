package week11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class11_14_3_Student_Gradebook_Maps {
    public static void main(String[] args) {
        Map<String, List<Double>> gradeBook = new HashMap<>();
        gradeBook.put("Alice", List.of(new Double[]{90.0, 85.0, 92.0, 88.0, 76.0}));
        gradeBook.put("Charlie", List.of(new Double[]{95.0,89.0,94.0,88.0,91.0}));
        gradeBook.put("Bob", List.of(new Double[]{78.0,88.0,92.0,70.0,84.0}));

        calculateAndDisplayAverageGrades(gradeBook);
    }

    public static void calculateAndDisplayAverageGrades(Map<String, List<Double>> gradeBook) {

        for (Map.Entry<String, List<Double>> entry : gradeBook.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();

            double sum = 0.0;
            for (Double grade : grades) {
                sum += grade;
            }
            double average = 0.0;
            if (grades.isEmpty()) {
                     average = 0.0;
                }else {
                    average = sum / grades.size();
                }
            System.out.printf("%s - %.1f%n", studentName, average);
        }
    }
}
