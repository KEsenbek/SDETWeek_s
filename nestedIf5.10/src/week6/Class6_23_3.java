package week6;

public class Class6_23_3 {

    //Create a Java program that takes a URL as String parameter and encodes it
    // by replacing all special characters with their URL-encoded equivalents.
    // You need to implement a static method named encodeURL() that takes a
    // String representing the URL as input and returns the encoded URL as a String.
    // In the URL encoding process, replace spaces ( ) with %20, question marks (?) with %3F,
    // ampersands (&) with %26, equals (=) with %3D.

    public static void main(String[] args) {
        encodeURL("https://www.example.com/programming languages & URL encoding");
    }

    public static String encodeURL(String url) {

        String value = url.replace(" ","%20").replace("?","%3F").replace("&","%26").replace("=","%3D");

        return value;
    }
}
