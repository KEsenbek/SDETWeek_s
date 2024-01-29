package week9;

import java.util.Scanner;

public class Class9_3_1_Simple_array_declaration_Declare_And_Initialize_Array {
    public static void main(String[] args) {
        createArray();
    }

    static int[] createArray() {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num<1) {
            return new int[1];
        }else {
            return new int[num];
        }
    }
}
