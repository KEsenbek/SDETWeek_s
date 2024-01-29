package week10;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Class10_16_1_Manipulate_strings_Array_List {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("air");
        words.add("world");
        words.add("programming");
        words.add("java");
        words.add("openai");
        manipulateStrings(words);
    }

    public static void manipulateStrings(ArrayList<String> words) {


        for (String word : words) {
            int length = word.length();
            if (length < 5) {
                System.out.println(word.toUpperCase());
            } else if (length >= 5 && length <= 10) {
                System.out.println(new StringBuilder(word).reverse().toString());
            } else {
                System.out.println(word.replaceAll("[aeiouAEIOU]", ""));
            }
        }
    }
}
