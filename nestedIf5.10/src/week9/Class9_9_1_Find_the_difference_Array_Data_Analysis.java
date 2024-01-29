package week9;

public class Class9_9_1_Find_the_difference_Array_Data_Analysis {
    public static void main(String[] args) {
        findAndCalculate(new int[]{2, 6, 8, 12, 24},new double[] {0.5, 1.25, 0.75, 2.5, 0.1});
    }

    public static double findAndCalculate(int[] ints, double[] doubles) {
        if (ints == null || doubles == null || ints.length == 0 || doubles.length == 0) {
            return -1.0;
        }

        int maxInt = ints[0];
        double minDouble = doubles[0];

        // Find the largest value in the integer array
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] > maxInt) {
                maxInt = ints[i];
            }
        }

        // Find the smallest value in the double array
        for (int i = 1; i < doubles.length; i++) {
            if (doubles[i] < minDouble) {
                minDouble = doubles[i];
            }
        }

        // Calculate the difference between the largest integer and the smallest double
        double result = maxInt - minDouble;
        return result;
    }
}
