package week8;

public class Class8_12_1_Simple_replace_String_Builder {
    public static void main(String[] args) {
        replaceSubstring( "This is some sentence","is","that");
    }

    public static void replaceSubstring(String origin,String replaceIt,String replacement) {

        StringBuilder sb = new StringBuilder(origin);
        int index = sb.indexOf(replaceIt);

        while (index != -1) {
            sb.replace(index, index + replaceIt.length(), replacement);
            System.out.println(sb);
            index = sb.indexOf(replaceIt);
        }

    }
}
