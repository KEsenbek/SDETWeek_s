package week8;

public class Class8_11_1_Remove_duplicates_in_String_String_Builder {
    public static void main(String[] args) {
        removeDuplicates("aaabbcdddefffg");
    }

    public static String  removeDuplicates(String text) {

        StringBuilder sb = new StringBuilder(text);

        for (int i = 0; i<sb.length()-1;i++){

            if (sb.charAt(i) == sb.charAt(i+1)) {
                System.out.println(sb.deleteCharAt(i+1));
                i--;
            }

        }

        return sb.toString();
    }
}
