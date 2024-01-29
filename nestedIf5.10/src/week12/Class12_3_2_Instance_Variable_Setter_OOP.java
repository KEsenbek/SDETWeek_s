package week12;

public class Class12_3_2_Instance_Variable_Setter_OOP {

    class VariableSetter{
        private int value;
        private String text;

        public VariableSetter(int value, String text) {
            this.value = value;
            this.text = text;
        }

        public void setValues(int value, String text) {
            this.value = value;
            this.text = text;
        }

        // Instance method to print values
        public void printValues() {
            System.out.println("Value: " + value + ", Text: " + text);
        }
    }
}
