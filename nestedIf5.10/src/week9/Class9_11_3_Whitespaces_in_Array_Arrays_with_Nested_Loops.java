package week9;

public class Class9_11_3_Whitespaces_in_Array_Arrays_with_Nested_Loops {
    public static void main(String[] args) {
     int answer =   countWhitespaces(new  String[]{"Hello World", "This is a test", "Another example"});

        System.out.println(answer);
    }

    public static int countWhitespaces(String[] strings) {

        int counter = 0;
        for (int i = 0; i < strings.length; i++) {
            String text = strings[i];

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == ' ') {
                    counter++;
                }

            }

        }


        return counter;
    }
}
