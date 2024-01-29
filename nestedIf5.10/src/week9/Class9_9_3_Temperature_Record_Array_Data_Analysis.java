package week9;

public class Class9_9_3_Temperature_Record_Array_Data_Analysis {
    public static void main(String[] args) {
        findMaxTemperature(new int[]{75, 82, 79, 88, 92, 86, 78});
    }

    public static void findMaxTemperature(int[] ints) {

        int highest  = ints[0];
        int index = 0;

        for (int i = 0; i<ints.length; i++) {
                if (ints[i]>highest) {
                    highest = ints[i];
                    index = i;
                }
        }
       // System.out.println(highest);
       // System.out.println(index);
        index+=1;

        System.out.println("The highest temperature was "+highest+ " on day "+index);
    }
}
