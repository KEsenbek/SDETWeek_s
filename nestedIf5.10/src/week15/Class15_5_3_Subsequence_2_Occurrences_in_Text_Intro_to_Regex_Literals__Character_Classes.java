package week15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class15_5_3_Subsequence_2_Occurrences_in_Text_Intro_to_Regex_Literals__Character_Classes {
    public static void main(String[] args) {
        //AB1CD
        //EF3GH
        //IJ5KL
        extractSubsequences("IJ5KL");
    }

    public static ArrayList<String> extractSubsequences(String input) {
        ArrayList<String> subsequences = new ArrayList<>();

        // Define the regular expression patterns for Format 1 and Format 2
        String format1Pattern = "[a-zA-Z]{2}\\d[a-zA-Z]{2}";
        String format2Pattern = "[a-zA-Z]{2}\\d{2}[a-zA-Z]";

        // Create Pattern objects
        Pattern pattern1 = Pattern.compile(format1Pattern);
        Pattern pattern2 = Pattern.compile(format2Pattern);

        // Create Matcher objects
        Matcher matcher1 = pattern1.matcher(input);
        Matcher matcher2 = pattern2.matcher(input);

        // Find subsequences matching Format 1
        while (matcher1.find()) {
            subsequences.add(matcher1.group());
        }

        // Reset Matcher for Format 2
        matcher2.reset();

        // Find subsequences matching Format 2
        while (matcher2.find()) {
            subsequences.add(matcher2.group());
        }
        Collections.sort(subsequences);
        return subsequences;
    }
}
