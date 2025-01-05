package _17_12_2024.task;

public class Rectangle extends Figure {
    private double side1;
    private double side2;


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

    public Rectangle(double side1, double side2, double area, double perimetr) {
        super(0);
        this.side1 = side1;
        this.side2 = side2;
        this.area = getArea(side1,side2);
        this.perimetr = getPerim(side1, side2);

    }
    public double getArea(double side1, double side2){
        double result = side1 * side2;
        return result;
    }

    public double getPerim(double side1, double side2){
        double result = (side1 + side2) * 2;
        return result;
    }
}
