package week15;

import java.util.ArrayList;
import java.util.Collections;

public class Class15_5_2_Subsequence_Occurrences_in_Text_Intro_to_Regex_Literals__Character_Classes {
    public static void main(String[] args) {
        extractSubsequences("1bB21");
    }

    public static ArrayList<String> extractSubsequences(String input) {
        ArrayList<String> subsequences = new ArrayList<>();
        // Iterate through the input string and look for valid subsequences
        for (int i = 0; i < input.length() - 5; i++) {
            String subsequence = input.substring(i, i + 5);
            if (subsequence.matches("[0-9a-zA-Z]{3}\\d[a-zA-Z]")) {
                subsequences.add(subsequence);
            }
        }
        // Sort the list of subsequences
        Collections.sort(subsequences);
        return subsequences;
    }
}
