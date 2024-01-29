package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_6_4_Visitor_Log_Cleanup_Maps {
    public static void main(String[] args) {

        Map<String, Integer> visitors = new HashMap<>();
        visitors.put("Visitor1", 15);
        visitors.put("Visitor2", 45);
        String removeVisit = "Visitor1";
        cleanupVisitorLog(visitors,removeVisit);
    }

    public static Map<String, Integer> cleanupVisitorLog(Map<String, Integer> visitors, String removeVisit) {

        Integer value  = (visitors.get(removeVisit));

        if (value<=30){
            System.out.println(visitors);

            return visitors;
        }else {
        visitors.remove(removeVisit);
            System.out.println(visitors);

            return visitors;
        }
    }
}
