package week13;

public class Class13_19_1_Object_in_method_Validation_Exceptions_with_Try_Catch_Block_in_Java {
    public static void main(String[] args) {
        performObjectOperations(-1);
    }

    public static void performObjectOperations(Object obj) {
        try {
            Integer intValue = (Integer) obj;
            int newINT = intValue / 0;
            System.out.println(intValue);
        } catch (ArithmeticException e) {
            System.out.println("Error: ArithmeticException - Division by zero");
        } catch (NullPointerException e) {
            System.out.println("Error: NullPointerException - Object is null");
        } catch (ClassCastException e) {
            System.out.println("Error: ClassCastException - Invalid type casting");
        }
    }
}
