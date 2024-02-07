package week13;

public class Class13_16_1_Zero_division_Exceptions_with_Try_Catch_Block_in_Java {
    public static void main(String[] args) {

        divideNums(0,5);
    }

    public static int divideNums(int a, int b) {
        int result = 0;
        try {
          result = a / b;
          return result;
      } catch (Exception e) {
            System.out.println("Error: Division by zero occurred.");
      }
        return result;
    }
}
