package week10;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Class10_24_1_Finding_the_Last_Element_in_a_Set_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {

        Set<String> elements = new LinkedHashSet<>();
        elements.add("1");
        elements.add("2");
        elements.add("3");
        elements.add("4");
        elements.add("5");
        findLast(elements);
    }

    public static String findLast(Set<String> elements) {

        String lastElement = null;

        for (String answer: elements) {
           // System.out.println(answer);
            lastElement=answer;
        }

       // System.out.println(lastElement);
        return lastElement;
    }
}
