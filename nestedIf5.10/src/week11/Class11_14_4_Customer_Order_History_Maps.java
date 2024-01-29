package week11;

import java.util.*;

public class Class11_14_4_Customer_Order_History_Maps {
    public static void main(String[] args) {
        Map<String, List<String>> orders = new HashMap<>();
        orders.put("Alice", Arrays.asList("Item A", "Item B"));
        orders.put("Bob",Arrays.asList("Item X"));
        String username = "Alice";
        List<String> orderToChange = new ArrayList<>(Arrays.asList("Item C", "Item D"));

        recordOrder(orders,username,orderToChange);
    }

    static String recordOrder(Map<String, List<String>> orders, String username, List<String> newOrder) {
        List<String> userOrders = new ArrayList<>();
        if (orders.containsKey(username)) {
            userOrders.addAll(orders.get(username));
        }
        userOrders.addAll(newOrder);
        return "Customer " + username + " has placed orders for " + userOrders;
    }
}
