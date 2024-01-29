package week11;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Class11_3_1_Check_length_of_word_Maps {
    public static void main(String[] args) {
        String sentence = "I have an apple and a banana";

        checkWordLength(sentence);
    }

    public static Map<String,Boolean> checkWordLength(String sentence) {

        Map<String,Boolean> answer = new LinkedHashMap<>();

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        Boolean isTrue = true;

        for (String word: words) {

            if (word.length()%2==0) {
                isTrue = true;
                answer.put(word,isTrue);
            }else {
                isTrue=false;
                answer.put(word,isTrue);
            }

        }


        System.out.println(answer);
        return answer;
    }
}
