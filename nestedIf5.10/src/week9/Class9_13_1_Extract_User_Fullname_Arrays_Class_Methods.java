package week9;

import java.util.Arrays;

public class Class9_13_1_Extract_User_Fullname_Arrays_Class_Methods {
    public static void main(String[] args) {
        getUserFullname(new String[]{"John", "Doe", "123456789", "john@example.com", "1990-01-01", "USA"});
    }

    public static String[] getUserFullname(String[] strings) {

            String[] fullName = Arrays.copyOf(strings,2);

             return fullName;

    }
}
