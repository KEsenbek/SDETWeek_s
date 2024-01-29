package week7;

public class Class7_6_While_Loop_With_Strings_1_6 {
    public static void main(String[] args) {
        reverseString("World");
    }

    public static String reverseString(String  value) {

        int i = value.length()-1;

        while (0<=i){
            System.out.print(value.charAt(i));
            i--;
        }
        return "";
    }
}
