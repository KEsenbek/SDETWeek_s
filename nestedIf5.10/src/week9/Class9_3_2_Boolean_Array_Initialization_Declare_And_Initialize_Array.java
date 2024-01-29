package week9;

import java.util.Arrays;

public class Class9_3_2_Boolean_Array_Initialization_Declare_And_Initialize_Array {
    public static void main(String[] args) {
       String answer = Arrays.toString(initializeBooleanArray(-10));

        System.out.println(answer);
    }

    public static boolean[] initializeBooleanArray(int num) {

        if (num>0) {
            return new boolean[num];
        } else if (num<0) {
            return new boolean[]{true};
        } else {
            return new boolean[0];
        }
    }
}
