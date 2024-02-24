package week15;

import java.util.Arrays;

public class Class15_1_1_Literal_Characters_Exercise_Finding_Word_Occurrences_in_Text_Intro_to_Regex_Literals__Character_Classes {
    public static void main(String[] args) {

        findAndHighlightMatches("The cat sat on the mat. The cat and the dog are friends.","cat");

        //Text: The cat sat on the mat. The cat and the dog are friends.
        //The target word: cat
        //Matched Text: The <cat> sat on the mat. The <cat> and the dog are friends.
        //Occurrences of 'cat': 2
    }

    public static void findAndHighlightMatches(String text, String targetWord) {

        System.out.println("Text: "+ text);
        System.out.println("The target word: "+targetWord);

        String result2 = text.replaceAll(targetWord, "<"+targetWord+">");
        System.out.println("Matched Text: "+result2);

        String[] answer = text.split(targetWord);
        int count = answer.length-1;
        System.out.println("Occurrences of '"+targetWord+"': "+count);

    }
}
