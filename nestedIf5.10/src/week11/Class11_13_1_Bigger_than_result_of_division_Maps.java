package week11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class11_13_1_Bigger_than_result_of_division_Maps {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 5);

        map.put("banana", 10);

        map.put("cherry", 15);

        map.put("dog", 8);

        map.put("elephant", 20);

        getKeysGreaterThanDivision(map, 0.0);
        // Returns ["banana", "cherry", "elephant"], as their corresponding values are greater than the division result (5.8).
    }

    public static String[] getKeysGreaterThanDivision(Map<String, Integer> map, double v) {

        List<String> answer = new ArrayList<>();
        double switcher = 0.0;

        for (Integer counter: map.values()) {
            switcher+=counter;
        }
        switcher= switcher/v;
        System.out.println(switcher);

        if (v == 0 ) {
            for (Map.Entry<String,Integer> entry: map.entrySet()) {
                  answer.add(entry.getKey());
            }
        } else {
            for (Map.Entry<String,Integer> entry: map.entrySet()) {

                if (entry.getValue()>switcher){
                    answer.add(entry.getKey());
                }
            }

        }

        System.out.println(answer);
        return answer.toArray(new String[0]);
    }
}
