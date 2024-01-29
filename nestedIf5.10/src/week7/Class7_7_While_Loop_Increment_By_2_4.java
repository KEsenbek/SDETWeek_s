package week7;

public class Class7_7_While_Loop_Increment_By_2_4 {
    public static void main(String[] args) {
        printOddSquares(5);
    }

    public static void printOddSquares(int num) {
        int i = 1;
        int j = 1;
        while (i<=num){
            j =i*i;
            System.out.println(i + "-" +i);
            i+=2;
        }
    }
}
