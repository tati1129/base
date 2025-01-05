package _12_12_2024.task1;


import com.github.javafaker.Faker;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Faker faker = new Faker();


        Employee[] employees = new Employee[3];

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee(faker.name().firstName(), random.nextInt(60), random.nextBoolean(), random.nextDouble() * 100);
        }


        Department[] departments = new Department[3];

        for (int i = 0; i < departments.length; i++) {
            departments[i] = new Department(i + 1, faker.commerce().department(), employees);
        }

        Company[] companies = new Company[3];

        for (int i = 0; i < companies.length; i++) {
            companies[i] = new Company(i + 1,
                    faker.company().name(),
                    faker.address().city(),
                    departments
            );
            System.out.println(companies[i]);
        }
        getEmp(companies[1]);

    }

    public static void getEmp(Company company) {

        Department[] departments = company.getDepartments();
        double max = 0.0;
        Employee maxEmployee = null;
        for (int i = 0; i < departments.length; i++) {
            Employee[] employees = departments[i].getEmployees();
            for (int j = 0; j < employees.length; j++) {
                if (employees[i].getSalary() > max) {
                    max = employees[j].getSalary();
                    maxEmployee = employees[j];
                }
            }

        }
        System.out.println("Employee with max salary: " + " - " + maxEmployee.getName() + " ( " + max + " )");
    }
}
