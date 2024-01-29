package week10;

public class CLass10_3_Auto_Boxing_Unboxing_Wrapper_Class {
    public static void main(String[] args) {

        //Autoboxing is a concept that converts literal values of primitive data types into Wrapper class.
        Integer num = 25; // autoboxing

        //Unboxing is a process of converts Wrapper class into corresponding primitive data types.
        int num2 = new Integer(5); //unboxing

        int sum = num + num2;
        System.out.println(sum);

        Double d = 25.0;
        Double d1 = 2.5;
        double result = d/d1;
        System.out.println(result);
    }
}
