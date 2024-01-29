package week11;

import java.util.*;

public class Class11_15_1_Sort_and_filter_Maps {
    public static void main(String[] args) {

        Map<String, List<Integer>> inputMap = new HashMap<>();
        inputMap.put("A", Arrays.asList(8, 3, 5, 12, 9));
        inputMap.put("B", Arrays.asList(6, 15, 2, 18, 7));
        inputMap.put("C", Arrays.asList(10, 4, 21, 14, 6));

        Map<String, List<Integer>> result = sortAndFilterMap(inputMap);
        System.out.println(result);
        
    }

    public static Map<String, List<Integer>> sortAndFilterMap(Map<String, List<Integer>> inputMap) {
        Map<String, List<Integer>> resultMap = new HashMap<>();

        for (Map.Entry<String, List<Integer>> entry : inputMap.entrySet()) {
            List<Integer> sortedAndFiltered = new ArrayList<>(entry.getValue());
            Collections.sort(sortedAndFiltered);

            Iterator<Integer> iterator = sortedAndFiltered.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() % 3 == 0) {
                    iterator.remove();
                }
            }

            resultMap.put(entry.getKey(), sortedAndFiltered);
        }

        return resultMap;
    }
}
