package week8;

public class Class8_12_1_4_Case_Insensitive_Replace_String_Builder {
    public static void main(String[] args) {
        caseInsensitiveReplace("Hello, World","hello","hi");
    }

    public static String caseInsensitiveReplace(String source , String find , String replaceWith ) {

        StringBuilder sb = new StringBuilder(source);

        int index = String.valueOf(sb).toLowerCase().indexOf(find.toLowerCase());

        sb.replace(index,index+find.length(),replaceWith);

       // System.out.println(sb);
        return sb.toString();
    }
}
