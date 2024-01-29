package week10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Class10_21_4_Subscription_Service_Management_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {

        LinkedHashSet<String> usersWithSubscriptions = (LinkedHashSet<String>) new HashSet<>(Arrays.asList("User1", "User2", "User3", "User4"));
        String userToRemoveSubscription = "User3";

        removeSubscriber(usersWithSubscriptions,userToRemoveSubscription);
    }

    public static LinkedHashSet<String> removeSubscriber(LinkedHashSet<String> usersWithSubscriptions, String userToRemoveSubscription) {

        if (usersWithSubscriptions.contains(userToRemoveSubscription)){
            usersWithSubscriptions.remove(userToRemoveSubscription);
            return usersWithSubscriptions;
        }else {
            return usersWithSubscriptions;
        }
    }
}
