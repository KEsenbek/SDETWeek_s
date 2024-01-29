package week10;

public class CLass10_2_1_Simple_math_Wrapper_Class {

    public static void main(String[] args) {

        Integer intValue = 5;
        Double doubleValue = 10.0;
        Boolean isSum = true;
        calculate(intValue ,doubleValue,isSum);
    }

    public static double calculate(Integer intValue, Double doubleValue, Boolean isSum) {


        if (isSum) {
            return intValue+doubleValue;
        } else {
            return intValue-doubleValue;
        }

    }
}
