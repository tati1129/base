package _12_12_2024.task1;

import java.util.Arrays;


public class Department {
    private int id;
    private String departName;
    private Employee[] employees;


    public Department(int id, String departName, Employee[] employees) {
        this.id = id;
        this.departName = departName;
        this.employees = employees;
    }

    public Department() {

    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departName='" + departName + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
    public Employee[] getEmployees(){
        return employees;
    }
}
