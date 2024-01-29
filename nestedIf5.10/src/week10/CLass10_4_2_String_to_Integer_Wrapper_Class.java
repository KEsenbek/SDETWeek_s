package week10;

public class CLass10_4_2_String_to_Integer_Wrapper_Class {
    public static void main(String[] args) {
        String num1 = "10";
        String num2 = "20";
        sumOfIntegers(num1,num2);
    }

    public static Integer sumOfIntegers(String num1, String num2) {
        int value1 = Integer.parseInt(num1);
        int value2 = Integer.parseInt(num2);

        return value1+value2;
    }
}
