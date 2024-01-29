package week8;

public class Class8_13_1_Reverse_word_order_String_Builder {
    public static void main(String[] args) {
        String answer = reverseWords("This is a test");

        System.out.println(answer);
    }

    public static String reverseWords(String str) {
        // Create a StringBuilder to build the reversed string
        StringBuilder sb = new StringBuilder();
        int end = str.length();

        // Iterate through the characters of the input string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            // Check if the current character is a space
            if (str.charAt(i) == ' ') {
                // Append the word from the current position (i + 1) to the 'end' to the StringBuilder
                sb.append(str.substring(i + 1, end));
                sb.append(' ');  // Add a space after each word
                end = i;  // Update the 'end' to the current position (start of the next word)
            }
        }

        // Append the first word (if any) and reverse the StringBuilder to get the final result
        sb.append(str.substring(0, end));
        return sb.reverse().toString();
    }
}
