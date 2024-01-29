package week9;

public class Class9_6_6_Weather_Data_Printer_Arrays_with_Loops {
    public static void main(String[] args) {
        printWeatherData(new double[]{75.2, 82.5, 78.9, 85.1, 79.4});
    }

    public static void printWeatherData(double[] temperatures ) {

            int j = 1;
            for (int i = 0; i< temperatures.length; i++ ) {
                System.out.println( j+" - " + temperatures[i]);
                j++;
            }
    }
}
