package week11;

import java.util.Map;
import java.util.TreeMap;

public class Class11_13_5_Swap_values_and_keys_Maps {
    public static void main(String[] args) {

        Map<String,Integer> income = new TreeMap<>();
        income.put("apple",1);
        income.put("banaba",2);
        income.put("cherry",3);

        swapKeysAndValues(income);
    }

    public static Map<Integer,String> swapKeysAndValues(Map<String, Integer> income) {

        Map<Integer, String> outcome = new TreeMap<>();

        for (Map.Entry<String,Integer> entry: income.entrySet()) {
            outcome.put(entry.getValue(),entry.getKey());
        }
        //System.out.println(outcome);
        return outcome;
    }
}
