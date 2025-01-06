package _17_12_2024.task;

public class Rectangle extends Figure {
    private double side1;
    private double side2;

    public Rectangle(String color, double side1, double side2) {
        super(color);
        this.side1 = side1;
       this.side2 = side2;

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public double getPerimetr() {
        return (side1 + side2) * 2;
    }


    @Override
    public String toString() {
        return " Rectangle { " +
                " color " + getColor() +
                " side1 =  " + side1 +
                ", side2 = " + side2 +
                " area = " + getArea() +
                " perimetr = " + getPerimetr() +
                '}';
    }
}
