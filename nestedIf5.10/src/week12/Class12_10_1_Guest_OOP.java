package week12;

public class Class12_10_1_Guest_OOP {
    public static void main(String[] args) {

    }
}

class Guest {
    // Static variables
    static int totalGuests = 0;
    static String hotelName = "";

    // Instance variables
    int guestId;
    String guestName;
    int age;
    boolean isRegular;

    // Final variables
    final int MAX_AGE = 100;
    final int MAX_GUESTS = 100;

    // Static methods
    public static String getHotelName() {
        return hotelName;
    }
    public static void setHotelName(String name) {
        hotelName = name;
    }

    // Instance method
    public void displayGuestDetails() {
        System.out.println("Guest Details:");
        System.out.println("Guest ID: " + guestId);
        System.out.println("Name: " + guestName);
        System.out.println("Age: " + age);
        System.out.println("Regular: " + isRegular);
    }

    // Constructor
    public Guest(int guestId, String guestName, int age, boolean isRegular) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.age = age;
        this.isRegular = isRegular;

        totalGuests++;
    }
}