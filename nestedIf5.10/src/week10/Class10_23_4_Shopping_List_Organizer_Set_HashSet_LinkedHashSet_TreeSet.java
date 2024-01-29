package week10;

import java.util.Set;
import java.util.TreeSet;

public class Class10_23_4_Shopping_List_Organizer_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        Set<String> shoppingList = new TreeSet<>();
        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Eggs");

        String itemToAdd = "Bananas";

        organizeShoppingList(shoppingList,itemToAdd);
        
    }

    public static Set<String> organizeShoppingList(Set<String> shoppingList, String itemToAdd) {

    if (!shoppingList.contains(itemToAdd)) {
        shoppingList.add(itemToAdd);
        return shoppingList;
    }else {
        System.out.println("Item "+itemToAdd+ " is already in the list");
        return shoppingList;
        }
    }
}
