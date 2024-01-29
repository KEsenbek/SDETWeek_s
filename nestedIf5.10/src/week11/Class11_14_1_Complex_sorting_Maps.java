package week11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class11_14_1_Complex_sorting_Maps {
    public static void main(String[] args) {
        String income = "Hello, World! OpenAI 2023";
        sortWordsIntoCategories(income);
        //Output: { "Has Uppercase" : ["Hello", "World", "OpenAI"], "All Lowercase" : [], "Has Special Character" : ["Hello,", "World!"], "Has Digit" : ["2023"] }
    }

    public static Map<String, List<String>> sortWordsIntoCategories(String input) {
        // Create a map to store the categories and their corresponding word lists
        Map<String, List<String>> categories = new HashMap<>();
        categories.put("Has Uppercase", new ArrayList<>());
        categories.put("All Lowercase", new ArrayList<>());
        categories.put("Has Special Character", new ArrayList<>());
        categories.put("Has Digit", new ArrayList<>());
        // Split the input string into individual words
        String[] words = input.split("\\s+");
        // Iterate over each word and categorize it based on the criteria
        for (String word : words) {
            if (word.matches(".*[A-Z].*")) {
                // Word has uppercase characters
                categories.get("Has Uppercase").add(word);
            }
            if (word.matches(".*[a-z].*") && !word.matches(".*[A-Z].*")) {
                // Word has only lowercase characters
                categories.get("All Lowercase").add(word);
            }
            if (word.matches(".*[^A-Za-z0-9].*")) {
                // Word has special characters
                categories.get("Has Special Character").add(word);
            }
            if (word.matches(".*\\d.*")) {
                // Word has digits
                categories.get("Has Digit").add(word);
            }
        }
        return categories;
    }
}
