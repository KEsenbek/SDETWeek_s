package week6;

public class Class6_6_4 {
    public static void main(String[] args) {
        calculateInsuranceCost("Toyota", "Camry",2013,"White");
    }
    public static void calculateInsuranceCost(String brand, String model, int year, String color){
    //The base insurance cost is $500.0;
    //If the car's brand is "BMW", "Mercedes-Benz" or "Lexus" add a premium of $1000.0 to the base insurance cost;
    //If the car's year is greater than or equals 2022, add a premium of $500.0 to the base insurance cost;
    //If the car's color is "White" remove a premium of $250.0 from the base insurance cost.
    //Display the calculated insurance cost along with the vehicle information to the customer.
        int insurance = 500;

        if (brand.equals("BMW") || brand.equals("Mercedes-Benz") || brand.equals("Lexus") ){
            insurance +=1000;
             if (color.equals("White") && year >= 2022){
                 insurance-=750;
           } else if (year >= 2022){
                 insurance+=500;
             }else if (color.equals("White")) {
                 insurance-=250;
             }

        }else if (year >= 2022) {
            insurance+=500;
                if (color.equals("White")) {
                    insurance-=250;
                }
        } else if (color.equals("White")) {
            insurance-=250;
        }

        System.out.println("Vehicle info\n" +
                           "Brand: " + brand +
                           "\nModel: "+ model +
                           "\nYear: "+ year +
                           "\nColor: "+ color  +
                           "\nInsurance cost: $"+insurance);

    }
}
