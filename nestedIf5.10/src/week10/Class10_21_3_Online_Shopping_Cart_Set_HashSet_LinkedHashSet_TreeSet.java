package week10;

import java.util.Set;
import java.util.TreeSet;

public class Class10_21_3_Online_Shopping_Cart_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {

        Set<String> shoppingCart =  new TreeSet<>();
        shoppingCart.add("carrot");
        shoppingCart.add("water");
        shoppingCart.add("potato");
        boolean isAdd = true;
        String item = "chocolate";
        manageCart(shoppingCart,isAdd,item);
    }

    public static Set<String> manageCart(Set<String> shoppingCart, boolean isAdd, String item) {

        if (isAdd) {
            shoppingCart.add(item);
            return shoppingCart;
        }else {
            shoppingCart.remove(item);
            return shoppingCart;
        }
    }
}
