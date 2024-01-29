package week10;

public class CLass10_6_1_Wrapper_Class_Comparison_Wrapper_Class {
    public static void main(String[] args) {
        Integer num1 = 323;
        Integer num2 = 323;
       boolean answer =  compareWrapperObjects(num1,num2);
        System.out.println(answer);
    }

    public static Boolean compareWrapperObjects(Integer num1, Integer num2) {

        return Integer.toString(num1).equals(Integer.toString(num2));
    }
}
