package week11;

import java.util.HashMap;
import java.util.Map;

public class Class11_12_5_Library_Catalog_Size_Checker_Maps {
    public static void main(String[] args) {
        Map<String, Integer> library = new HashMap<>();
        library.put("Book A", 5);
        library.put("Book B", 3);
        library.put("Book C", 8);

        calculateCatalogSize(library);

    }

    public static int calculateCatalogSize(Map<String, Integer> library) {

        int sum = 0;

        for (Integer size:library.values()) {
            sum+=size;
        }
        return sum;
    }
}
