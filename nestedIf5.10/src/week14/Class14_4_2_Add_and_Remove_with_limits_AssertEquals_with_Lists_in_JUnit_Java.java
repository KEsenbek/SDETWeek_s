package week14;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
public class Class14_4_2_Add_and_Remove_with_limits_AssertEquals_with_Lists_in_JUnit_Java {
}
class ItemManager {
    private List<String> itemList;
    private int itemLimit;

    public ItemManager(int itemLimit) {
        this.itemList = new ArrayList<>();
        this.itemLimit = itemLimit;
    }

    public boolean addItem(String item) {
        if (itemList.size() < itemLimit) {
            itemList.add(item);
            System.out.println("Item added: " + item);
            return true;
        } else {
            System.out.println("Item limit exceeded. Item not added: " + item);
            return false; // Item limit exceeded
        }
    }

    public boolean removeItem(String item) {
        if (itemList.contains(item)) {
            itemList.remove(item);
            System.out.println("Item removed: " + item);
            return true;
        } else {
            System.out.println("Item not found. Item not removed: " + item);
            return false; // Item not found
        }
    }

    public List<String> getItemList() {
        return itemList;
    }
}

class MainTest4_2 {
    //write your tests here
    @Test
    public void testAddItem_LimitNotExceeded(){
        ItemManager iM = new ItemManager(3);
        iM.addItem("Item1");
        iM.addItem("Item2");


        assertEquals(2,iM.getItemList().size());
    }
    @Test
    public void testAddItem_LimitExceeded(){
        ItemManager iM = new ItemManager(2);
        iM.addItem("Item1");
        iM.addItem("Item2");
        iM.addItem("Item3");

        assertEquals(2,iM.getItemList().size());
    }
    @Test
    public void testRemoveItem_ItemExists(){
        ItemManager iM = new ItemManager(3);
        iM.addItem("Item1");
        iM.addItem("Item2");
        iM.addItem("Item3");

        iM.removeItem("Item4");

        assertEquals(3, iM.getItemList().size());
    }
    @Test
    public void testRemoveItem_ItemNotFound(){
        ItemManager iM = new ItemManager(3);
        iM.addItem("Item1");
        iM.addItem("Item2");
        iM.addItem("Item3");

        iM.removeItem("Item2");

        assertEquals(2, iM.getItemList().size());
    }
}
