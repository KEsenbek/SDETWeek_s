package week9;

import java.util.Arrays;

public class Class9_15_1_Find_the_special_For_Each_Loop {
    public static void main(String[] args) {
        findStringsContainingSpecialChars(new String[]{"Hello!", "This is a test", "1234", "#$%^&*", "Goodbye!"});
    }

    public static String[] findStringsContainingSpecialChars(String[] inputArray) {
        String[] specialChars = {",", ".", "!", "?", ";", ":", "-", "&", "#"};

        int count = 0;
        for (String str : inputArray) {
            for (String specialChar : specialChars) {
                if (str.contains(specialChar)) {
                    count++;
                    break;
                }
            }
        }

        String[] result = new String[count];
        int index = 0;

        for (String str : inputArray) {
            for (String specialChar : specialChars) {
                if (str.contains(specialChar)) {
                    result[index++] = str;
                    break;
                }
            }
        }

        return result;
    }

}
