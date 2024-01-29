package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_9_3_Scoreboard_Reset_Maps {
    public static void main(String[] args) {
        Map<String, Integer> scoreboard = new HashMap<>();
        scoreboard.put("Player1", 8);
        scoreboard.put("Player2", 12);
        scoreboard.put("Player3", 5);
        
        resetScoreboard(scoreboard);
        
        

    }

    public static Map<String, Integer> resetScoreboard(Map<String, Integer> scoreboard) {
        // Iterate through the scoreboard entries
        for (Map.Entry<String, Integer> entry : scoreboard.entrySet()) {
            // Check if any participant has 10 or more points
            if (entry.getValue() >= 10) {
                // Clear the scoreboard and return an empty map
                return new HashMap<>();
            }
        }

        // If no participant has 10 or more points, return the unchanged scoreboard
        System.out.println(scoreboard);
        return scoreboard;
    }
}
