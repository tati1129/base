package _17_12_2024.task;

public class Figure {
Circle circle = new Circle();
    private String color;


    public Figure(String color) {
        this.color = color;

    }

    @Override
    public String toString() {
        return "Figure{" +
                "color='" + color + '\'' +
                '}';
    }
}
