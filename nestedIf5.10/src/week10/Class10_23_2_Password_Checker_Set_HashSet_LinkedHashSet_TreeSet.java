package week10;

import java.util.Set;
import java.util.TreeSet;

public class Class10_23_2_Password_Checker_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        Set<String> leakedPasswords = new TreeSet<>();
        leakedPasswords.add("password123");
        leakedPasswords.add("qwerty");
        leakedPasswords.add("12345678");
        String password = "SecurePassword";

        isSecurePassword(leakedPasswords,password);
    }

    public static boolean isSecurePassword(Set<String> leakedPasswords, String password) {

        if (password.length()<8) {
            return false;
        } else if (leakedPasswords.contains(password.toLowerCase())) {
            return false;
        }else {
            return true;
        }
    }
}
