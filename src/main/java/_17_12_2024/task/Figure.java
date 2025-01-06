package _17_12_2024.task;

public abstract class Figure {

    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract double getPerimetr();

    @Override
    public abstract String toString();
}
