package week9;

public class Class9_8_4_Student_Grade_Analysis_Array_Data_Analysis {
    public static void main(String[] args) {
        analyzeStudentGrades(new String[]{"Alice", "Bob", "Charlie", "David"}, new double[]{92.5, 88.0, 95.5, 79.0});
    }

    public static void analyzeStudentGrades(String[] names, double[] grades) {

        double average = 0;
        double sum = 0;
        double highest = grades[0];
        double lowest = grades[0];
        String topScore = "";
        String lowestScore = "";

        for (int i = 0; i<grades.length; i++) {
            sum+=grades[i];
            if (grades[i]> highest) {
                highest=grades[i];
                topScore = names[i];
            }
            if (grades[i]<lowest) {
                lowest = grades[i];
                lowestScore = names[i];
            }
        }
        average+=sum/grades.length;

        System.out.println("Average Grade: "+average);
        System.out.println("Highest Grade: "+highest);
        System.out.println("Lowest Grade: "+lowest);
        System.out.println("Top Scorer: "+topScore);
        System.out.println("Lowest Scorer: "+lowestScore);
    }
}
