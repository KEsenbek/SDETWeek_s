package week10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Class10_24_3_Spam_Filter_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        String message = "Get rich quick with our lottery deals!";
        Set<String> spamWordsList = new HashSet<>();
        spamWordsList.add("lottery");
        spamWordsList.add("rich");
        spamWordsList.add("gun");
        spamWordsList.add("drugs");

        filterSpam(message,spamWordsList);

        System.out.println(message.substring(message.indexOf(" ")));
    }

    public static boolean filterSpam(String message, Set<String> spamWordsList) {

        for (String word: spamWordsList) {
            if (message.toLowerCase().contains(word.toLowerCase())){
                return true;
            }
        }

        return false;
    }
}
