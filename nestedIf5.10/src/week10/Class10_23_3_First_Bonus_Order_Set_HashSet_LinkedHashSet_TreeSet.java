package week10;

import java.util.Set;
import java.util.TreeSet;

public class Class10_23_3_First_Bonus_Order_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {

        Set<String> phonesDataBase = new TreeSet<>();
            phonesDataBase.add("+1234567890");
            phonesDataBase.add("+1987654321");
            phonesDataBase.add("+17778889999");

        String newPhone = "+1555555555";

        calculateDiscount(phonesDataBase,newPhone);
    }

    public static int calculateDiscount(Set<String> phonesDataBase, String newPhone) {

        if (phonesDataBase.contains(newPhone)) {
            return 0;
        }else {
            return 15;
        }
    }
}
