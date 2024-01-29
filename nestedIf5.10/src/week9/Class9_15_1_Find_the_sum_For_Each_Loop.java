package week9;

public class Class9_15_1_Find_the_sum_For_Each_Loop {
    public static void main(String[] args) {
        calculateSum(new double[]{1.2, 3.4, 5.6, 7.8, 9.0},5.0);
    }

    public static double calculateSum(double[] values, double v) {
        if (values.length == 0 ) {
            return 0.0;
        }
        double sum = 0.0;

        for (double value: values) {
            if (value<v) {
                sum-=value;
            } else if (value>v) {
                sum+=value;
            }

        }

         System.out.println(sum);

        return sum;
    }
}
