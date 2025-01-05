package _12_12_2024.firstPart;

public class Example1 {
    //private  int a; //private виден только на уровне класса в кот создан => Example1
    //    private void get(){//private виден только на уровне класса в кот создан => Example1
//
//    }

    public static void main(String[] args) {
    //new Example1().get();

        //new Human1().department = "IT";
        Human1 human1 = new Human1();
        human1.department = "IT";
        human1.setAge(33);
    }

}

class Human1 {
    private int age;
    private String name;
    String department;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}