package week6;

public class Class6_24_2 {
//Write a static method called extractFirstName()
// to extract the first name from a full name,
// you can write a method that takes a string representing the
// full name as input and returns a string representing the first name.
//Params:
//A string representing the full name (e.g. "John Doe")
//Return:
//A string representing the first name (e.g. "John")
public static void main(String[] args) {
    String anw = extractFirstName("Jane Smith Johnson");
    System.out.println(anw);
}

        public static String extractFirstName( String fullName) {


        int len = fullName.indexOf(" ");
        String anwer = fullName.substring(0,len);
            return anwer;
        }
}
