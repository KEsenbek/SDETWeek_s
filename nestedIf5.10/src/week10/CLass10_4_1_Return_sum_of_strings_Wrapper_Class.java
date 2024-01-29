package week10;

public class CLass10_4_1_Return_sum_of_strings_Wrapper_Class {
    public static void main(String[] args) {
        String str1 = "5";
        String str2 = "10";

        calculateSum(str1,str2);
    }

    public static int calculateSum(String str1, String str2) {

        int value1 = Integer.parseInt(str1);
        int value2 = Integer.parseInt(str2);

        return value1+value2;
    }
}
