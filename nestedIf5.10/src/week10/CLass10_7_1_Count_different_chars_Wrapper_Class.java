package week10;

public class CLass10_7_1_Count_different_chars_Wrapper_Class {
    public static void main(String[] args) {
        String str = "Hello World 123";
        String answer = countDigitsAndUppercase(str);
        System.out.println(answer);
    }

    public static String countDigitsAndUppercase(String str) {

        int digitCount = 0;
        int uppercaseCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digitCount++;
            } else if (Character.isUpperCase(str.charAt(i))) {
                uppercaseCount++;
            }
        }
        return "Digits: "+digitCount+", Uppercase: "+uppercaseCount;
    }
}
