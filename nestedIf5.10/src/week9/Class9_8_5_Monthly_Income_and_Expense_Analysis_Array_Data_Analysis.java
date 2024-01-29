package week9;

public class Class9_8_5_Monthly_Income_and_Expense_Analysis_Array_Data_Analysis {
    public static void main(String[] args) {
        analyzeMonthlyBudget(new double[]{2500.0, 2400.0, 2200.0, 2100.0, 2300.0, 2400.0, 2500.0, 2600.0, 2700.0, 2800.0, 2500.0, 2400.0}, new double[]{2600.0, 2700.0, 2800.0, 2900.0, 2800.0, 2600.0, 2400.0, 2300.0, 2400.0, 2500.0, 2700.0, 2600.0});
    }

    public static void analyzeMonthlyBudget(double[] income, double[] expenses) {

        int j = 1;
        double sum = 0;
        double total = 0;
        for (int i = 0; i < income.length; i++) {

            sum = income[i] - expenses[i];
            if (sum < 0) {
                System.out.println("Month " + j + ": Deficit of $" + (- sum));
                total+=sum;
                j++;

            }else {
                System.out.println("Month " + j + ": Surplus of $" + (sum));
                total+=sum;
                j++;
            }
        }
        System.out.println("Total Surplus/Deficit for the Year: $"+total);
    }
}
