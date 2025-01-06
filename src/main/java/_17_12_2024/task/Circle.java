package _17_12_2024.task;

public class Circle extends Figure {
    private double radius;



    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (radius * radius * Math.PI);
    }

    @Override
    public double getPerimetr() {
        return (2 * radius * Math.PI);
    }



    @Override
    public String toString() {
        return "Circle { " +
                " color " + getColor() +
                " radius = " + radius +
                ", pi=" + Math.PI +
                " area = " + getArea() +
                " perimetr = " + getPerimetr() +
                '}';
    }
}
