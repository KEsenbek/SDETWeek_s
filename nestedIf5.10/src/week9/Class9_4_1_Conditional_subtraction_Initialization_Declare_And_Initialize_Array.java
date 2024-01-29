package week9;

public class Class9_4_1_Conditional_subtraction_Initialization_Declare_And_Initialize_Array {
    public static void main(String[] args) {
        subtractFromArray(new int[]{18});
    }

    public static int subtractFromArray(int[] numbers) {

        int sum = 0;
        if (numbers.length <= 1) {
            return 777;
        } else {
            if (numbers[0] > numbers[1]) {
                sum = numbers[0] - numbers[1];
                // System.out.println(sum);
            } else if (numbers[0] < numbers[1]) {
                sum = numbers[1] - numbers[0];
                // System.out.println(sum);

            } else {
                return 777;
            }

        }
        return sum;
    }
}
