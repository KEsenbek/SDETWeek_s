package week11;

import java.util.*;

public class Class11_14_1_Swap_values_and_keys_Maps {
    public static void main(String[] args) {
        String income = "OpenAI is an artificial intelligence company";
        separateWordsByStartingLetter(income);
        //Output: { 'O' : ["OpenAI"], 'i' : ["is", "intelligence"], 'a' : ["an", "artificial"], 'c' : ["company"] }
    }

    public static Map<Character, List<String>> separateWordsByStartingLetter(String income) {
        Map<Character, List<String>> answer = new LinkedHashMap<>();
        // Split the input string into words
        String[] words = income.split("[., ]");

        // Process each word
        for (String word : words) {
            // Skip empty words
            if (word.isEmpty()) {
                continue;
            }

            // Get the starting letter of the word
            char startingLetter = word.charAt(0);

            // Update the map with the word
            List<String> wordList = answer.get(startingLetter);
            if (wordList == null) {
                wordList = new ArrayList<>();
                answer.put(startingLetter, wordList);
            }
            wordList.add(word);
        }

        return answer;
    }

}
