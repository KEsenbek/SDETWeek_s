package week8;

public class Class8_11_1_Remove_practice_String_Builder {
    public static void main(String[] args) {
        removeSubstrings("some exercise here and there", "e");
    }

    public static String removeSubstrings(String text, String value) {

        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i<=text.length()-1; i++) {
            int index = sb.indexOf(value);
            if (index==-1){
                break;
            }
            System.out.println(index);

            sb.delete(index, index + value.length());

            System.out.println(sb);
        }

        return "";
    }
}
