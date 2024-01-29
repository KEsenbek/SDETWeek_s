package week9;

public class Class9_12_1_Remove_duplicates_Array_Arrays_with_Split {
    public static void main(String[] args) {
        removeDuplicatesFromString("The quick brown fox jumps over the lazy dog The lazy dog is quick");
    }

    public static String[] removeDuplicatesFromString(String inputString) {
        String[] array = inputString.trim().split(" ");
        String[] result = new String[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            String word = array[i].trim();
            if (!word.isEmpty()) {
                int counter = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[j].trim().equalsIgnoreCase(word)) {
                        counter++;
                        if (counter == 2) break;
                    }
                }
                if (counter == 1) result[index++] = word;
            }
        }
        String[] finalResult = new String[index];
        for (int i = 0; i  < finalResult.length; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }
}
