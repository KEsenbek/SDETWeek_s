package week10;

import java.util.ArrayList;
import java.util.List;

public class Class10_11_1_Last_vowel_and_consonant_Array_List {
    public static void main(String[] args) {
        String text = " ";
        List<Character> ans = lastVowelAndConsonant(text);
        System.out.println(ans);
    }

    public static List<Character> lastVowelAndConsonant(String text) {
        
        List<Character> answer = new ArrayList<>();
        if (text.isEmpty()) {
            return answer;
        }
        char firstVowel = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                return answer;
            } else if (Character.isWhitespace(text.charAt(i))) {
                return answer;
            }

            if (Character.valueOf(text.toLowerCase().charAt(i)) == 'a' || Character.valueOf(text.toLowerCase().charAt(i)) == 'e'||
                       Character.valueOf(text.toLowerCase().charAt(i)) == 'i' || Character.valueOf(text.toLowerCase().charAt(i)) == 'o'||
                       Character.valueOf(text.toLowerCase().charAt(i)) == 'u' ) {
                firstVowel = text.toLowerCase().charAt(i);
                break;
            }

        }
        char lastConsonant = text.charAt(text.length()-1);
         answer.add(firstVowel);
         answer.add(lastConsonant);

         return answer;
    }
}
