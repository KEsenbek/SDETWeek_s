package week10;

import java.util.ArrayList;
import java.util.List;

public class Class10_13_1_Filter_animals_Array_List {
    public static void main(String[] args) {
        
        String[] animalNames = {"Lion", "Elephant", "Tiger", "Giraffe", "Leopard", "Zebra"};
        List<String> answer =  filterAnimals(animalNames, "1");

        System.out.println(answer);
    }

        public static List<String> filterAnimals(String[] animalNames, String value) {
            List<String> answer = new ArrayList<>();
            if (Character.isDigit(value.charAt(0))) {
                answer.add("Not allowed");
               return answer;
            }

            String name ="";
            for (int i = 0; i < animalNames.length ; i++) {
                name=animalNames[i];
                if (name.toLowerCase().charAt(0) == value.toLowerCase().charAt(0)) {
                    answer.add(name);
                }

            }
            return answer;
        }
}
