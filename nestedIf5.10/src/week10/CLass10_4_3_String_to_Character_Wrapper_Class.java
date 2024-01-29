package week10;

public class CLass10_4_3_String_to_Character_Wrapper_Class {
    public static void main(String[] args) {
        String firstName = "gioanii";
        getFirstCharacter(firstName);
    }

    public static Character getFirstCharacter(String firstName) {

        char first = firstName.toUpperCase().charAt(0);

        return first;
    }
}
