package week10;

import java.util.ArrayList;
import java.util.List;

public class Class10_15_1_Remove_duplicates_Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(10);
        nums.add(35);
        nums.add(22);
        nums.add(40);
        nums.add(10);
       List<Integer> ans = removeDuplicates(nums);
        System.out.println(ans);
    }

    public static List<Integer> removeDuplicates(List<Integer> nums) {

        List<Integer> uniqueNumbers = new ArrayList<>();
        List<Integer> nonUniqueNumbers = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            int element = nums.get(i); // Rest of the logic will be explained within this loop. }
            if (!uniqueNumbers.contains(element)) {
                if (nonUniqueNumbers.indexOf(element) == -1) {
                    uniqueNumbers.add(element);
                }
            } else {
                uniqueNumbers.remove(uniqueNumbers.indexOf(element));
                nonUniqueNumbers.add(element);
            }
        }
        return uniqueNumbers;
    }
}
