package week8;

public class Class8_1_1_Count_backwards_nested_for_loop {
    public static void main(String[] args) {
        printBackwards(5);
    }

    public static void printBackwards(int number) {
            if (number<=0){
                System.out.println("Error! Number n can't be less than 1");
                }
        for (int i = number; i>=1; i--) {

            for (int j = number; j>=1; j--) {
                System.out.print(j+" ");

            }
            number--;
            System.out.println("");
        }
    }
}
