package week12;

public class Class12_2_1_Dog_and_the_order_of_params_OOP {
    class Dog{
        public String name;
        public int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Dog(int age, String name) {
            this.name = name;
            this.age = age;
        }
    }
}
