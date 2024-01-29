package week10;

import java.util.*;

public class Class10_29_2_Unique_Elements_Filter_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {


        Set<String> setOfWords = new HashSet<>(List.of("apple", "banana", "cherry", "date", "fig"));
        Set<String> setOfStopWords = new HashSet<>(List.of("apple", "banana", "date", "grape"));

        filterUniqueElements(setOfWords,setOfStopWords);
    }

    public static Set<String> filterUniqueElements(Set<String> setOfWords, Set<String> setOfStopWords) {

        Set<String> setOfWordsAnswer = new HashSet<>(setOfWords);

       // setOfWordsAnswer.retainAll(setOfStopWords);

        setOfWordsAnswer.removeAll(setOfStopWords);

        System.out.println(setOfWordsAnswer);
        return setOfWordsAnswer;
    }
}
