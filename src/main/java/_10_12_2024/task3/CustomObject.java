package _10_12_2024.task3;

import java.util.Random;

public class CustomObject {
    int id;
    double value;
    boolean isActive;
    char symbol;
    float weight;
    byte age;
    short level;

    public CustomObject(int id, double value, boolean isActive, char symbol, float weight, byte age, short level) {
        this.id = id;
        this.value = value;
        this.isActive = isActive;
        this.symbol = symbol;
        this.weight = weight;
        this.age = age;
        this.level = level;
    }

    @Override
    public String toString() {
        return "CustomObject{" +
                "id=" + id +
                ", value=" + value +
                ", isActive=" + isActive +
                ", symbol=" + symbol +
                ", weight=" + weight +
                ", age=" + age +
                ", level=" + level +
                '}';
    }
    Random random = new Random();

    public CustomObject[] generateObj(){
        CustomObject[] customObjects = new CustomObject[20];

        for (int i = 0; i < customObjects.length; i++) {
            customObjects[i] = new CustomObject(
                   i+1,
                   random.nextDouble()*100,
                   random.nextBoolean(),
                    (char)( 65 + random.nextInt(26)),
                    //random.nextFloat(1.0F, 51.0F),
                    1.0F + random.nextFloat() * (51.0F - 1.0F),
                    (byte) random.nextInt(256),
                    (short) random.nextInt(32768)
            );
        }
        return customObjects;
    }

    public static void main(String[] args) {
        CustomObject customObject = new CustomObject(0, 0.0, false, 'A', 0.0f, (byte) 0, (short) 0);

        CustomObject[] newCustomObjects = customObject.generateObj();


        for (int i = 0; i < newCustomObjects.length; i++) {
            System.out.println(newCustomObjects[i]);
        }
    }
}
