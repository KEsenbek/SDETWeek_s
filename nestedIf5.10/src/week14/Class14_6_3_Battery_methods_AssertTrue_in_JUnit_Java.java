package week14;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
public class Class14_6_3_Battery_methods_AssertTrue_in_JUnit_Java {
}

class Battery {
    private int percentage;

    public Battery() {
        this.percentage = 0;
    }

    public int getPercentage() {
        return percentage;
    }

    public void charge(int amount) {
        if (amount < 0) {
            System.out.println("Charge amount cannot be negative");
        } else {
            percentage = Math.min(100, percentage + amount);
        }
    }

    public void use(int amount) {
        if (amount < 0) {
            System.out.println("Usage amount cannot be negative");
        } else {
            percentage = Math.max(0, percentage - amount);
        }
    }

    public void recycle() {
        System.out.println("Battery recycled");
        percentage = 0;
    }
}

class MainTest6_3 {
    //write your tests here
    @Test
    void testCharge() {
        Battery battery = new Battery();
        battery.charge(50);
        assertTrue(battery.getPercentage() == 50);
        battery.charge(-10);
        assertTrue(battery.getPercentage() == 50);
        battery.charge(70);
        assertTrue(battery.getPercentage() == 100);
    }
    @Test
    void testUse() {
        Battery battery = new Battery();
        battery.charge(80);
        battery.use(30);
        assertTrue(battery.getPercentage() == 50);
        battery.use(-10);
        assertTrue(battery.getPercentage() == 50);
        battery.use(60);
        assertTrue(battery.getPercentage() == 0);
    }
    @Test
    void testRecycle() {
        Battery battery = new Battery();
        battery.charge(50);
        battery.recycle();
        assertTrue(battery.getPercentage() == 0);
    }

}