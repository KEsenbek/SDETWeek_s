package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_7_4_Grade_Book_Adjuster_Maps {
    public static void main(String[] args) {
        Map<String, Double> gradeBook = new HashMap<>();
        gradeBook.put("Alice", 92.5);
        gradeBook.put("Bob", 88.0);
        gradeBook.put("Carol" , 95.75);
        String studentName = "Bob";
        Double newGrade = 90.5;

        addOrUpdateGrade(gradeBook,studentName,newGrade);
    }

    public static Map<String,Double> addOrUpdateGrade(Map<String, Double> gradeBook, String studentName, Double newGrade) {
    
        if (gradeBook.get(studentName) == null) {
            gradeBook.put(studentName,newGrade);
            return gradeBook;
            } else if (gradeBook.containsKey(studentName)) {
            gradeBook.replace(studentName,newGrade);
            return gradeBook;
            }else {
            return gradeBook;
        }
            
        }
    }
