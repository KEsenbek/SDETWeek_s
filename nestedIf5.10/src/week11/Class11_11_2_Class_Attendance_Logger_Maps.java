package week11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class11_11_2_Class_Attendance_Logger_Maps {
    public static void main(String[] args) {
        Map<String, Boolean> attendance = new HashMap<>();
        attendance.put("John", true);
        attendance.put("Alice", false);
        attendance.put("Bob", true);
        attendance.put("Eva", true);
        
        logAttendance(attendance);
    }

    public static List<String> logAttendance(Map<String, Boolean> attendance) {

        List<String> answer = new ArrayList<>();

        for (Map.Entry<String,Boolean> student : attendance.entrySet()){

            if (student.getValue().booleanValue()) {
                answer.add(student.getKey());
            }

            if (answer.isEmpty()){
                answer.add("None");
            }

        }

        return answer;
    }
}
