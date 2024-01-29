package week10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Class10_19_1_Return_set_of_fruits_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        ArrayList<String> inputs = new ArrayList<>();
        inputs.add("apple");
        inputs.add("banana");
        inputs.add("orange");
        inputs.add("banana");
        inputs.add("avocado");
        returnHash(inputs);
    }

    public static HashSet<String> returnHash(ArrayList<String> inputs) {

        Set<String> answer = new HashSet<>(inputs);

        return (HashSet<String>) answer;
    }
}
