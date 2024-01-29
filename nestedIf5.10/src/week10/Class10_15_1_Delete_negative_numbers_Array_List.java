package week10;

import java.util.ArrayList;

public class Class10_15_1_Delete_negative_numbers_Array_List {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(0);
        nums.add(8);
        nums.add(-7);
        nums.add(-10);
        nums.add(10);
        nums.add(-20);
        nums.add(0);
        System.out.println(nums);
       ArrayList<Integer> ans =  removeNegativeNumbers(nums);
        System.out.println(ans);
    }

    public static ArrayList<Integer> removeNegativeNumbers(ArrayList<Integer> nums) {

        ArrayList<Integer> answer = new ArrayList<>();
        System.out.println(answer);
        for (int i = 0; i < nums.size(); i++) {

            if (nums.get(i) >= 0) {
                answer.add(nums.get(i));
            }

        }
        return answer;
    }
}
