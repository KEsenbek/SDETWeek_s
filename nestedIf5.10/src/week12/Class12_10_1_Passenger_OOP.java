package week12;

public class Class12_10_1_Passenger_OOP {
    public static void main(String[] args) {

    }
}
class Passenger{

    public static final int MAX_CAPACITY = 200;

    public static final String PASSENGER_TYPE = "Regular";

    private int passengerId;// Represents the unique ID of the passenger.

    private String passengerName;// Represents the name of the passenger.

    private int age;// Represents the age of the passenger.

    private boolean isFrequentFlyer;// Indicates whether the passenger is a frequent flyer or not.

    private static int totalPassengers = 0;

    private static String airlineName = "";

    public static int getTotalPassengers() {
        return totalPassengers;
    }

    public static String getAirlineName() {
        return airlineName;
    }

    public static void setAirlineName(String name) {
        airlineName = name;
    }

    public Passenger(int passengerId, String passengerName, int age, boolean isFrequentFlyer) {
        this.passengerId=passengerId;
        this.passengerName=passengerName;
        this.age=age;
        this.isFrequentFlyer=isFrequentFlyer;

        totalPassengers++;
    }

    public void displayPassengerDetails() {
        System.out.println("Passenger Details:\n" +
                "Passenger ID: "+passengerId+"\n" +
                "Name: "+passengerName+"\n" +
                "Age: "+age+"\n" +
                "Frequent Flyer: "+isFrequentFlyer);
    }

    public void printPassengerType() {
        System.out.println("Passenger Type: "+PASSENGER_TYPE);
    }

    public void changePassengerName(String newName) {
        this.passengerName=newName;
    }
}