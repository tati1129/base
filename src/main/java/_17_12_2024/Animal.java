package _17_12_2024;


class Animal {
    private int age;
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(int age, String name) {
        System.out.println("ANIMAL");
        this.age = age;
        this.name = name;
    }
    public void makeVoice(){
        System.out.println("Animal Make voice");
    }
}
class Person{
    static Person person1 = new Person();
    public static void main(String[] args) {
        Dog dog = new Dog(3,"Sam",person1 );
        dog.hashCode();

    }
}
class Cat extends Animal{

    @Override
    public void makeVoice() {
        System.out.println("Cat make voice");
    }

    public Cat(int age, String name) {
        super(age, name);
        System.out.println();

    }

}
class Dog extends Animal{
    private Person person;
    public Dog(int age, String name, Person person) {
        super(age, name);
        this.person = person;
        System.out.println();
    }

}
