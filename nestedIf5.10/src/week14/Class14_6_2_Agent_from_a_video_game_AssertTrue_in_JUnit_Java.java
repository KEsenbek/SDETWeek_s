package week14;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class Class14_6_2_Agent_from_a_video_game_AssertTrue_in_JUnit_Java {
}

class Weapon {
    private final String name;
    private final int requiredLevel;
    private final double price;

    public Weapon(String name, int requiredLevel, double price) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public double getPrice() {
        return price;
    }
}

class Agent {
    private static int agentIdCounter = 1;

    private final String agentId;
    private double bank;
    private boolean isBanned;
    private boolean isDriving;
    private int level;

    public Agent(double initialBank, int initialLevel) {
        this.agentId = "Agent" + agentIdCounter++;
        this.bank = initialBank;
        this.isBanned = false;
        this.isDriving = false;
        this.level = initialLevel;
    }

    public String getAgentId() {
        return agentId;
    }

    public boolean canDrive() {
        boolean result = !(isDriving && isBanned);
        System.out.println(agentId + " canDrive() = " + result);
        assertTrue(result);
        return result;
    }

    public void levelUp() {
        if (!isBanned) {
            level++;
            System.out.println(agentId + " levelUp() to level " + level);
        } else {
            System.out.println(agentId + " levelUp() failed: Agent is banned.");
        }
    }

    public void ban() {
        isBanned = true;
        System.out.println(agentId + " ban()");
    }

    public void purchase(Weapon weapon) {
        int requiredLevel = weapon.getRequiredLevel();
        if (level >= requiredLevel) {
            double cost = weapon.getPrice();
            if (bank >= cost) {
                bank -= cost;
                System.out.println(agentId + " purchased " + weapon.getName() + " for " + cost + " units.");
            } else {
                System.out.println(agentId + " purchase of " + weapon.getName() + " failed: Insufficient funds.");
            }
        } else {
            System.out.println(agentId + " purchase of " + weapon.getName() + " failed: Insufficient level.");
        }
    }

    public double getBank() {
        return bank;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public boolean isDriving() {
        return isDriving;
    }

    public int getLevel() {
        return level;
    }
}

class MainTest6_2 {
    // Write your tests here
    @Test
    public void testCanDrive_notDrivingNotBanned() {
        Agent agent = new Agent(100, 1);
        assertTrue(agent.canDrive());
    }
    @Test
    public void testCanDrive_banned() {
        Agent agent = new Agent(1000,1);
        assertFalse(agent.isBanned());
        agent.ban();
        assertTrue(agent.isBanned());
    }
    @Test
    public void testCanDrive_agentBanned() {
        Agent agent = new Agent(1000.0, 1);
        agent.ban();
        assertFalse(agent.canDrive());
    }
    @Test
    public void testLevelUp_successful() {
        Agent agent = new Agent(1000.0, 1);
        int initialLevel = agent.getLevel();
        agent.levelUp();
        assertEquals(initialLevel + 1, agent.getLevel());
    }
    @Test
    public void testLevelUp_agentBanned() {
        Agent agent = new Agent(1000,1);
        agent.ban();
        agent.levelUp();
        assertEquals(1, agent.getLevel());
    }
    @Test
    public void testBan_notBanned() {
        Agent agent = new Agent(100,1);
        agent.ban();
        assertTrue(agent.isBanned());
    }
    @Test
    public void testBan_alreadyBanned() {
        Agent agent = new Agent(1000.0, 1);
        agent.ban();
        agent.ban();
        assertTrue(agent.isBanned());
    }
    @Test
    public void testPurchase_successful() {
        Agent agent = new Agent(100, 2); // Set initial level to 2
        Weapon weapon = new Weapon("Sword", 1, 50);
        agent.purchase(weapon);
        assertEquals(50, agent.getBank());
    }
    @Test
    public void testPurchase_insufficientFunds() {
        Agent agent = new Agent(30, 2); // Set initial level to 2
        Weapon weapon = new Weapon("Sword", 1, 50);
        agent.purchase(weapon);
        assertEquals(30, agent.getBank());
    }
    @Test
    public void testPurchase_insufficientLevel() {
        Agent agent = new Agent(100, 1); // Set initial level to 1
        Weapon weapon = new Weapon("Sword", 2, 50);
        agent.purchase(weapon);
        assertEquals(100, agent.getBank());
    }
    @Test
    public void testPurchase_insufficientFundsAndLevel() {
        Agent agent = new Agent(30, 1); // Set initial level to 1
        Weapon weapon = new Weapon("Sword", 2, 50);
        agent.purchase(weapon);
        assertEquals(30, agent.getBank());
    }

}
