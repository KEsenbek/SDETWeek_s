package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_9_2_Shopping_Cart_Reset_Maps {
    public static void main(String[] args) {

        Map<String, Integer> cart = new HashMap<>();
        cart.put("Apples",3);
        cart.put("Bananas",2);
        cart.put("Chocolates",5);
        boolean clear = true;

        resetCart(cart,clear);
    }

    public static Map<String,Integer> resetCart(Map<String, Integer> cart, boolean clear) {

        if (clear) {
            cart.clear();
            return cart;
        }else {
            return cart;
        }
    }
}
