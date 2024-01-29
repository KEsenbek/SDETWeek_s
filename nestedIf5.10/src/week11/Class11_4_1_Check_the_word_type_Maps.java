package week11;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Class11_4_1_Check_the_word_type_Maps {
    public static void main(String[] args) {
        String sentences = "I have 2 apples and 3 bananas!";

        checkWordCharacters(sentences);
        // Returns { "I" : true, "have" : false, "2" : true, "apples" : false, "and" : false, "3" : true, "bananas!" : true };
    }

    public static Map<String,Boolean> checkWordCharacters(String sentences) {

        Map<String,Boolean> answer = new LinkedHashMap<>();

        String[] sentence = sentences.split(" ");

        Boolean isTrue = true;

        for (int i = 0; i<sentence.length;i++) {

                if (!sentence[i].equals(sentence[i].toLowerCase()) ||
                        sentence[i].matches(".*\\d.*") ||
                        !sentence[i].matches("[a-zA-Z0-9]*")) {
                    isTrue=true;
                    answer.put(sentence[i],isTrue);
                    //System.out.println( sentence[i] + " true ");
                } else {
                    isTrue=false;
                    answer.put(sentence[i],isTrue);
                   // System.out.println(sentence[i] +" false");
                }
            }


        System.out.println(answer);
        return answer;
    }
}
