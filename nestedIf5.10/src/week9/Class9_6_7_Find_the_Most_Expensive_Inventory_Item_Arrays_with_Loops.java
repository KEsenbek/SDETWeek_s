package week9;

public class Class9_6_7_Find_the_Most_Expensive_Inventory_Item_Arrays_with_Loops {
    public static void main(String[] args) {
        findTheMostExpensiveItem(new String[]{"Mouse", "Keyboard", "Monitor", "Headphones", "Printer"}, new double[]{24.99, 49.99, 199.99, 99.99, 179.99}, new String[]{"Black", "Black", "Silver", "Red", "White"}, new int[]{0, 0, 0, 0, 0});
    }

    public static void findTheMostExpensiveItem(String[] names, double[] prices, String[] colors, int[] capacities) {

        double maxPrice = prices[0];
        int indexOfMaxPrice = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }
        }

        System.out.println("Product: "+ names[indexOfMaxPrice]);
        System.out.println("Price: $" + prices[indexOfMaxPrice]);
        System.out.println("Color: " + colors[indexOfMaxPrice]);
        System.out.println("Storage: " + capacities[indexOfMaxPrice]+"GB");

    }
}
