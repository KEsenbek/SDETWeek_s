package week10;

import java.util.List;

public class Class10_11_2_Tourist_Operator_Array_List {
    public static void main(String[] args) {
        List<String> touristsList = List.of(new String[]{"Anna Smith", "John Johnson", "Maria Garcia", "Michael Brown"});
        String newTourist = "Sarah Martinez";
        registerParticipants(touristsList, newTourist);
    }

    public static List<String> registerParticipants(List<String> touristsList, String newTourist) {
        touristsList.add(newTourist);
        return touristsList;

    }
}
