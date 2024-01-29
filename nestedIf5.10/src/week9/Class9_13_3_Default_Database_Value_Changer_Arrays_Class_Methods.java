package week9;

import java.util.Arrays;

public class Class9_13_3_Default_Database_Value_Changer_Arrays_Class_Methods {
    public static void main(String[] args) {
        changeDefaultValues(5,"Default");
    }

    public static String[] changeDefaultValues(int i, String value) {

        String[] answer = new String[i];
        Arrays.fill(answer,value);

        return answer;
    }
}
