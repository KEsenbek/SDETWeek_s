package week9;

public class Class9_5_1_Check_letter_in_last_word_Data_Types_Of_Arrays {
    public static void main(String[] args) {
        checkLetter(new String[]{"Combo", "wedevx", "", " ", "This is the longer string"},'G');
    }

    public static boolean checkLetter(String[] arr, char value) {

       // System.out.println(arr[arr.length-1]);

        if (arr.length-1 !=-1 && arr[arr.length-1].contains(String.valueOf(value).toLowerCase())) {
            return true;
        } else if (arr.length-1 ==-1) {
            return false;
        } else {
            return false;
        }
    }
}
