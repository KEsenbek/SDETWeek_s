package week10;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Class10_22_1_Sorting_the_string_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        sortCharacters("We have had many views on our webinar. To be exact we had 1593");
    }

    public static Set<String> sortCharacters(String input) {
        Set<String> result = new LinkedHashSet<>();
        Set<String> uppercaseSet = new TreeSet<>();
        Set<String> lowercaseSet = new TreeSet<>();
        Set<String> numberSet = new TreeSet<>();
        Set<String> specialCharSet = new TreeSet<>();

        boolean encounteredAsterisk = false;

        for (char c : input.toCharArray()) {
            String charString = String.valueOf(c);

            if (charString.equals("*")) {
                return new LinkedHashSet<>();
            }

            if (Character.isUpperCase(c)) {
                uppercaseSet.add(charString);
            } else if (Character.isLowerCase(c)) {
                lowercaseSet.add(charString);
            } else if (Character.isDigit(c)) {
                numberSet.add(charString);
            } else if (!Character.isWhitespace(c)) {
                specialCharSet.add(charString);
            }
        }

        result.addAll(uppercaseSet);
        result.addAll(lowercaseSet);
        result.addAll(numberSet);
        result.addAll(specialCharSet);

        int sumOfNumbers = 0;
        for (String num : numberSet) {
            sumOfNumbers += Integer.parseInt(num);
        }

        if (sumOfNumbers % 2 == 0) {
            result.clear();
            result.add(String.valueOf(result.size()));
        }

        return result;
    }
}
