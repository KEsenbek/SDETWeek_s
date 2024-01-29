package week11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Class11_11_2_Scoreboard_Maps {
    public static void main(String[] args) {
        Map<String, Integer> scoreboard = new HashMap<>();
        scoreboard.put("Bob",1200);
        scoreboard.put("Alice",950);
        scoreboard.put("Charlie",800);
        scoreboard.put("David",1050);

        displayScoreboard(scoreboard);
    }

        public static void displayScoreboard (Map<String, Integer> scoreboard) {

            Set<String > scores = scoreboard.keySet();
            int counter = 0;
            for (String score: scores) {
                counter++;
                System.out.println(counter+". " +score);
            }
        }
}
