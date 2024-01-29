package week10;

public class CLass10_5_1_Find_the_average_Wrapper_Class {
    public static void main(String[] args) {
        Integer[] values = new Integer[]{1, 2, 3, 4, 5};
        double ans = calculateAverage(values);
        System.out.println(ans);
    }

    public static Double calculateAverage(Integer[] values) {

        Double[] dValues = new Double[values.length];

        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            dValues[i] = (double) values[i];

            sum+=dValues[i];
        }
        return sum / values.length;
    }
}
