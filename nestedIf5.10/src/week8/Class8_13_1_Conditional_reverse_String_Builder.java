package week8;

public class Class8_13_1_Conditional_reverse_String_Builder {
    public static void main(String[] args) {
        reverseString("hello world");
    }

    public static String reverseString(String text) {

        StringBuilder sb = new StringBuilder(text);

        int length = sb.length();
        int space = 0;
        for (int i = 0; i < length; i++) {
            //      int index = sb.indexOf(" ");
            if (sb.charAt(i) == ' ') {
                space++;
            }
        }

        if (space % 2 == 1) {
            System.out.println(sb.reverse());
            return sb.reverse().toString();

        }else {
            System.out.println("Can't reverse");
        }
        //if (String.valueOf(sb).isEmpty() || )

        return "";
    }
}
