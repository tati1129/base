package _17_12_2024.task;

public class Triangle extends Figure {
    private double side1;
    private double side2;

    public Triangle(double side1, double side2, double area, double perimetr) {
        super(area, perimetr);
        this.side1 = side1;
        this.side2 = side2;
    }

}
