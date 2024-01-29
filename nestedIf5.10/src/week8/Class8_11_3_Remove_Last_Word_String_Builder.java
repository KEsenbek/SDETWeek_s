package week8;

public class Class8_11_3_Remove_Last_Word_String_Builder {
    public static void main(String[] args) {
        removeLastWord("The quick brown fox");
    }

    public static void removeLastWord(String text) {

        StringBuilder sb = new StringBuilder(text);

            int index = sb.lastIndexOf(" ");


            if (index != -1) {
                sb.delete(index, sb.length());

                System.out.println(sb);
            } else {
                System.out.println("");
            }

    }
}
