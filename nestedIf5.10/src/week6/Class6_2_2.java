package week6;

public class Class6_2_2 {
    public static char getGrade(double studentCompletionPercentage) {
        // Get the grade based on the student's performance
        // dont't forget to add a return statement
        if (studentCompletionPercentage>90) {
            return 'A';
        } else if (studentCompletionPercentage>80 && studentCompletionPercentage<90) {
            return 'B';
        } else if (studentCompletionPercentage>70 && studentCompletionPercentage<80) {
            return 'C';
        } else if (studentCompletionPercentage>70 && studentCompletionPercentage<60) {
            return 'D';
        }else  {
            return 'F';
        }

    }

    // don't change this method
    public static void main(String[] args) {
        double studentPerformance = 85.0;
        char grade = getGrade(studentPerformance);

        System.out.println("The student's grade is " + grade);
    }
}
