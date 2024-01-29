package week10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Class10_29_1_Compare_sentences_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {

        String str1 = "Each word here is prepared to practice Collections";

        String str2 = "Some word is here";

        compareWordCollections(str1, str2);
    }

    public static String[] compareWordCollections(String str1, String str2) {
        String[] finalResult = new String[]{};

        //  System.out.println(Arrays.toString(answer1));
        //  System.out.println(Arrays.toString(answer2));

        Set<String> result = new HashSet<>(List.of(str1.split(" ")));
        Set<String> result2 = new HashSet<>(List.of(str2.split(" ")));

        System.out.println(result);
        System.out.println(result2);

        if (result.containsAll(result2)) {
            return new String[0];
        }

        result.retainAll(result2);

        return result.toArray(new String[0]);
    }
}
