package week10;

import java.util.LinkedHashSet;
import java.util.Set;

public class Class10_20_1_Numbers_from_string_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        parseUniqueDigits("Hello 123 world! This is a test string 456 containing both words and numbers 789.");
    }

    public static LinkedHashSet<Integer> parseUniqueDigits(String input) {
        LinkedHashSet<Integer> uniqueDigitsSet = new LinkedHashSet<>();
        StringBuilder currentNumber = new StringBuilder();
        boolean isNegative = false;

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c) || (c == '-' && currentNumber.length() == 0)) {
                if (c == '-') {
                    isNegative = true;
                } else {
                    currentNumber.append(c);
                }
            } else {
                if (currentNumber.length() > 0) {
                    // Convert the current number to an integer and add it to the set
                    int numberToAdd = Integer.parseInt(currentNumber.toString());
                    if (isNegative) {
                        uniqueDigitsSet.add(-numberToAdd);
                    } else {
                        uniqueDigitsSet.add(numberToAdd);
                    }
                    currentNumber.setLength(0); // Reset the current number
                    isNegative = false;
                }
            }
        }

        // Check for any remaining number after the loop
        if (currentNumber.length() > 0) {
            int numberToAdd = Integer.parseInt(currentNumber.toString());
            if (isNegative) {
                uniqueDigitsSet.add(-numberToAdd);
            } else {
                uniqueDigitsSet.add(numberToAdd);
            }

        }

        return uniqueDigitsSet;
    }
}
