package _09_12_2024.taskFaker;

import com.github.javafaker.Faker;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Random random = new Random();

        Employee[] employees = new Employee[10];

        for (int i = 0; i < employees.length ; i++) {
            employees[i] = new Employee( i+1,
                    faker.name().firstName(),
                    faker.commerce().department(),
                    random.nextDouble()
                    );
            System.out.println(employees[i]);
        }
    }
}
