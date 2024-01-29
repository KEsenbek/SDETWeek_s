package week7;

public class Class7_6_While_Loop_With_Strings_1_1 {
    public static void main(String[] args) {
        splitCharacters("Mars");
    }

    public static String splitCharacters(String value) {

        int i = 0;
        while (i<=value.length()-1) {
            System.out.println(value.charAt(i));
            i++;
        }
        return "";
    }
}
