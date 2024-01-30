package week12;

public class Class12_18_1_Animal_OOP {
    public static void main(String[] args) {

    }
}

class Animals {

   private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0) {
            System.out.println("Age cannot be less than 0");
        }else {
            this.age = age;
        }
    }

    public void makeSound(){
        System.out.println(name + " at age "+age+" makes a sound");
    }
}

class Cat extends Animals {

}