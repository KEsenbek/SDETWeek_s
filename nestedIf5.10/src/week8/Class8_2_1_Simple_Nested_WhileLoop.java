package week8;

public class Class8_2_1_Simple_Nested_WhileLoop {
    public static void main(String[] args) {
        repeatString("Hello", 3);
    }

    public static void repeatString(String text, int repeatTimes) {

        int i = 1;

        while (i<=repeatTimes) {
            int j = 1;
            System.out.print(i + ". ");
            while (j<=i){
            System.out.print(text);

                if (j < i) {
                    System.out.print("");
                }
            j++;
            }

            System.out.println();
            i++;
        }
    }
}
