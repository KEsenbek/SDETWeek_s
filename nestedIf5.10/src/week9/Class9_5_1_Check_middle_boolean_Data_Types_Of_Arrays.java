package week9;

public class Class9_5_1_Check_middle_boolean_Data_Types_Of_Arrays {
    public static void main(String[] args) {
      int answer =  checkMiddle(new boolean[]{true, false, false, false, true, false});

        System.out.println(answer);

    }

    public static int checkMiddle(boolean[] booleans) {

        //Odd num
        if (booleans.length%2==1){
             if (booleans[(booleans.length-1)/2] == true ) {
                 //System.out.println(booleans.length/2+1);
                 System.out.println(booleans[(booleans.length-1)/2]);
                 return 1;
             }else {
                 System.out.println(booleans[booleans.length/2]);
                 return -1;
             }
        } else if (booleans.length == 0) {

            return -1;

        } else {
            if (booleans[(booleans.length-1)/2] == false && booleans[(booleans.length-1)/2+1] == false)
            {
                return -1;
            } else if (booleans[(booleans.length-1)/2] == false && booleans[(booleans.length-1)/2+1] == true) {
                return -1;
            }else {
                return 1;
            }

        }

    }
}
