package week10;

import java.util.ArrayList;

public class Class10_16_2_Population_Tracker_Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> population = new ArrayList<>();
        population.add(100000);
        population.add(120000);
        population.add(150000);
        printPopulationData(population);
    }

    public static void printPopulationData(ArrayList<Integer> population) {

        for (int i = 0; i < population.size(); i++) {
            System.out.println(i+ " - " +population.get(i));

        }
    }
}
