package week8;

public class Class8_4_1_Number_and_word_pattern_ForLoop {
    public static void main(String[] args) {
        stringNumberPattern(4,"Hello");
    }

    public static void stringNumberPattern(int times, String text) {

        for (int i = 1; i<=times; i++){

            System.out.print(i+". ");
            for (int j = 1; j<=i; j++){
                System.out.print(text+" ");
            }
            System.out.println("");
        }
    }
}
