package week8;

public class Class8_9_1_Simple_insert_practice_String_Builder {
    public static void main(String[] args) {
        insertCharacters("hello", '*');
    }

    public static String insertCharacters(String text, char symbol) {

        if (text.trim().isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder(text);
        for (int i = text.length()-1; i>0; i--) {
           sb.insert(i,symbol);
            //System.out.println(sb);
        }
        //System.out.println(sb);
        return sb.toString();
    }
}
