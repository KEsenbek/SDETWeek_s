package week9;

public class Class9_4_1_Simple_array_calculation_Initialization_Declare_And_Initialize_Array {
    public static void main(String[] args) {
        calculateArray(new int[]{2, 3, 5, 12, 56, 53, 5});
    }

    public static int calculateArray(int [] value) {

        int sum = 0;
        int length =value.length-1;
        if (value.length <= 1){
            return 1;
        }else {
            sum = value[0]+value[length];
        }
        System.out.println(sum);
        return sum;

    }
}
