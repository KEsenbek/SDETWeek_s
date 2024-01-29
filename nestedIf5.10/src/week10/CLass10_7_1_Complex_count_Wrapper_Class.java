package week10;

import java.util.Arrays;

public class CLass10_7_1_Complex_count_Wrapper_Class {
    public static void main(String[] args) {
        String str = "Hello 123 World!";
        Integer[] answer = countCharacterTypes(str);

        System.out.println(Arrays.toString(answer));
    }

    public static Integer[] countCharacterTypes(String str) {


        Integer[] answer = new Integer[]{0,0,0,0};

        if (str.isEmpty()) {
            return answer;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    answer[0]++;
                } else if (Character.isDigit(str.charAt(i))) {
                    answer[1]++;
                } else if (Character.isWhitespace(str.charAt(i))) {
                    answer[2]++;

                }else {
                    answer[3]++;
                }
            }
        }
        return answer;
    }
}
