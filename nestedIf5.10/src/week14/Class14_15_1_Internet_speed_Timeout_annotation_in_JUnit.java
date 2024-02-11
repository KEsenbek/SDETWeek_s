package week14;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

public class Class14_15_1_Internet_speed_Timeout_annotation_in_JUnit {
}

class InternetSpeedTest {

    public int checkInternetSpeed(String wireMaterial, String plan, int numUsers) throws InterruptedException {
        int speed = 0;

        if ("fiber".equals(wireMaterial)) {
            // Simulate testing fiber internet speed (takes 6 seconds)
            Thread.sleep(4000);
            speed = 1000; // Mbps
        } else if ("copper".equals(wireMaterial)) {
            // Simulate testing copper internet speed (takes 3 seconds)
            Thread.sleep(1500);
            speed = 100; // Mbps
        }

        if ("premium".equals(plan)) {
            // Premium plan speed boost (takes 2 seconds)
            Thread.sleep(1000);
            speed *= 2;
        }

        if (numUsers > 5) {
            // Simulate network congestion for more users (takes 4 seconds)
            Thread.sleep(2500);
            speed /= 2;
        }

        return speed;
    }
}

class MainTest15_1{
//    InternetSpeedTest internetSpeedTest;
//    @BeforeEach
//    public void setUp(){
//        internetSpeedTest = new InternetSpeedTest();
//    }
    @Test
    @Timeout(6)
    public void testCheckInternetSpeed_FiberPremium5Users() throws InterruptedException{
        InternetSpeedTest internetSpeedTest = new InternetSpeedTest();
        //Test the method with fiber internet and a premium plan with 5 users.
        //Parameters: wireMaterial = "fiber", plan = "premium", numUsers = 5.
        //Expected Result: The method should complete within 6 seconds and return an internet speed of 2000 Mbps.

            assertEquals(2000,internetSpeedTest.checkInternetSpeed("fiber","premium",5));

    }

    @Test
    @Timeout(2)
    public void testCheckInternetSpeed_CopperBasic1User() throws InterruptedException{
        InternetSpeedTest internetSpeedTest = new InternetSpeedTest();
        //Test the method with copper internet and a basic plan with 1 user.
        //Parameters: wireMaterial = "copper", plan = "basic", numUsers = 1.
        //Expected Result: The method should complete within 2 seconds and return an internet speed of 100 Mbps.
            assertEquals(100, internetSpeedTest.checkInternetSpeed("copper","copper",1));

    }

    @Test
    @Timeout(6)
    public void testCheckInternetSpeed_CopperPremium10Users() throws InterruptedException {
        InternetSpeedTest internetSpeedTest = new InternetSpeedTest();
        //Test the method with copper internet and a premium plan with 10 users.
        //Parameters: wireMaterial = "copper", plan = "premium", numUsers = 10.
        //Expected Result: The method should complete within 6 seconds and return an internet speed of 100 Mbps.

        assertEquals(100, internetSpeedTest.checkInternetSpeed("copper", "premium", 10));

    }
}