package week8;

public class Class8_3_2_Printing_a_Rectangle_WhileLoop {
    public static void main(String[] args) {
        printRectangle(3,5);
    }

    public static void printRectangle(int rows, int columns) {

        int i =1;
        while (i<=rows){

            int j = 1;
            while (j<=columns) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
