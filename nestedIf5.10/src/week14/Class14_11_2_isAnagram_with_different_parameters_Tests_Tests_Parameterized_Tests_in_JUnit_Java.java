package week14;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
public class Class14_11_2_isAnagram_with_different_parameters_Tests_Tests_Parameterized_Tests_in_JUnit_Java {
}

class AnagramChecker {
    public static boolean isAnagram(String word1, String word2) {
        // Remove spaces and convert to lowercase for a case-insensitive check
        String cleanedWord1 = word1.replaceAll("\\s", "").toLowerCase();
        String cleanedWord2 = word2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths of the cleaned words are equal
        if (cleanedWord1.length() != cleanedWord2.length()) {
            return false;
        }

        // Convert the cleaned words to character arrays and sort them
        char[] charArray1 = cleanedWord1.toCharArray();
        char[] charArray2 = cleanedWord2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }
}

class MainTest11_2 {
    //write your test here
    @ParameterizedTest
    @ValueSource(strings = {"listen,silent","astronomer,moon starer","The Morse Code,Here come dots"})

    public void testWordsAreAnagrams_Positive(String str){
        String[] words = str.split(",");
        String word1 = words[0].trim();
        String word2 = words[1].trim();
        assertTrue(AnagramChecker.isAnagram(word1,word2));
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello,world", "apple,banana", "programming,code"})
    public void testWordsAreNotAnagrams_Negative(String str){
        String[] word = str.split(",");
        String word1 = word[0].trim();
        String word2 = word[1].trim();

        assertFalse(AnagramChecker.isAnagram(word1,word2));

    }
}
