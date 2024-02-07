package week14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class Class14_6_1_Testing_checkPalindromeWords_Method_With_Junit_2_AssertTrue_in_JUnit_Java {
}

class PalindromeUtils {

    public static boolean checkPalindromeWords(String word) {
        if (word == null) {
            System.out.println("nullInputTest executed");
            return false;
        }

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                System.out.println("nonPalindromeWordsTest executed");
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}


class MainTest6_1{
    //Write your tests here
    @Test
    public void nullInputTest(){
        PalindromeUtils palindromeUtils = new PalindromeUtils();
        PalindromeUtils.checkPalindromeWords("");

        assertFalse(PalindromeUtils.checkPalindromeWords(null));
    }

    @Test
    public void emptyStringTest(){
        assertTrue(PalindromeUtils.checkPalindromeWords(" "));
    }

    @Test
    public void nonPalindromeWordsTest(){
        assertFalse(PalindromeUtils.checkPalindromeWords("Apple"));
    }

    @Test
    public void singleCharacterTest(){
        assertTrue(PalindromeUtils.checkPalindromeWords("A"));
    }

    @Test
    public void checkPalindromeWordsTest(){
        assertTrue(PalindromeUtils.checkPalindromeWords("mom"));
    }

}