package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_12_4_Inventory_Management_System_Maps {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Apples", 50);
        inventory.put("Bananas", 30);
        inventory.put("Oranges", 40);

        calculateTotalItems(inventory);
    }

    public static int calculateTotalItems(Map<String, Integer> inventory) {

        int sum = 0;

        for (Integer quantities : inventory.values()) {

            sum+=quantities;
        }

        return sum;
    }

}
