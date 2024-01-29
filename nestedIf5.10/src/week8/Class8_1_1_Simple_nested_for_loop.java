package week8;

public class Class8_1_1_Simple_nested_for_loop {
    public static void main(String[] args) {
            String str = "abc";
        for (int i = 0; i<=str.length()-1; i++ ) {
            System.out.print(str.charAt(i));
            for (int j = 1; j <=5; j++){
                System.out.print(j);
            }

        }
    }
}
