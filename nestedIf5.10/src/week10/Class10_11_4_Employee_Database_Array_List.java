package week10;

import java.util.List;

public class Class10_11_4_Employee_Database_Array_List {
    public static void main(String[] args) {
        List<String> employees = List.of(new String[] {"John Smith", "Mary Johnson", "James Brown"});
        String newEmployee = "Emily Davis";

        addEmployee(employees,newEmployee);
    }

    public static List<String> addEmployee(List<String> employees, String newEmployee) {
    employees.add(newEmployee);
    return employees;
    }
}
