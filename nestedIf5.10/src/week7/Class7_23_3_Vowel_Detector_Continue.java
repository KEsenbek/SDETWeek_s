package week7;

public class Class7_23_3_Vowel_Detector_Continue {
    public static void main(String[] args) {
        detectVowels("Hello world");
    }

    public static void detectVowels(String text) {

        for (int i = 0; i<=text.length()-1; ) {
                if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                    System.out.println("Vowel detected at position "+i+": "+text.charAt(i));
                    i++;
                    continue;
                }

                i++;

        }
    }
}
