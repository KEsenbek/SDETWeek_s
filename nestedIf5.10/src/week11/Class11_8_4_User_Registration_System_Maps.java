package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_8_4_User_Registration_System_Maps {
    public static void main(String[] args) {
        Map<String, String> registrationData = new HashMap<>();
        registrationData.put("JohnDoe", "");

        registerUser(registrationData);
    }

    public static String registerUser(Map<String, String> registrationData) {
        //System.out.println(registrationData);
        if (registrationData.isEmpty() || registrationData.containsValue("")) {
            return "Username and password cannot be empty";
        } else if (registrationData.size()==1) {
            return "Registration successful";
        }else {
            return "Invalid registration data";
        }
    }
}
