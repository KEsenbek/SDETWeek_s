package week9;

public class Class9_10_5_Race_Results_Arrays_with_Loops {
    public static void main(String[] args) {
        printRaceResults(new String[]{"Alice", "Bob", "Charlie", "David", "Eve"});
    }

    public static void printRaceResults(String[] runners) {
        if (runners.length == 0) {
            System.out.println("No runners in the race");
        } else if (runners.length == 1) {
            System.out.println("One Participant: "+runners[runners.length-1]);
        } else {
            System.out.println("Winner: "+runners[runners.length- runners.length]);
            System.out.println("Last Place: "+ runners[runners.length-1]);
        }
    }
}
