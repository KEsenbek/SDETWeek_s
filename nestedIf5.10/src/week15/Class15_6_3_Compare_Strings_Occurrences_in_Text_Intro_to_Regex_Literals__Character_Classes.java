package week15;

import java.util.ArrayList;

public class Class15_6_3_Compare_Strings_Occurrences_in_Text_Intro_to_Regex_Literals__Character_Classes {
    public static void main(String[] args) {

    }
    public static boolean compareArrayLists(ArrayList<String> list1, ArrayList<String> list2) {
        // Concatenate strings in each ArrayList after removing whitespaces
        String concatenatedString1 = concatenateAndRemoveWhitespace(list1);
        String concatenatedString2 = concatenateAndRemoveWhitespace(list2);

        // Check if the substrings are present in the concatenated strings
        boolean condition1 = concatenatedString1.contains("owni") ||
                concatenatedString1.contains("anan") ||
                concatenatedString1.contains("orop");

        boolean condition2 = concatenatedString2.contains("tebut") ||
                concatenatedString2.contains("meto") ||
                concatenatedString2.contains("ayis");

        // Return true if both conditions are satisfied, otherwise false
        return condition1 && condition2;
    }

    public static String concatenateAndRemoveWhitespace(ArrayList<String> list) {
        StringBuilder concatenatedString = new StringBuilder();
        for (String str : list) {
            concatenatedString.append(str.replaceAll("\\s", ""));
        }
        return concatenatedString.toString();
    }
}
