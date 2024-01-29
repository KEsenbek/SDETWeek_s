package week10;

import java.util.Set;
import java.util.TreeSet;

public class Class10_23_1_Check_the_word_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("avocado");
        String wordToCheck = "Apple";

        checkWord(words,wordToCheck);
    }

    public static boolean checkWord(Set<String> words, String wordToCheck) {

        return words.contains(wordToCheck.toLowerCase());
    }
}
