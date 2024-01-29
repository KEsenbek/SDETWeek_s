package week8;

public class Class8_5_2_Printing_a_Multiplication_Table_with_a_Range_of_Numbers_ForLoop {
    public static void main(String[] args) {
        calculateMultiplicationTable(8,20);
    }

    public static void calculateMultiplicationTable(int start, int end) {

        for (int i = start; i<=end; i++) {

            for (int j = start; j<=end; j++){
                System.out.println(i + " * " + j+" = "+i*j);
            }
        }
    }
}
