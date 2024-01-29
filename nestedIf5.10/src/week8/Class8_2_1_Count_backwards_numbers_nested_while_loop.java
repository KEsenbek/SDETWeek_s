package week8;

public class Class8_2_1_Count_backwards_numbers_nested_while_loop {
    public static void main(String[] args) {
        printBackwards(5);
    }

    public static void printBackwards(int number) {
            if (number<=0) {
                System.out.println("Error! Number n can't be less than 1");
            }
        int j = number;
        int i = number;
            while (i>=1) {

                while (j>=1) {
                    System.out.print(j+" ");
                    j--;
                }
                System.out.println("");
                i--;

                j=i;
            }
    }
}
