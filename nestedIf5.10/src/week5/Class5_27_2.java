package week5;

public class Class5_27_2 {
    public static void main(String[] args) {
        System.out.printf("%.2f",calculateSavings());
    }

    public static double calculateSavings() {
        double salary = 130000.00;
        double tax = 0.1;
        return salary*tax;
    }
}
