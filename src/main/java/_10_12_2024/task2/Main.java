package _10_12_2024.task2;

public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy(1, "round", "red", 10);
        Toy toy2 = new Toy(2, "star", "silver", 13);
        Toy toy3 = new Toy(3, "round", "green", 9);

        Toy[] arrToys = new Toy[3];
        arrToys[0] = toy1;
        arrToys[1] = toy2;
        arrToys[2] = toy3;

        ChristmasTree christmasTree1 = new ChristmasTree(120, 100, arrToys);
        ChristmasTree christmasTree2 = new ChristmasTree(150, 120, arrToys);
        ChristmasTree christmasTree3 = new ChristmasTree(140, 110, arrToys);
    }

}
