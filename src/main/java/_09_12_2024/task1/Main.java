package _09_12_2024.task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Random random = new Random();


        emp1.id = 1;
        emp1.name = "Mike";
        emp1.department = "IT";
        emp1.salary = 1982.34;

        emp2.id = 1;
        emp2.name = "Nik";
        emp2.department = "HR";
        emp2.salary = 1782.34;


        System.out.println(emp1.convertSalaryTostr(emp1.salary));

    }
}
