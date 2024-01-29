package week11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class11_11_3_Restaurant_Menu_Helper_Maps {
    public static void main(String[] args) {

        Map<String, Double> menu = new HashMap<>();
        menu.put("Burger", 8.99);
        menu.put("Salad", 5.49);
        menu.put("Pizza", 11.79);
        menu.put("Pasta",9.99);

        Double maxPrice = 10.00;

        restaurantMenuTracker(menu,maxPrice);
    }

    public static List<String> restaurantMenuTracker(Map<String, Double> menu, Double maxPrice) {

        List<String> answer = new ArrayList<>();

        for (Map.Entry<String,Double> eat: menu.entrySet()) {
            if (eat.getValue()<maxPrice) {
                answer.add(eat.getKey());
            }

            if (answer.isEmpty()) {
                answer.add("None");
            }
        }

        return answer;
    }
}
