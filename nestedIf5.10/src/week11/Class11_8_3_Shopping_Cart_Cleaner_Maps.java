package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_8_3_Shopping_Cart_Cleaner_Maps {
    public static void main(String[] args) {

        Map<String, Integer> library = new HashMap<>();
        library.put("Item 1", 2);
        library.put("Item 2", 10);

        cleanShoppingCart(library);
    }

    public static String cleanShoppingCart(Map<String, Integer> library) {

        if (library.isEmpty()) {
            return "The cart is empty";
        }else {
            return "Removed from the cart: " + library;
        }
    }
}
