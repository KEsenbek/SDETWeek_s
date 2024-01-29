package week6;

public class Class6_6_2 {
    public static void main(String[] args) {
        calculateGDP(2000,1000,1500,500);
    }
//    consumption (C), investment (I), governmentSpending (G), and netExports (NX)
//    in the same exact order - and calculate the Gross domestic product (GDP)
//    using the formula Y = consumption + investment + governmentSpending + netExports.
//    The method should have a void return type, which means it does not return
//    a value but simply performs the calculation and prints the result to the console.
    public static void calculateGDP( double c, double i, double g, double nX) {
            double y = c+i+g+nX;
        System.out.printf("%.1f",y);


}
}
