package week10;

import java.util.HashSet;
import java.util.Set;

public class Class10_27_1_Word_Intersection_Detector_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");
        set1.add("date");
        Set<String> set2 = new HashSet<>();
        set2.add("banana");
        set2.add("date");
        set2.add("grape");
        set2.add("kiwi");

        findCommonWords(set1,set2);
    }

    public static Set<String> findCommonWords(Set<String> set1, Set<String> set2) {

        if (set1.containsAll(set2)) {
            return set1;
        }else {
            set1.retainAll(set2);
            return set1;
        }
    }
}
