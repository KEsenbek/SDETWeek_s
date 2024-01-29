package week6;

public class Class6_21_5 {
    //Create a static method named validateURL() that takes two parameters:
    // a String url and a boolean secure. The method should determine
    // if the given URL is valid based on the following criteria:
    //If secure is true, the URL should start with https://;
    //If secure is false, the URL should start with http://.
    //The method should return true if the URL is valid according to the criteria, and false otherwise.
    public static void main(String[] args) {
        validateURL("http",true);
    }

    public static boolean validateURL(String url, boolean secure) {
        if (url.startsWith("https://") && secure) {
            return true;
        } else if (url.startsWith("http://") && !secure) {
            return true;
        }else {
            return false;
        }
    }
}
