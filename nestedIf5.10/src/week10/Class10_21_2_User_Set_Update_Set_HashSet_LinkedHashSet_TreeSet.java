package week10;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Class10_21_2_User_Set_Update_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        Set<String> userList = new TreeSet<>();
        userList.add("alice");
        userList.add("bob");
        userList.add("carol");
        String oldUsername = "bob";
        String newUsername = "dave";

        updateUserList(userList,oldUsername,newUsername);
    }

    public static TreeSet<String> updateUserList(Set<String> userList, String oldUsername, String newUsername) {

        if (userList.contains(oldUsername)) {
            userList.remove(oldUsername);
            userList.add(newUsername);

            return (TreeSet<String>) userList;
        }else {
            return (TreeSet<String>) userList;
        }
    }
}
