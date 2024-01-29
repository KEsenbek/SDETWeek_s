package week9;

public class Class9_9_3_Temperature_Record_Array_Data_Analysis_Test {

    public static void main(String[] args) {

        findMaxTemperature(new int[]{100, 95, 85, 93, 84, 95, 80});
    }

    public static void findMaxTemperature(int[] ints) {

        int max = ints[0];
        int day = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (max<ints[i]) {
                max=ints[i];
                day=i;
            }
        }
        day+=1;
        System.out.println("The highest temperature was "+max+" on day "+day);
    }


}
