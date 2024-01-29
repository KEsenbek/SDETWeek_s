package week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class10_17_1_Prepare_statistics_Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(78);
        scores.add(92);
        scores.add(85);
        scores.add(64);
        scores.add(55);
        calculateStatistics(scores);
    }

    public static int[] calculateStatistics(ArrayList<Integer> scores) {
        int[] result = new int[3];
        if (scores.isEmpty()) {
            result[0] = 0;
            result[1] = 0;
            result[2] = 0;
            return result;
        }
        int sum = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            sum += score;
            if (score > largest) {
                largest = score;
            }
            if (score < smallest) {
                smallest = score;
            }
        }
        int average = sum / scores.size();
        result[0] = average;
        result[1] = largest;
        result[2] = smallest;
        return result;
    }
}
