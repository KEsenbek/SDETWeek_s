package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_6_3_Outdated_ToDo_List_Remover_Maps {
    public static void main(String[] args) {
        Map<Integer, String> toDo = new HashMap<>();
        toDo.put(1, "Buy groceries");
        toDo.put(2, "Finish project");
        toDo.put(3,"Schedule the Interview");
        
        Integer removeItem = 1;

        removeOutdated(toDo,removeItem);
    }

    public static Map<Integer,String> removeOutdated(Map<Integer, String> toDo, Integer removeItem) {

        toDo.remove(removeItem);

        return  toDo;

    }
}
