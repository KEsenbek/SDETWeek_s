package week11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class11_12_1_Odd_length_Maps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Rainbow sunset )");

        map.put(2, "This is a test.");

        map.put(3, "Java Programming");

        countUnevenValues(map);

        System.out.println(map.get(3).length()%2);

        // Returns 2, as there are two values with an uneven number of characters: "This is a test.", and "Java Programming".
    }

    public static int countUnevenValues(Map<Integer, String> map) {


        int count = 0;

        for (String value : map.values()) {
            value.replaceAll("[\\s,.]", "");
            //"[,\\.]" - this means "match a comma or dot". So this expression finds any comma or period in the string.
            //"[\\s,.]" - this means "match a space, comma, or dot"
            if (value.length()%2 !=0) {
                count++;
            }
        }


        return count;
    }
}
