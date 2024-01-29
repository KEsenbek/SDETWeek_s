package week8;

public class Class8_13_1_Reverse_chunks_String_Builder {
    public static void main(String[] args) {
      String answer = reverseStringByChunks("Hello world!", 3);

        System.out.println(answer);
    }

    public static String reverseStringByChunks(String input, int chunkSize) {
        // Check if the chunkSize is valid (greater than 0)
        if (chunkSize <= 0) return input; // If not, return the original input

        // Initialize a StringBuilder for the result
        StringBuilder result = new StringBuilder("");
        // Initialize a StringBuilder to store each chunk
        StringBuilder chunk = new StringBuilder("");

        for (int i = 0; i < input.length(); i++) {
            // Get the character at position i
            char c = input.charAt(i);
            // Append the character to the chunk
            chunk.append(c);

            // Check if the chunk size has been reached
            if (chunk.length() == chunkSize) {
                // Reverse the chunk and append it to the result
                result.append(chunk.reverse());
                // Add a space as a separator
                result.append(" ");
                // Clear the chunk for the next iteration
                chunk.delete(0, chunk.length());
            }
        }

        // Check if there's any remaining characters in the chunk
        if (chunk.length() > 0) {
            // Reverse and append the remaining chunk to the result
            result.append(chunk.reverse());
        }
        // Return the final result as a string
        return result.toString();
    }
}
