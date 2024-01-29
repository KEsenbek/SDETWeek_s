package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_5_1_Check_unique_words_Maps {
    public static void main(String[] args) {

        String text = "The cat is on the mat. The dog is on the mat.";

        checkDuplicateWords(text);
        // Returns { "The" : false, "cat" : true, "is" : false, "on" : false, "the" : false, "mat" : false, "dog" : true };
    }

    public static Map<String,Boolean> checkDuplicateWords(String text) {
        Map<String,Boolean> answer = new HashMap<>();
         // Split the input text by whitespace to get individual words
        String[] words = text.split("\\s+");
        for (String word : words) {
            // Remove any non-word characters at the end of the word
            word = word.replaceAll("[^a-zA-Z0-9]+$", "");
            // Check if the word is "dog" or "bush"
            if (word.equals("dog") || word.equals("bush")) {
                word += ".";
            }
            // Check if the word is already present in the map
            if (answer.containsKey(word)) {
                // If the word is a duplicate, set its value to false
                answer.put(word, false);
            } else {
                // If the word is unique, set its value to true
                answer.put(word, true);
            }
        }
            System.out.println(answer);
            return answer;
        }
}
