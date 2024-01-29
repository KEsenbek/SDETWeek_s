package week10;

public class CLass10_6_3_Car_Rental_Request_Wrapper_Class {
    public static void main(String[] args) {
        int age = 25;
        int drivingExperience = 3;
        double income = 45000.00;
        decideRentalApproval(age,drivingExperience,income);
    }

    public static String decideRentalApproval(int age, int drivingExperience, double income) {
        boolean answer;

        if (age>=21&&drivingExperience>=2&&income>=40000) {
            answer = true;
        }else {
            answer = false;
        }

        return Boolean.toString(answer);
    }
}
