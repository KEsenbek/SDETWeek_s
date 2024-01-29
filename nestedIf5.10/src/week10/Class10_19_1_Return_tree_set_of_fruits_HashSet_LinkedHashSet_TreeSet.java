package week10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Class10_19_1_Return_tree_set_of_fruits_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {

        ArrayList<String> inputs = new ArrayList<>();
        inputs.add("apple");
        inputs.add("banana");
        inputs.add("orange");
        inputs.add("banana");
        inputs.add("avocado");
        returnTree(inputs);
    }

    public static TreeSet<String> returnTree(ArrayList<String> inputs) {
        Set<String> answer = new TreeSet<>(inputs);

        return (TreeSet<String>) answer;
    }
}
