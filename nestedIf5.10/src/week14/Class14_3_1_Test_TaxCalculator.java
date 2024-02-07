package week14;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class Class14_3_1_Test_TaxCalculator {
}

class TaxCalculator {

    public static double calculateTax(double income, String filingStatus) {
        if (income < 0) {
            System.out.println("Income cannot be negative.");
            return 0.0;
        }

        double tax;

        switch (filingStatus.toLowerCase()) {
            case "single":
                System.out.println("Calculating taxes for single filer...");
                tax = calculateTaxForSingleFilers(income);
                break;
            case "married":
                System.out.println("Calculating taxes for married filer...");
                tax = calculateTaxForMarriedFilingJointly(income);
                break;
            default:
                System.out.println("Invalid filing status.");
                return 0.0;
        }

        System.out.println("Tax calculation completed.");
        return tax;
    }

    private static double calculateTaxForSingleFilers(double income) {
        if (income <= 20000) {
            System.out.println("Applying 10% tax rate for income up to $20,000.");
            return income * 0.1;
        } else if (income <= 50000) {
            System.out.println("Applying 15% tax rate for income between $20,001 and $50,000.");
            return income * 0.15;
        } else {
            System.out.println("Applying 25% tax rate for income over $50,000.");
            return income * 0.25;
        }
    }

    private static double calculateTaxForMarriedFilingJointly(double income) {
        if (income <= 40000) {
            System.out.println("Applying 10% tax rate for income up to $40,000.");
            return income * 0.1;
        } else if (income <= 80000) {
            System.out.println("Applying 15% tax rate for income between $40,001 and $80,000.");
            return income * 0.15;
        } else {
            System.out.println("Applying 25% tax rate for income over $80,000.");
            return income * 0.25;
        }
    }
}


class MainTest3_1_1 {
    //implement all tests

    @Test
    public void calculateTaxForSingleFilersTest_LessThan20k() {
        // Income bracket: $0 to $20,000
        assertEquals(1000,TaxCalculator.calculateTax(10000,"single"));

    }

    @Test
    public void calculateTaxForSingleFilersTest_LessThan50k() {
        // Income bracket: $20,001 to $50,000
        assertEquals(7500,TaxCalculator.calculateTax(50000,"single"));

    }

    @Test
    public void calculateTaxForSingleFilersTest_MoreThan50k() {
        // Income bracket: $50,001 and more
        assertEquals(12500.25,TaxCalculator.calculateTax(50001,"single"));
    }

    @Test
    public void calculateTaxForMarriedFilersTest_LessThan40k() {
        // Income bracket: $0 to $40,000
        assertEquals(1000, TaxCalculator.calculateTax(10000,"married"));
    }

    @Test
    public void calculateTaxForMarriedFilersTest_LessThan80k() {
        // Income bracket: $40,001 to $80,000
        assertEquals(6000.15,TaxCalculator.calculateTax(40001,"married"));
    }

    @Test
    public void calculateTaxForMarriedFilersTest_MoreThan80k() {
        // Income bracket: $80,001 and more
        assertEquals(20000.25, TaxCalculator.calculateTax(80001,"married"));
    }

    @Test
    public void calculateTaxWithNegativeIncomeTest() {
        assertEquals(0,TaxCalculator.calculateTax(-1,"single"));
    }

    @Test
    public void calculateTaxWithInvalidFilingStatusTest() {
        assertEquals(0,TaxCalculator.calculateTax(10000,""));
    }
}
