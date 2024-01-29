package week6;

public class Class6_21_3 {
    public static void main(String[] args) {
        checkDomain("https://www.google.com");
        
    }

    public static boolean checkDomain(String domain) {
        if (domain.endsWith(".com") || domain.endsWith(".org") || domain.endsWith(".net")) {
            return true;
        }else {
            return false;
        }
    }
}
