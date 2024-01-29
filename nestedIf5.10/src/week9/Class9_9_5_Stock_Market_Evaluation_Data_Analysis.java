package week9;

public class Class9_9_5_Stock_Market_Evaluation_Data_Analysis {
    public static void main(String[] args) {
        findMaxStockPrice(new double[]{110.5, 112.0, 109.75, 115.25, 118.0, 117.5, 119.75});
    }

    public static void findMaxStockPrice(double[] doubles) {

        int index = 0;
        double max = doubles[0];

        for (int i = 0; i<doubles.length; i++) {

            if (max<doubles[i]) {
                max = doubles[i];
                index = i;
            }
        }
        index+=1;
        System.out.println("The highest stock price was $"+max+ " on day "+index);
    }
}
