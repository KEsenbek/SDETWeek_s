package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_5_3_Product_Availability_Checker_Maps {
    public static void main(String[] args) {

        Map<String, Integer> productAvailability = new HashMap<>();
        productAvailability.put("Laptop",5);
        productAvailability.put("Phone",0);
        productAvailability.put("Tablet",10);

        String productName = "Phone";

        isProductAvailable(productAvailability,productName);
    }

    public static Integer isProductAvailable(Map<String, Integer> productAvailability, String productName) {
        Integer answer = 0;

        if (productAvailability.containsKey(productName)) {
            return productAvailability.get(productName);
        }

        return answer;

    }
}
