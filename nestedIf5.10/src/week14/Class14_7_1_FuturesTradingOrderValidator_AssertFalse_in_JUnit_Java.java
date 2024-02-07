package week14;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class Class14_7_1_FuturesTradingOrderValidator_AssertFalse_in_JUnit_Java {
}

class FuturesTradingOrder {
    private String orderType;
    private String contractSymbol;
    private int quantity;
    private double price;

    public FuturesTradingOrder(String orderType, String contractSymbol, int quantity, double price) {
        this.orderType = orderType;
        this.contractSymbol = contractSymbol;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters (optional) for accessing private fields

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getContractSymbol() {
        return contractSymbol;
    }

    public void setContractSymbol(String contractSymbol) {
        this.contractSymbol = contractSymbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class FuturesTradingOrderValidator {

    public boolean isValidOrder(FuturesTradingOrder order) {

        // Check the order type: Only "Buy" orders are allowed
        if (!"Buy".equalsIgnoreCase(order.getOrderType())) {
            System.out.println("order type is not Buy");
            return false;
        }


        // Check the contract specifications: The contract symbol should be valid (non-null and non-empty)
        if (order.getContractSymbol() == null || order.getContractSymbol().isEmpty()) {
            System.out.println("contract symboll is null or empty");

            return false;
        }

        // Check the order quantity: The quantity should be positive
        if (order.getQuantity() <= 0) {
            System.out.println("order quantity is zero or negative");

            return false;
        }


        System.out.println("valid future order submitted");

        return true; // If all validations pass, the order is considered valid
    }
}


class MainTest7_1 {

    @Test
    public void testInvalidOrderType() {
        FuturesTradingOrder futuresTradingOrder = new FuturesTradingOrder("In order","Done",2,55);

        FuturesTradingOrderValidator obj = new FuturesTradingOrderValidator();
      //  obj.isValidOrder(futuresTradingOrder);

        assertFalse(obj.isValidOrder(futuresTradingOrder));
    }

    @Test
    public void testInvalidContractSymbol() {
        FuturesTradingOrder futuresTradingOrder = new FuturesTradingOrder("Buy","",2,55);

        FuturesTradingOrderValidator obj = new FuturesTradingOrderValidator();
        assertFalse(obj.isValidOrder(futuresTradingOrder));

    }

    @Test
    public void testInvalidOrderQuantity() {
        FuturesTradingOrder futuresTradingOrder = new FuturesTradingOrder("Buy","Done",-5,55);

        FuturesTradingOrderValidator obj = new FuturesTradingOrderValidator();
        assertFalse(obj.isValidOrder(futuresTradingOrder));
    }

    @Test
    public void testValidOrder() {
        FuturesTradingOrder futuresTradingOrder = new FuturesTradingOrder("Buy","Done",2,55);

        FuturesTradingOrderValidator obj = new FuturesTradingOrderValidator();

        assertTrue(obj.isValidOrder(futuresTradingOrder));
    }

}