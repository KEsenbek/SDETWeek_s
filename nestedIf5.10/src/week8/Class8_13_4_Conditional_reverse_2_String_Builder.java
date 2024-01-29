package week8;

public class Class8_13_4_Conditional_reverse_2_String_Builder {
    public static void main(String[] args) {
        manipulateString("hello wedevx",6);
    }

    public static String manipulateString(String text, int num) {
        StringBuilder sb = new StringBuilder(text);
        int absoluteValue = 0;

        if (num<0) {
            absoluteValue = Math.abs(num);
            sb.reverse().insert(0,absoluteValue);
           // System.out.println(sb);
        } else {
            for (int i = text.length()-1; i>0;i--){

                if (text.charAt(i) == ' ') {
                    sb.replace(i,i+1,"");
                  //  System.out.println(sb);
                    i--;
                }
              }
            sb.insert(sb.length(),num);
            System.out.println(sb);
        }

        return "";
    }
}
