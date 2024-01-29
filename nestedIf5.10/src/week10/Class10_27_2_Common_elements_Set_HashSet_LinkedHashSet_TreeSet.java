package week10;

import java.util.HashSet;
import java.util.Set;

public class Class10_27_2_Common_elements_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("word1");
        set1.add("word3");
        set1.add("word5");

        Set<String> set2 = new HashSet<>();
        set2.add("word2");
        set2.add("word3");
        set2.add("word4");

        commonEl(set1,set2);
    }

    public static Set<String> commonEl(Set<String> set1, Set<String> set2) {

    set1.retainAll(set2);
        System.out.println(set1);
    return set1;
    }
}
