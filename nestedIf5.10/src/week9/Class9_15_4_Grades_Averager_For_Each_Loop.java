package week9;

public class Class9_15_4_Grades_Averager_For_Each_Loop {
    public static void main(String[] args) {
        calculateAverageGrade(new double[]{90.0, 85.5, 88.2, 92.7});
    }

    public static double calculateAverageGrade(double[] nums) {

        double sum = 0.0;

        for (double num: nums) {
            sum+=num;
        }
        return sum /nums.length;
    }
}
