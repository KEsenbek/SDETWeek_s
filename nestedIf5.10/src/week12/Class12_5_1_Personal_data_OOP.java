package week12;

public class Class12_5_1_Personal_data_OOP {

    class Person{
        private String name;// Represents the name of the person.

        private int age;// Represents the age of the person.

        private String email;// Represents the email address of the person.

        private String phoneNumber;// Represents the phone number of the person.

        public Person(String name, int age, String email, String phoneNumber) {
            this.name = name;
            this.age = age;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
