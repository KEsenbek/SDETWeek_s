package week10;

import java.util.ArrayList;
import java.util.List;

public class Class10_14_1_Manipulate_list_Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(2);
        ints.add(4);
        ints.add(66);
        ints.add(80);
        ints.add(45);
        ints.add(-90);
        ints.add(42);
        ints.add(0);
        ints.add(8);

        // Manipulate and print the result
        ArrayList<Integer> result = manipulateIntegers(ints);
        System.out.println(result);
    }

    public static ArrayList<Integer> manipulateIntegers(ArrayList<Integer> ints) {

        ArrayList<Integer> answer = new ArrayList<>();

        for (Integer num : ints) {
            if (num % 2 == 0) {
                // Double the value of even numbers
                answer.add(num * 2);
            } else {
                // Halve the value of odd numbers
                answer.add(num / 2);
            }
        }

        int i = 0;
        while (i < answer.size()) {
            if (answer.get(i) % 5 == 0) {
                answer.remove(i);
            } else {
                i++;
            }
        }

        return answer;
    }
}
