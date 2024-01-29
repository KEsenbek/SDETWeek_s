package week9;

public class Class9_8_1_Total_of_groceries_Array_Data_Analysis {
    public static void main(String[] args) {
        calculateTotalCost(new int[]{2, 3, 4}, new String[]{"apple", "banana", "orange"}, new double[]{0.5, 0.25, 0.75});
    }

    public static double calculateTotalCost(int[] quantities , String[] items, double[] costs ) {

        if (quantities.length != items.length || items.length != costs.length) {
            return - 1.0;
        }

        double sum = 0;

        for (int i = 0; i<items.length; i++) {
            if (costs[i]>0) {
            sum+=(costs[i]*quantities[i]);
            //System.out.println(sum);
            }else {
                return 0.0;
            }

        }
        return sum;
    }
}
