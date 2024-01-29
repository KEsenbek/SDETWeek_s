package week7;

public class Class7_6_While_Loop_With_Strings_1_4 {
    public static void main(String[] args) {
        searchCharacter("Hello", 'l');
    }

    public static int searchCharacter(String input, char letter) {

        int i = 0;
        int j = 0;
        while (i<=input.length()-1) {

            if (String.valueOf(input.charAt(i)).equalsIgnoreCase(String.valueOf(letter))){
                j++;
            }
            i++;
        }
        return j;
    }
}
