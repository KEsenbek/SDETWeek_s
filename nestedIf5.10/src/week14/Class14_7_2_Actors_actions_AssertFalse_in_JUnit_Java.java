package week14;
import java.util.Date;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Class14_7_2_Actors_actions_AssertFalse_in_JUnit_Java {
}

class Actor {
    private String name;
    private String manager;
    private boolean isWorking;
    private String showDate;
    private boolean hasResigned;

    public Actor(String name) {
        this.name = name;
        this.manager = "";
        this.isWorking = false;
        this.showDate = "";
        this.hasResigned = false;
    }

    public void toWork() {
        isWorking = true;
        System.out.println("Actor is now working.");
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setShowDate(String date) {
        if (isValidDateFormat(date)) {
            showDate = date;
            System.out.println("Show date is updated.");
        } else {
            System.out.println("Error: Wrong date format.");
        }
    }

    public String getShowDate() {
        return showDate;
    }

    public void changeManager(String newManager) {
        if (!newManager.equals(manager)) {
            manager = newManager;
            System.out.println("Manager is updated.");
        } else {
            manager = "";
            System.out.println("Manager is set to null.");
        }
    }

    public String getManager() {
        return manager;
    }

    public void resign() {
        hasResigned = true;
        System.out.println("Actor has resigned.");
    }

    public boolean hasResigned() {
        return hasResigned;
    }

    public boolean isValidDateFormat(String date) {
        // Define a regular expression for a simple date format (YYYY-MM-DD).
        String regex = "\\d{4}-\\d{2}-\\d{2}";

        // Check if the date matches the regular expression.
        return date.matches(regex);
    }
}

class MainTest7_2 {
    //write your tests here
    @Test
    public void testToWork() {
        Actor actor = new Actor("Someone");
        assertFalse(actor.isWorking());
        actor.toWork();
        assertTrue(actor.isWorking());
    }
    @Test
    public void testSetShowDate() {
        Actor actor = new Actor("Someone");
        assertTrue(actor.getShowDate().isEmpty());
        actor.setShowDate("2023-12-01");
        assertTrue(actor.getShowDate().equals("2023-12-01"));
        actor.setShowDate("09/20/2023");
        assertFalse(actor.getShowDate().isEmpty());
    }
    @Test
    public void testChangeManager() {
        Actor actor = new Actor("Someone");
        actor.changeManager("Manager1");
        assertTrue(actor.getManager().equals("Manager1"));
        actor.changeManager("Manager1");
        assertTrue(actor.getManager() == "");
        actor.changeManager("Manager2");
        assertTrue(actor.getManager().equals("Manager2"));

    }
    @Test
    public void testResign() {
        Actor actor = new Actor("Someone");
        assertFalse(actor.hasResigned());
        actor.resign();
        assertTrue(actor.hasResigned());
    }
}