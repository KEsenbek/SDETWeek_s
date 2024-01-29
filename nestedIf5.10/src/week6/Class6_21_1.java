package week6;

public class Class6_21_1 {
    public static void main(String[] args) {
       boolean check = isChicagoPhoneNum("312-555-1234");
        System.out.println(check);
    }

    public static boolean isChicagoPhoneNum(String num) {

        if (num.startsWith("312") || num.startsWith("773")){
            return true;
        }else {
            return false;
        }
    }
}
