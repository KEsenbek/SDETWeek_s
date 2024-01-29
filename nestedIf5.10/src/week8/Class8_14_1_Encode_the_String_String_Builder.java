package week8;

public class Class8_14_1_Encode_the_String_String_Builder {
    public static void main(String[] args) {
      String answer =  encodeString("aaabbcddd");
        System.out.println(answer);
    }

    public static String  encodeString(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        StringBuilder encodedString = new StringBuilder();
        char currentChar = text.charAt(0);
        int count = 1;

        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == currentChar) {
                count++;
            } else {
                encodedString.append(currentChar);
                if (count > 1) {
                    encodedString.append(count);
                }
                currentChar = text.charAt(i);
                count = 1;
            }
        }

        // Append the last character and its count
        encodedString.append(currentChar);
        if (count > 1) {
            encodedString.append(count);
        }

        return encodedString.toString();
    }

}
