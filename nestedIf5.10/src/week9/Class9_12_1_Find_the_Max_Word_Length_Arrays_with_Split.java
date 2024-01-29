package week9;

public class Class9_12_1_Find_the_Max_Word_Length_Arrays_with_Split {
    public static void main(String[] args) {
        findMaxWord("The quick brown fox jumps over the lazy dog. The dog barks, but the fox keeps running");
    }

    public static String findMaxWord(String text) {

        if (text.isEmpty()) {
            return "";
        }
        String[] arr = text.split(" ");
        String value = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (value.length()<arr[i].length()) {
                value=arr[i];
            }
        }
        return value;
    }
}
