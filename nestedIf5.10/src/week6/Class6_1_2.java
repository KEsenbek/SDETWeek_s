package week6;

public class Class6_1_2 {
    public static void main(String[] args) {

        Class6_1_2 mainInstance = new Class6_1_2();
        String var = mainInstance.getCapitalCities();
        System.out.println(var);
    }

    public static String getCapitalCities() {
        return "Canberra, Kathmandu, Dakar";
    }
}
