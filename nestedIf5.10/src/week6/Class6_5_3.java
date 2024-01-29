package week6;

import java.util.Scanner;

public class Class6_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double performance = sc.nextDouble();
        getGrade(performance);
    }
    public static void getGrade(double studentPerformance) {
        // Get the grade based on the student's performance
        if (studentPerformance>=90){
            System.out.println("The student's grade is A");
        } else if (studentPerformance>=80 && studentPerformance<90){
            System.out.println("The student's grade is B");
        }else if (studentPerformance>=70 && studentPerformance<80){
            System.out.println("The student's grade is C");
        }else if (studentPerformance>=50 && studentPerformance<70){
            System.out.println("The student's grade is D");
        }else {
            System.out.println("The student's grade is F");
        }
    }
}
