package week10;

import java.util.HashSet;
import java.util.Set;

public class Class10_28_2_Non_Unique_Element_Counter_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");
        set1.add("pear");
        
        Set<String> set2 = new HashSet<>();
        set2.add("apple");
        set2.add("blueberry");
        set2.add("pear");
        set2.add("carrot");
               
        countNonUniqueElements(set1,set2);
    }

    public static int countNonUniqueElements(Set<String> set1, Set<String> set2) {

        set1.retainAll(set2);
        //System.out.println(set1);
        return set1.size();
    }
}
