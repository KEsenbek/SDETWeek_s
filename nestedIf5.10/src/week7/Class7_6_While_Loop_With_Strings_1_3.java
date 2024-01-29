package week7;

public class Class7_6_While_Loop_With_Strings_1_3 {
    public static void main(String[] args) {
         printStringWithX("Xerox");

        System.out.println();
    }

    public static void printStringWithX(String input) {
        int i = 0;
        String answer = "";
        while (i <= input.length() - 1) {
            answer = answer.concat(String.valueOf(input.charAt(i)));
            if (String.valueOf(input.charAt(i)).equalsIgnoreCase("x")) {

                answer = answer.concat(String.valueOf(input.charAt(i)));

            }
            i++;
        }
        System.out.println(answer);
    }
}
//    public static void printStringWithX(String input){
//        int start = 0;
//        String word = "";
//        while(input.length()-1 >= start ){
//            word = word.concat(String.valueOf(input.charAt(start)));
//            if(String.valueOf(input.charAt(start)).equalsIgnoreCase("x")){
//                word = word.concat(String.valueOf(input.charAt(start)));
//            }
//            start++;
//        }
//        System.out.printf(word);
//    }
