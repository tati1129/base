package _17_12_2024.task;

public  class Triangle extends Figure {
    private double side1;
    private double side2;

    private double radian;


    public Triangle(String color,double side1, double side2, double radian) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.radian = radian;
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

    public double getRadian() {
        return radian;
    }

    public void setRadian(double radian) {
        this.radian = radian;
    }

    @Override
    public double getArea() {
        return (0.5 * side1 *side2 * Math.sin(radian));
    }

    @Override
    public double getPerimetr() {
        double side3 = Math.sqrt(side1 * side1 + side2 * side2 - 2 * side1 * side2 * Math.cos(radian));
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "  Triangle{" +
                " side1 = " + side1 +
                " , side2 = " + side2 +
                " , radian = " + radian +
                '}';
    }
}
