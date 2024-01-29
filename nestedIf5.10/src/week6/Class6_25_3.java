package week6;

public class Class6_25_3 {

    //Write a method called getUserInitials() that takes a name and a surname
    // as input and returns their initials in uppercase.
    // Use charAt() and toUpperCase() methods. Also, you can use two ways to convert chars to Strings:
    //String.valueOf() - example: String str = String.valueOf(name.charAt(0))
    //Concatenate the empty string with 2 chars - example: String str = "" + char1 + char2
    //Params:
    //String name: The user's name.
    //String surname: The user's surname.
    //Return:
    //String: The user's initials.
    public static void main(String[] args) {
       String value = getUserInitials("Esenbek", "Kerimov");
        System.out.println(value);
    }

    public static String getUserInitials(String name, String surname) {
        String first = String.valueOf(name.charAt(0));
        String second = String.valueOf(surname.charAt(0));

        return first.toUpperCase()+second.toUpperCase();

    }
}
