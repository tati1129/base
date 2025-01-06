package _17_12_2024.task;

import java.util.Random;

public class Generator {
    public static void main(String[] args) {
        Random random = new Random();

        Circle[] circles = new Circle[3];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle("red",
                    Math.abs(random.nextDouble() * 21.0)
            );
            //System.out.println(circles[i]);
        }

        Triangle[] triangles = new Triangle[3];
        for (int i = 0; i < triangles.length; i++) {
            triangles[i] = new Triangle("green",
                    Math.abs(random.nextDouble() * 21.0),
                    Math.abs(random.nextDouble() * 21.0),
                    Math.abs(random.nextDouble() * 2.10)
            );
            //System.out.println(triangles[i]);
        }
        Rectangle[] rectangles = new Rectangle[3];
        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle("blue",
                    Math.abs(random.nextDouble() * 21.0),
                    Math.abs(random.nextDouble() * 21.0)
            );
            //System.out.println(rectangles[i]);
        }


        Object[] figures = new Object[3];
        figures[0] = circles;
        figures[1] = rectangles;
        figures[2] = triangles;


        for (int i = 0; i < figures.length; i++) {
            Object[] arr = (Object[]) figures[i];
            System.out.println("Array at index " + i + " : ");
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j]);
            }

        }
    }
}
