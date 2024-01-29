package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_12_3_Student_Attendance_Tracker_Maps {
    public static void main(String[] args) {

        Map<String, String> attendanceList = new HashMap<>();
        attendanceList.put("Student1", "2023-10-20");
        attendanceList.put("Student2", "2023-10-05");
        attendanceList.put("Student3", "2023-10-05");

        String date = "2023-10-05";

        countPresentOnDate(attendanceList,date);

    }

    public static int countPresentOnDate(Map<String, String> attendanceList, String date) {
        int count = 0;

        for (String incomeDate: attendanceList.values()) {

            if (incomeDate.equals(date)){
                count++;
            }
        }

        return count;
    }
}
