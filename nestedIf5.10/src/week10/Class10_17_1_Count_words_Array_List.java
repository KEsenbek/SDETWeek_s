package week10;

import java.util.ArrayList;

public class Class10_17_1_Count_words_Array_List {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Avocado");
        words.add("orange");
        words.add("Artichoke");
        String letter = "A";
        countWordsStartingWith(words, letter);
    }

    public static int countWordsStartingWith(ArrayList<String> words, String letter) {
        int counter = 0;
        for (String word: words) {
            if (word.toLowerCase().startsWith(letter.toLowerCase())){
                counter++;
            }
        }
        return counter;
    }
}
