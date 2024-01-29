package week6;

public class Class6_21_2 {
//    Write a static method called checkURL() that takes in a String parameter - a URL,
//    and then check if it starts with either https:// or http://.
//    If the URL starts with https://, the method should print out Establishing a secure connection.
//   If the URL starts with http://, the method should print out Establishing an insecure connection.
//   If the URL does not start with either https:// or http://, the method should print out Bad connection request.
    public static void main(String[] args) {
        checkURL("https://www.google.com");

    }

    public static void checkURL(String url) {
        if (url.startsWith("https://")) {
            System.out.println("Establishing a secure connection");
        } else if (url.startsWith("http://")) {
            System.out.println("Establishing an insecure connection");
        } else {
            System.out.println("Bad connection request");
        }
    }
}
