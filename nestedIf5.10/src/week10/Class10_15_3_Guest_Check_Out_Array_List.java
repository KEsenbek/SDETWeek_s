package week10;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Class10_15_3_Guest_Check_Out_Array_List {
    public static void main(String[] args) {
        ArrayList<String> guests = new ArrayList<>();
        guests.add("Alice");
        guests.add("Bob");
        guests.add("Charlie");
        String checkedOutGuest = "Bob";
       List<String> ans = checkOutGuests(guests,checkedOutGuest);
        System.out.println(ans);
    }

    public static ArrayList<String> checkOutGuests(ArrayList<String> guests, String checkedOutGuest) {
        for (int i = 0; i < guests.size(); i++) {
            if (guests.get(i).equals(checkedOutGuest)) {
                guests.remove(i);
                break;
            }
        }
        return guests;
    }
}
