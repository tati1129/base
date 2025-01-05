package _12_12_2024.task1;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private  String adress;
    private Department[] departments;

    public Company(int id, String name, String adress, Department[] departments) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.departments = departments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", departments=" + Arrays.toString(departments) +
                '}';
    }
}
