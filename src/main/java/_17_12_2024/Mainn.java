package _17_12_2024;

public class Mainn {
    public static void main(String[] args) {
        int x = 3;
        int y = 31;

        int[] arr = {123, 234};
        Box[] boxes = {new Box(), new Box()};
        AbstractBox[] abstractBoxes = {new Box(), new Gift(), new AbstractBox()};
        Pers pers = new Pers();
        pers.abstractBoxes = abstractBoxes;
    }
}

class Box extends AbstractBox {
    int height;
    int weght;
    double volume;
    Gift gift;
}

class Gift extends AbstractBox {
    int id;
    double price;
}

class AbstractBox {

}

class Pers {

    AbstractBox[] abstractBoxes;
}