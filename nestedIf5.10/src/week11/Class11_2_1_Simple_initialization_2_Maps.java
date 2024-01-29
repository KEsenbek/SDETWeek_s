package week11;

import java.util.LinkedHashMap;
import java.util.Map;

public class Class11_2_1_Simple_initialization_2_Maps {
    public static void main(String[] args) {
        createMap();
    }

    public static Map<Integer,Double> createMap() {
        Map<Integer,Double> answer = new LinkedHashMap<>();
        return answer;
    }
}
