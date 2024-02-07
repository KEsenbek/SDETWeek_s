package week13;

public class Class13_11_1_Cleanable_Interfaces {
    public static void main(String[] args) {
        Dish dish = new Dish("Ceramic");
        dish.clean();

        System.out.println();

        Floor floor = new Floor(50.0);
        floor.clean();
    }
}

interface Cleanable {
    void clean();
}

class Dish implements Cleanable{
    private String material;

    public Dish(String material) {
        this.material = material;
    }
    @Override
    public void clean(){
        scrub();
        rinse();
        dry();
    }
    public void scrub(){
        System.out.println("Scrubbing the dish made of "+material);
    }

    public void rinse() {
        System.out.println("Rinsing the dish made of "+material);
    }

    public void dry() {
        System.out.println("Drying the dish made of "+material);
    }
}

class Floor implements Cleanable{
    private double area;

    public Floor(double area) {
        this.area = area;
    }
    public void sweep() {
        System.out.println("Sweeping the floor with an area of "+area+" square meters");
    }
    public void mop() {
        System.out.println("Mopping the floor with an area of "+area+" square meters");
    }
    public void dry() {
        System.out.println("Drying the floor with an area of "+area+" square meters");
   }
    @Override
    public void clean() {
        sweep();
        mop();
        dry();
    }


}