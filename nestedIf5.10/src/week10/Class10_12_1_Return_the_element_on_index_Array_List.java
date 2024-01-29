package week10;

import java.util.List;

public class Class10_12_1_Return_the_element_on_index_Array_List {
    public static void main(String[] args) {
        List<Integer> values = List.of(new Integer[]{1, 2, 3, 4, 5});
        int index = 2;
        getListElement(values,index);
    }

    public static Integer getListElement(List<Integer> values, int index) {

        if (index<0) {
            return -1;
        }
        Integer answer = values.get(index);

        return answer;
    }
}
