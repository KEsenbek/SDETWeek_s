package week11;

import java.util.*;

public class Class11_6_1_Prepare_numbers_Maps {
    public static void main(String[] args) {
        //List<Integer> ints = {-2, 3, 8, -1, 5, 0, 4, 7, -3, 6, -4, 1, 2, -1, 4, 6, 3, 2, 0, -3, 10, -2, -5};
        //{-4=Negative, -2=Negative, 0=Zero, 1=Positive Odd, 2=Positive Even, 3=Positive Odd, 4=Positive Even, 5=Positive Odd, 6=Positive Even, 7=Positive Odd, 8=Positive Even, 10=Positive Even}
        List<Integer> ints = new ArrayList<>(Arrays.asList(-2, 3, 8, -1, 5, 0, 4, 7, -3, 6, -4, 1, 2, -1, 4, 6, 3, 2, 0, -3, 10, -2, -5));
        classifyIntegers(ints);
    }

    public static Map<Integer, String> classifyIntegers(List<Integer> integers) {
        // Creates a TreeMap to store the classified integers and their categories.
        Map<Integer, String> resultMap = new TreeMap<>();
        // Creates a HashSet to track already processed integers to avoid duplicates.
        Set<Integer> processed = new HashSet<>();

        // Iterates through each integer in the input list.
        for (Integer num : integers) {
            // Checks if the current integer has already been processed.
            if (!processed.contains(num)) {
                processed.add(num); // Adds the current integer to the processed set.

                // Determines the category based on the integer's value.
                String category;
                if (num == 0) {
                    category = "Zero";
                } else if (num < 0) {
                    category = "Negative";
                } else if (num % 2 == 0) {
                    category = "Positive Even";
                } else {
                    category = "Positive Odd";
                }

                // Adds the classified integer and its category to the result map.
                resultMap.put(num, category);
            }
        }

        // Creates a List to store keys that need to be removed from the map.
        List<Integer> unwantedKeys = new ArrayList<>();

        // Iterates through all keys in the map.
        for (Integer key : resultMap.keySet()) {
            // Checks if the key is negative and odd (unwanted category).
            if (key < 0 && key % 2 != 0) {
                // Adds the unwanted key to the removal list.
                unwantedKeys.add(key);
            }
        }

        // Iterates over the list of unwanted keys and removes them from the map.
        for (Integer key : unwantedKeys) {
            resultMap.remove(key);
        }

        // Returns the final map with classified integers and their categories.
        return resultMap;
    }
}
