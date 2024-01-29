package week10;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Class10_28_1_Duplicate_Filter_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");
        Set<String> set2 = new HashSet<>();
        set2.add("apple");
        set2.add("blueberry");
        set2.add("carrot");


        filterDuplicates(set1,set2);
    }

    public static Set<String> filterDuplicates(Set<String> set1, Set<String> set2) {

        set1.addAll(set2);
        return set1;
    }
}
