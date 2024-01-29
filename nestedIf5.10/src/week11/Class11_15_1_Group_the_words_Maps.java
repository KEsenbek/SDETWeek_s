package week11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Class11_15_1_Group_the_words_Maps {
    public static void main(String[] args) {
        Map<String,List<String>> map1 = new HashMap<>();
        map1.put("first", Arrays.asList("apple", "banana", "car"));
        map1.put("second", Arrays.asList("cat", "dog", "elephant"));
        map1.put("third", Arrays.asList("orange", "pear", "grape", "lemon", "kiwi"));

        groupAndCountMapValues(map1);
    // Returns {3=3, 4=2, 5=3, 6=2, 8=1}, where 3=3 is 3 words of length 3 in all lists, 4=2 is 2 words of length 4 in all lists and etc.
    }

    public static Map<Integer, Integer> groupAndCountMapValues(Map<String, List<String>> oldMap) {
        Map<Integer, Integer> newMap = new HashMap<>();
        // keys are the length of the strings
        // values are how many words have that length
        for (Map.Entry<String, List<String>> entry : oldMap.entrySet()) {
            //loops thru each original map entry
            for(String word : entry.getValue()){
                //loops through each word in the list
                int currentValue = word.length();
                if (newMap.containsKey( currentValue)) {
                    newMap.put( currentValue, newMap.get( currentValue) + 1);
                } else {
                    newMap.put(currentValue, 1);
                }
            }
        }
        return newMap;
    }
}
