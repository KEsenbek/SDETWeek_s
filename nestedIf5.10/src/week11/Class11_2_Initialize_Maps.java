package week11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Class11_2_Initialize_Maps {
    public static void main(String[] args) {

        HashMap<Integer, String> students1 = new HashMap<>();
        LinkedHashMap<Integer, String> students2 = new LinkedHashMap<>();
        TreeMap<Integer, String> students3 = new TreeMap<>();
        //we can implement Map interface
        Map<Integer, String> students4 = new HashMap<>();
        Map<Integer, String> students5 = new LinkedHashMap<>();
        Map<Integer, String> students6 = new TreeMap<>();
    }
}
