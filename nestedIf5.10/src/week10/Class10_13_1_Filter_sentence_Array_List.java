package week10;

import java.util.ArrayList;
import java.util.List;

public class Class10_13_1_Filter_sentence_Array_List {
    public static void main(String[] args) {

        String[] words = {"Hello", "World!", "JS", "@OpenAI", "Chatbot", "Test123", "$$", "!^$#"};

        filterWords(words);
    }

    public static List<String> filterWords(String[] words) {
        List<String> filteredWords = new ArrayList<>();

        for (String word : words) {
            int specialCharCount = 0;

            for (char ch : word.toCharArray()) {
                if (!Character.isLetterOrDigit(ch)) {
                    specialCharCount++;
                }
            }

            if (word.length() > 5 || (specialCharCount >= 1 && specialCharCount <= 3)) {
                filteredWords.add(word);
            }
        }

        return filteredWords;
    }
}
