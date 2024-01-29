package week10;
import  java.util.ArrayList;
import java.util.List;
public class Class10_14_1_Palindrome_word_Array_List {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("level");
        words.add("radar");
        words.add("solar");
        words.add("hello");


        List<Boolean> result = checkPalindromeWords(words);
        System.out.println(result);
    }

    public static List<Boolean> checkPalindromeWords(ArrayList<String> words) {
        List<Boolean> palindrome = new ArrayList<>();

        for (String word : words) {
            int left = 0;
            int right = word.length() - 1;
            boolean isPalindrome = true;

            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            palindrome.add(isPalindrome);
        }

        return palindrome;
    }
}
