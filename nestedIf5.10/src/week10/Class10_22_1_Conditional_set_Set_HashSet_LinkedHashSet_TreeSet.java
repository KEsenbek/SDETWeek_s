package week10;

import java.util.*;

public class Class10_22_1_Conditional_set_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        
        Set <String> ans = addUniqueChars("The quick brown fox jumps over the lazy dog");

        System.out.println(ans);
    }

    public static Set<String> addUniqueChars(String sentence) {
        Set<String> result = new LinkedHashSet<>();
        String[] sentArray = sentence.split("");
        for(String element : sentArray) {
            if (element.charAt(0) != ' ') result.add(element);

            if (Character.isDigit(element.charAt(0))) {
                result.clear();
                result.add("0");
                return result;
            }
            if (!Character.isLetter(element.charAt(0)) && (element.charAt(0) != ' ')) {
                result.clear();
                return result;
            }
        }
        return result;
    }
}
