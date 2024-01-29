package week10;

import java.util.LinkedHashSet;
import java.util.Set;

public class Class10_24_2_Prime_Number_Finder_Set_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {
        Integer start = 1;
        Integer end = 10;
        findPrimesInRange(start,end);
    }

    public static Set<Integer> findPrimesInRange(int start, int end) {

        Set<Integer> answer = new LinkedHashSet<>();

        if (start<1){
            System.out.println("start less then 0");;
        }else if (end<start) {
            System.out.println("end num less then start");
        }else if (start==1){
            start=2;
        }

        for (int i = start; i<=end; i++){
            boolean isPrime = true;


            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
               answer.add(i);

            }

        }

        return answer;
    }

}
