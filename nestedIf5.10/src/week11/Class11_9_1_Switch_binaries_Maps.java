package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_9_1_Switch_binaries_Maps {
    public static void main(String[] args) {


        binarySwitching("0101011");
        // Returns {0=false, 1=false, 2=false, 3=false};
        // ("1100101") // Returns {6=true} - the last digit is 1,
        // which means the map was emptied and the sequence was switched.
        //
        //binarySwitching("010100") // Returns {4=false, 5=false}
    }

    public static Map<Integer,Boolean> binarySwitching(String number) {
        System.out.println(number.lastIndexOf(number));

        Map<Integer,Boolean> answer = new HashMap<>();

        boolean currentValue = number.charAt(0) == '1';
        for (int i = 0; i < number.length(); i++) {

            char ch = number.charAt(i);
            boolean switchValue = ch == '1';

            if (switchValue != currentValue) {
                answer.clear();
                currentValue = switchValue;
            }
            answer.put(i, currentValue);
        }
        return answer;
    }

}
