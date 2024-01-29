package week9;

public class Class9_8_1_Sum_that_is_divisible_by_five_Array_Data_Analysis {
    public static void main(String[] args) {
       boolean answer =  isSumOfEvenDivisibleByFive(new int[]{});

        System.out.println(answer);
    }

    public static boolean isSumOfEvenDivisibleByFive(int[] array) {
        if (array.length <= 0 ) {
            return false;
        }

        int sum =0;
        for (int i = 0; i<array.length; i++) {

            if (array[i]%2==0){
                sum+=array[i];
            }
        }
        if (sum%5==0) {
            return true;
        }else {
            return false;
        }
    }
}
