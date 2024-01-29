package week9;

import java.util.Arrays;

public class Class9_13_4_Driving_License_Test_Verifier_Arrays_Class_Methods {
    public static void main(String[] args) {
        verifyLicenseTest(new char[]{'A', 'B', 'C', 'D', 'A'}, new char[]{'A', 'B', 'C', 'D', 'A'});
    }

    public static boolean verifyLicenseTest(char[] chars, char[] chars1) {

        boolean isAnswers = Arrays.equals(chars, chars1);

        return isAnswers;
    }
}
