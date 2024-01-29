package week7;

public class Class7_10_While_Loop_with_Strings_2_3 {
    public static void main(String[] args) {
        reverseCharactersOrder("Hello, World!");
    }

    public static String reverseCharactersOrder(String value) {
        int i = value.length()-1;

        while (i>=0) {
            System.out.print(value.charAt(i));
            i--;
        }
        return "";
    }
}
