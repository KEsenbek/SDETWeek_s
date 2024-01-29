package week7;

public class Class7_6_While_Loop_With_Strings_1_2 {
    public static void main(String[] args) {
        printConcatenatedString("Hello","World it is me");
    }
    public static void printConcatenatedString(String str1, String str2) {

        int i = 0;
        int j = 0;
        while (i<=str1.length()-1) {
            System.out.printf(""+str1.charAt(i)+"-");

            i++;
        }
        while (j<=str2.length()-1) {
            System.out.printf("" + str2.charAt(j) + "-");
            j++;
        }
    }
}
