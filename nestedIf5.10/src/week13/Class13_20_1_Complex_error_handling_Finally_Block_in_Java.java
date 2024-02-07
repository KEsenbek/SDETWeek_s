package week13;

import java.util.ArrayList;
import java.util.Arrays;

public class Class13_20_1_Complex_error_handling_Finally_Block_in_Java {
    private static ArrayList<Object> filteredResult = new ArrayList<>();
    public static void main(String[] args) {
 // Static variable to store the filtered result

        Object[] objects = {50.1, 25.9, 80.0, 0.1, 'a', 123, 3.14, true, -5};
            double threshold = 2.5;

            ArrayList<Object> result = filterGreaterValues(objects, threshold);
            if (result != null) {
                System.out.println("Filtered Result: " + Arrays.toString(new ArrayList[]{result}));
            }
        }
     static ArrayList<Object> filterGreaterValues(Object[] objects, double threshold) {
         ArrayList<Object> filterResult = new ArrayList<>();
        try {
            for (Object obj : objects) {
                // Attempt to convert the object to a string and then to a double value
                double value = Double.parseDouble(obj.toString());

                // Check if the value is greater than the provided threshold
                if (value > threshold) {
                    // If it's greater, add the value to the filteredResult list
                    filteredResult.add(value);
                } else {
                    // If it's not greater, add 0 to the filteredResult list
                    filteredResult.add(0);
                }
            }

        }catch (Exception e) {
            // If an exception is caught, print a message along with the current result
            System.out.printf("Exception caught. Current result: %s\n", filteredResult);
        } finally {
            // Regardless of whether an exception was caught or not, this block is executed
            // Print a message indicating the "finally" clause has been reached
            System.out.println("Finally clause caught.");
        }

         // Return the filtered result ArrayList
         return filteredResult;
     }

}
