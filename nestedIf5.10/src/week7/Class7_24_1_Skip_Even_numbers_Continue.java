package week7;

public class Class7_24_1_Skip_Even_numbers_Continue {
    public static void main(String[] args) {
        skipEvenNumbers(1,-5);
    }
    public static void skipEvenNumbers(int start, int end) {
        if (end<start) {
            System.out.println("Invalid end number!");
        }
        for (int i = start; i<=end; i++) {
             if (i%2 == 0 ) {
                continue;
            }

            System.out.println(i);
        }
    }
}
