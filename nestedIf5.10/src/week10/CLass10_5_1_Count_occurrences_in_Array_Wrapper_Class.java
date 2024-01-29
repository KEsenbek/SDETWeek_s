package week10;

public class CLass10_5_1_Count_occurrences_in_Array_Wrapper_Class {
    public static void main(String[] args) {
        int[] intArr = {};
        String toFind = "6";
        int ans = countOccurrences(intArr,toFind);

        System.out.println(ans);

    }

    public static int countOccurrences(int[] intArr, String toFind) {

        int find = Integer.parseInt(toFind);
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {

            if (intArr[i] == find) {
                sum++;
            } else if (intArr[i] != find)  {
                sum+=0;
            }else {
                return 0;
            }

        }

        return sum;
    }
}
