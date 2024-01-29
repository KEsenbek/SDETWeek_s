package week8;

public class Class8_6_1_Print_multiple_X_ForLoop {
    public static void main(String[] args) {
        printMultipleX(3,4);
    }

    public static void printMultipleX(int n, int m) {

        for (int i = 1; i<=m; i++) {

            for (int j = 1; j<=n; j++) {
                System.out.print("X");
            }
            System.out.print(" ");
        }
    }
}
