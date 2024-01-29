package week11;

import java.util.LinkedHashMap;
import java.util.Map;

public class Class11_10_3_Upload_New_Grades_Maps {
    public static void main(String[] args) {

        Map<String, Double> currentGrades = new LinkedHashMap<>();
        currentGrades.put("Math",85.0);
        currentGrades.put("Science",90.5);
        Map<String, Double> newGrades = new LinkedHashMap<>();
        newGrades.put("Math",92.5);
        newGrades.put("History",88.0);

        uploadGrades(currentGrades,newGrades);
    }

    public static Map<String,Double> uploadGrades(Map<String, Double> currentGrades, Map<String, Double> newGrades) {
        currentGrades.putAll(newGrades);

        return currentGrades;
    }
}
