package week10;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Class10_20_1_Unique_chars_from_String_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        uniqueCharacters("Hello world");
    }

    public static LinkedHashSet uniqueCharacters(String inputText) {

        LinkedHashSet<Character> answer = new LinkedHashSet<>();

        for (int i = 0; i < inputText.length(); i++) {
            answer.add(inputText.charAt(i));
        }

        return answer;
    }
}
