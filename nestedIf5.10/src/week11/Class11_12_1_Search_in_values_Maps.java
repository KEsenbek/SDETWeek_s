package week11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class11_12_1_Search_in_values_Maps {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1", "Apple");
        map.put("2", "Banana");
        map.put("3", "Cherry");
        map.put("4", "grapefruit");
        map.put("5", "Orange");
        map.put("6", "Pineapple");

        searchValue(map, "an"); 
        // Returns ["Banana", "Orange"], as these values contain the string "an" (ignoring case).
    }

    public static String[] searchValue(Map<String, String> map, String an) {

        List<String> answer = new ArrayList<>();

        for (String word: map.values()) {

            if (word.toLowerCase().contains(an.toLowerCase())) {
                answer.add(word);
            }
        }
        System.out.println(answer);
        return answer.toArray(new String[0]);
    }
}
