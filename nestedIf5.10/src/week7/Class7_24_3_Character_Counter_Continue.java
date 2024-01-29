package week7;

public class Class7_24_3_Character_Counter_Continue {
    public static void main(String[] args) {
        countCharacter("programming is fun", 'g');
    }

    public static int countCharacter(String text, char value) {
        int sum = 0;
        for (int i = 0; i<=text.length()-1; i++){
            if (text.charAt(i) != value) {
                continue;
            }

            System.out.println("Match found at index "+i);
            sum++;
        }
        System.out.println("Total count: "+ sum);
        return sum;
    }
}
