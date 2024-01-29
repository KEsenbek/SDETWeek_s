package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_7_2_Product_Price_Adjuster_Maps {
    public static void main(String[] args) {

        Map<String, Double> products = new HashMap<>();
        products.put("Laptop", 899.99);
        products.put("Phone", 599.99);
        String productName = "Laptop";
        Double newPrice = 799.99;

        adjustProductPrices(products,productName,newPrice);
    }

    public static Map<String ,Double> adjustProductPrices(Map<String, Double> products, String productName, Double newPrice) {

        products.replace(productName,newPrice);

        return products;

    }
}
