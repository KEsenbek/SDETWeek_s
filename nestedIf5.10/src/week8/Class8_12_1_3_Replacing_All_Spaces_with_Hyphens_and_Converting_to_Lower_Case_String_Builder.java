package week8;

public class Class8_12_1_3_Replacing_All_Spaces_with_Hyphens_and_Converting_to_Lower_Case_String_Builder {
    public static void main(String[] args) {
        convertString("This is a test string");
    }

    public static String convertString(String text) {
        StringBuilder sb = new StringBuilder(text);

        for (int i =0; i<sb.length();i++){
            if (sb.charAt(i) == ' ') {
                sb.replace(i,i+1,"-");
                //System.out.println(sb);
            }
        }

        return sb.toString().toLowerCase();
    }
}
