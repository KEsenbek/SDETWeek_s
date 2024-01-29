package week10;

public class CLass10_2_2_Calculating_the_Multiplication_or_Division_of_Two_Wrapper_Classes_Wrapper_Class {
    public static void main(String[] args) {
        calculate(5.0, 10, true);
    }

    public static double calculate(Double value1, Integer value2, Boolean isMultiplication) {

        if (isMultiplication) {
            return value1*value2;
        }else {
            return value1/value2;
        }
    }
}
