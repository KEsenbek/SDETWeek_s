package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_13_4_Vowel_Counter_Maps {
    public static void main(String[] args) {

        String[] words = {"Hello", "World", "Dialogue", "Education"};

        countAndPrintVowels(words);

        //Subresult:
        //Map<String, Integer> countedWords = {"Hello"=2, "World"=1, "Dialogue"=5, "Education"=5}
        //Output:
        //Dialogue - 5
    }

    public static void countAndPrintVowels(String[] words) {
        Map<String, Integer> countedWords = new HashMap<>();
        int maxCount = Integer.MIN_VALUE;
        String wordWithMaxCount = null;

        for (String word : words) {
            int vowelCount = 0;

            for (char ch : word.toCharArray()) {
                if ("AEIOUaeiou".indexOf(ch) != -1) {
                    vowelCount++;
                }
            }

            countedWords.put(word, vowelCount);

            if (vowelCount > maxCount) {
                maxCount = vowelCount;
                wordWithMaxCount = word;
            }
        }

        // Print the result
        System.out.println(wordWithMaxCount + " - " + countedWords.get(wordWithMaxCount));
    }
}
