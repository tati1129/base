package _10_12_2024.task1;

import java.util.Random;

public class Drink {
    int id;
    String name;
    int volume;
    Tea tea;


    public Drink(int id, String name, int volume, Tea tea) {
        this.id = id;
        this.name = name;
        this.volume = volume;
        this.tea = tea;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                ", tea=" + tea +
                '}';
    }

    public static void main(String[] args) {
        Random random = new Random();
        Tea[] teaArr = Tea.generareArr();
         for (Tea tea : teaArr){
             //System.out.println(tea);
         }






        Drink drink1 = new Drink(1, "Morning Delay", 300, teaArr[0]);
        Drink drink2 = new Drink(2, "Evening Relax", 200, teaArr[1]);
        Drink drink3 = new Drink(3, "Night Bliss", 150, teaArr[2]);

        System.out.println(drink1);
        System.out.println(drink2);
        System.out.println(drink3);
    }

}
