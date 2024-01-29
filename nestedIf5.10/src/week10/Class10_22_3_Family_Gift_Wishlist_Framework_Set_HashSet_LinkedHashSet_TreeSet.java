package week10;

import java.util.HashSet;
import java.util.Set;

public class Class10_22_3_Family_Gift_Wishlist_Framework_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {

        System.out.println(getSize());          // Output: 0
        addGift("Toy");
        addGift("Book");
        addGift("Candle");
        System.out.println(isWishlistEmpty());  // Output: false
        System.out.println(getSize());          // Output: 3
        clearWishlist();
        System.out.println(getSize());          // Output: 0
        System.out.println(isWishlistEmpty());  // Output: true
    }

    private static Set<String> wishlist = new HashSet<>();

    public static void addGift(String gift) {
        wishlist.add(gift);
    }
    public static int getSize(){
        return wishlist.size();
    }

    public static void clearWishlist(){
        wishlist.clear();
    }

    public static boolean isWishlistEmpty() {
        return wishlist.isEmpty();
    }
}
