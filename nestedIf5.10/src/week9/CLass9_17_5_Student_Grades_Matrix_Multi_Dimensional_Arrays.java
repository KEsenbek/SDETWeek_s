package week9;

public class CLass9_17_5_Student_Grades_Matrix_Multi_Dimensional_Arrays {
    public static void main(String[] args) {
        int[][] studentGradesList = {
                {75, 80, 90},
                {85, 70, 78},
                {92, 88, 86}
        };

        int studentId = 1;
        int subjectId = 2;
        int newGrade = 95;

        // Set and print the updated student grades
        int[][] updatedGrades = setStudentGrade(studentGradesList, studentId, subjectId, newGrade);

        // Print the updated grades
        for (int i = 0; i < updatedGrades.length; i++) {
            for (int j = 0; j < updatedGrades[0].length; j++) {
                System.out.print(updatedGrades[i][j] + " ");
            }
            System.out.println();
        }

    }

        public static int[][] setStudentGrade(int[][] studentGradesList, int studentId, int subjectId, int newGrade) {
            if (studentGradesList == null || studentId < 0 || studentId >= studentGradesList.length
                    || subjectId < 0 || subjectId >= studentGradesList[0].length) {
                // Invalid parameters or out of bounds
                return studentGradesList;
            }

            // Update the specified grade
            studentGradesList[studentId][subjectId] = newGrade;

            return studentGradesList;
        }
}
