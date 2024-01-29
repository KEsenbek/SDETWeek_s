package week8;

public class Class8_5_1_X_pattern_with_range_ForLoop {
    public static void main(String[] args) {
        printX(3);
    }

    public static void printX(int times) {

        for (int i = 0; i < times; i++) {

            for (int j = 0; j < times; j++) {

                if (i == j || i == times - 1 - j) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}


