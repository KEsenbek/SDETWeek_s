package week12;

public class Class12_3_1_University_class_OOP {
    class University{
        public String name;
        public String location;
        public int establishedYear;
        public int studentCount;



        public University() {
            this.name = "Unknown";
            this.location = "Unknown";
            this.establishedYear = 0;
            this.studentCount = 0;
        }

        // Constructor with the name parameter
        public University(String name) {
            this.name = name;
            this.location = "Unknown";
            this.establishedYear = 0;
            this.studentCount = 0;
        }

        // Constructor with the name, location, and establishedYear parameters
        public University(String name, String location, int establishedYear) {
            this.name = name;
            this.location = location;
            this.establishedYear = establishedYear;
            this.studentCount = 0;
        }

        // Constructor with all parameters
        public University(String name, String location, int establishedYear, int studentCount) {
            this.name = name;
            this.location = location;
            this.establishedYear = establishedYear;
            this.studentCount = studentCount;
        }
    }
}
