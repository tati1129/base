package _10_12_2024;

public class Human {
    int id;
    String name;
    int age;
    Pet pet;

    public Human(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }
    public Human(int id, String name, int age, Pet pet) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public static void main(String[] args) {
        Human human1 = new Human(1, "Nik", 22);
        Human human2 = new Human(2, "Mik", 25);
        //или
        // Human humanPet  = new Human(3, "Sam", 26, new Pet(1, "Barsic"));

        Pet pet = new Pet(1, "Barsic");
        Human humanPet  = new Human(3, "Sam", 26, pet);

        System.out.println(humanPet.pet.petName);
    }
}
