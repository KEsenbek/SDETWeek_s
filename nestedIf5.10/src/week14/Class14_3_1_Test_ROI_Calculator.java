package week14;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class Class14_3_1_Test_ROI_Calculator {
}
class ROIUtils {

    public static double calculateROI(double initialInvestment, double finalValue) {
        if (initialInvestment < 0 ) {
            System.out.println("Error: initialInvestment value cannot be negative.");
            return 0.0;
        } else if(finalValue < 0) {
            System.out.println("Error: finalValue cannot be negative.");
            return 0.0;
        }

        if (initialInvestment > 10000) {
            System.out.println("Warning: Maximum initial investment allowed is $10,000.");
            return -1.0;
        }

        double netProfit = finalValue - initialInvestment;
        double roi = (netProfit / initialInvestment) * 100;
        System.out.println("Calculation successful");
        return roi;
    }
}

class MainTest3_1 {
    //write your tests here
       @Test
    public void zeroFinalValueTest() {
        assertEquals(0, ROIUtils.calculateROI(1,1) );
    }
    @Test
    public void negativeInitialInvestmentTest() {
        assertEquals(-1,ROIUtils.calculateROI(100000,0));

    }
    @Test
    public void negativeFinalValueTest() {
        assertEquals(-50,ROIUtils.calculateROI(20,10));
    }
    @Test
    public void positiveInvestmentTest() {
        assertEquals(400,ROIUtils.calculateROI(1,5));
    }
    @Test
     public void maxInvestmentLimitExceededTest() {
        assertEquals(-1,ROIUtils.calculateROI(100000,10));
     }
     @Test
     public void negativeInvestmentTest() {
        assertEquals(-1,ROIUtils.calculateROI(1000000,5));
     }
}