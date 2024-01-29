package week8;

public class Class8_6_1_Sum_table_ForLoop {
    public static void main(String[] args) {
        printSumTable(3);
    }

    public static void printSumTable(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(i + j - 1);
                if (j < num) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
