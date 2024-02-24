package week15;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class15_6_2_Text_analysis_Occurrences_in_Text_Intro_to_Regex_Literals__Character_Classes {
    public static void main(String[] args) {
        //If the text contains either the phrase "catch the fire" (case-insensitive),
        // "chemical misconception" (twice in the whole text),
        // or "coffee plantations" (four or more times), return a result with the key "result" and value 1 (integer).
        //If the text has a length less than 5 characters, return a result with the key "result" and value 0 (integer).

        //For any other case, return a result with the key "result" and value -1 (integer).
    }

    public static Map<String, Integer> analyzeText(String text) {
        Map<String, Integer> result = new HashMap<>();
        Pattern pattern = Pattern.compile("(catch the fire)|(chemical misconception){2}|(coffee plantations){4,}");
        Matcher matcher = pattern.matcher(text.toLowerCase());
        if (matcher.find()) {
            result.put("result", 1);
            return result;
        } else if (text.length() < 5) {
            result.put("result", 0);
            return result;

        } else {
            result.put("result", -1);
            return result;
        }
    }
}
