package week7;

public class Class7_8_While_Loop_Sum_All_Nums_1 {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        int sum = 0;
        while (i<10) {
//            System.out.println(i);
            i++;
            j+=2;
            sum+=j;
            System.out.println("Sum so far: "+sum);
        }
        System.out.println("Sum of first 10 even numbers: "+sum);
    }
}
