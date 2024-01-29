package week7;

public class Class7_19_3_Fibonacci_Sequence_Generator_For_Loop {
    public static void main(String[] args) {
        generateFibonacciSequence(10);
    }

    public static void generateFibonacciSequence(int number) {

            // Initialize the first two terms of the sequence
            int firstTerm = 0;
            int secondTerm = 1;

            // Print the first two terms
            System.out.print(firstTerm + " " + secondTerm + " ");

            // Use a for loop to generate the remaining terms
            for (int i = 2; i < number; i++) {
                // Calculate the next term by adding the previous two terms
                int nextTerm = firstTerm + secondTerm;

                // Print the next term
                System.out.print(nextTerm + " ");

                // Update the first and second terms for the next iteration
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
}
