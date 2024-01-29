package week9;

public class Class9_4_1_Power_of_2_Initialization_Declare_And_Initialize_Array {
    public static void main(String[] args) {
        powerOfTwo(new int[]{-9, 54, 27, -123});
    }

    public static void powerOfTwo(int[] arr) {
        if (arr.length <=2 ) {
            System.out.println("Not enough data");
        }else if (arr[0]*arr[0]<arr[1]+arr[2]) {
            System.out.println("There is no power in first");
        }else {
            System.out.println("First is the greatest");
        }

    }
}
