package week10;

import java.util.HashSet;
import java.util.Set;

public class Class10_26_1_Recipe_Ingredients_Matcher_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {

        Set<String> recipe1 = new HashSet<>();
        recipe1.add("Chocolate");
        recipe1.add("Sugar");
        recipe1.add("Flour");
        Set<String> recipe2 =  new HashSet<>();
        recipe2.add("Chocolate");
        recipe2.add("Flour");

        matchIngredients(recipe1,recipe2);
    }

    public static void matchIngredients(Set<String> recipe1, Set<String> recipe2) {

        if (recipe1.containsAll(recipe2)) {
            System.out.println("Recipe 1 contains all ingredients from Recipe 2");
        } else if (recipe2.containsAll(recipe1)) {
            System.out.println("Recipe 2 contains all ingredients from Recipe 1");
        } else {
            System.out.println("Neither recipe contains all ingredients from the other");
        }
    }
}
