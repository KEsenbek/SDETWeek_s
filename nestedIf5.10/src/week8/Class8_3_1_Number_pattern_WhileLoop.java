package week8;

public class Class8_3_1_Number_pattern_WhileLoop {
    public static void main(String[] args) {
        printNumberTriangle(5);
    }

    public static void printNumberTriangle(int number) {

        int i = 1;
        while (i<=number) {
            int j = 1;
            while (j<=i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
