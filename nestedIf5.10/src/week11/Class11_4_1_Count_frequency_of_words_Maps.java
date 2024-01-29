package week11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Class11_4_1_Count_frequency_of_words_Maps {
    public static void main(String[] args) {
        String words = "apple banana apple orange banana apple";

        countWordFrequency(words);
        // Returns { "apple" : 3, "banana" : 2, "orange" : 1 }
    }

    public static Map<String,Integer> countWordFrequency(String words) {
        Map<String,Integer> answer = new TreeMap<>();
        String[] incomeWords = words.split(" ");


        for (String word: incomeWords) {
            Integer counter = 0;
            for (String word2 : incomeWords) {
                if (word.equals(word2)) {
                    counter++;
                }
            }
            answer.put(word,counter);
//            System.out.println(counter);
        }
        //System.out.println(answer);
        return answer;
    }
}
