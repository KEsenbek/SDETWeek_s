package week11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Class11_3_1_Count_vowels_Maps {
    public static void main(String[] args) {
        String sentence = "I have an apple and a banana";
        countVowels(sentence);
    }

    public static Map<String,Integer> countVowels(String sentence) {

        Map<String, Integer> answer = new TreeMap<>();
        String[] values = sentence.split(" ");


        for (String value:values) {
            //System.out.println(values[i]);
            Integer counter = 0;
            for (int i = 0; i < value.length(); i++) {

                if (value.toLowerCase().charAt(i) == 'a' || value.toLowerCase().charAt(i) == 'e' ||
                        value.toLowerCase().charAt(i) == 'i' || value.toLowerCase().charAt(i) == 'o' ||
                        value.toLowerCase().charAt(i) == 'u') {

                //    System.out.println(value);
                    counter++;
            }


                //System.out.println(value);
        }
            answer.put(value,counter);
          //  System.out.println(counter);

           // System.out.println(Arrays.toString(values));


        }
      //  System.out.println(answer);
        return answer;
    }
}
