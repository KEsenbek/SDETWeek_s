package week9;

public class Class9_9_4_Family_Vacation_Budget_Data_Analysis {
    public static void main(String[] args) {
        findMostExpensiveDay(new double[]{50.0, 75.5, 120.75, 90.25, 150.0, 85.5, 200.0});
    }

    public static void findMostExpensiveDay(double[] doubles) {

        int index = 0;
        double max = doubles[0];

        for (int i = 0; i<doubles.length; i++) {

            if (doubles[i]>max) {
                max = doubles[i];
                index = i;
            }

        }
        index+=1;
        System.out.println("The highest expenses were $"+max+" on day "+index);

    }
}
