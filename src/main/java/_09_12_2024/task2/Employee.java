package _09_12_2024.task2;

public class Employee {
    int id;
    String name;
    String department;
    double salary;


    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Employee() {

    }
    public String convertSalaryTostr(double salary){
        return " { " + salary + " } ";
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
