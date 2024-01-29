package week9;

public class Class9_15_5_Defect_Checking_in_Car_For_Each_Loop {
    public static void main(String[] args) {
        isDefectPresent(new boolean[]{false, false, false, true, false});
    }

    public static boolean isDefectPresent(boolean[] checks) {

        int counter = 0;
        boolean isChecker = false;
        for (boolean check : checks) {
            isChecker = checks[0];
            if (check != isChecker) {
                counter++;
            } else if (check == true) {
                return false;
            }

        }

        if (counter > 1) {
            return false;
        } else {
            return true;
        }
    }
}
