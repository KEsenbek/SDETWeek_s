package week10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Class10_20_3_Recipe_Ingredients_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {

        LinkedHashSet<String> ingredientsString = new LinkedHashSet<>();
        String newIngredient = "Flour";

        Set<String> answer = addIngredient(ingredientsString,newIngredient);

        System.out.println(answer);
    }

    public static LinkedHashSet<String> addIngredient(LinkedHashSet<String> ingredientsString, String newIngredient) {

        if (ingredientsString.contains(newIngredient)) {
            ingredientsString.add(newIngredient);
        }
        return ingredientsString;
    }
}
