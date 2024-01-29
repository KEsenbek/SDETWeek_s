package week9;

import java.util.Arrays;

public class Class9_13_2_Find_the_Lowest_Bids_at_Auction_Arrays_Class_Methods {
    public static void main(String[] args) {
        findLowestBids(new double[]{120.5, 90.2, 110.0, 85.3, 95.7},2);
    }

    public static double[] findLowestBids(double[] values, int i) {
        Arrays.sort(values);
        double[] answer = Arrays.copyOf(values,i);

        return answer;
    }
}
