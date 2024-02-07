package week14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class Class14_3_2_Test_Discount {
}

class DiscountUtils {

    public static double calculateDiscount(double productPrice, double discountPercentage) {
        if (productPrice < 0 || discountPercentage < 0) {
            System.out.println("Error: Product price and discount percentage cannot be negative.");
            return 0.0;
        }

        if (productPrice > 1000) {
            System.out.println("Warning: Maximum product price allowed is $1,000.");
            return -1.0;
        }

        double discountAmount = (productPrice * discountPercentage) / 100;
        System.out.println("Discount calculation successful");
        return discountAmount;
    }
}

class MainTest3_2{
    //write your tests here
    @Test
    public void validDiscountCalculationTest() {
        assertEquals(10, DiscountUtils.calculateDiscount(100,10));
    }

    @Test
    public void negativeProductPriceTest(){
        assertEquals(0, DiscountUtils.calculateDiscount(-1000,10));
    }

    @Test
    public void negativeDiscountPercentageTest(){
        assertEquals(0,DiscountUtils.calculateDiscount(1000,-50));
    }

    @Test
    public void negativeInputValuesTest() {
        assertEquals(0,DiscountUtils.calculateDiscount(-1000,-20));
    }

    @Test
    public void maxPriceLimitExceededTest(){
        assertEquals(-1,DiscountUtils.calculateDiscount(10000,10));
    }

    @Test
    public void zeroDiscountPercentageTest() {
        assertEquals(0, DiscountUtils.calculateDiscount(100,0));
    }
}