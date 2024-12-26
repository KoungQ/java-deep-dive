package poly.practice;

import poly.practice.domain.Circle;
import poly.practice.domain.Shape;
import poly.practice.domain.Triangle;

import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {
        List<Shape> shapes = makeShapes();
        print(shapes);
    }

    private static List<Shape> makeShapes() {
        return List.of(
                // Success
                new Circle(3),
                new Circle(5),
                new Triangle(4, 2),
                new Triangle(9, 1)
                // Fail
//                ,new Circle(0),
//                new Triangle(0, 5),
//                new Triangle(5, 0)
        );
    }

    private static void print(List<Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("넓이: " + shape.getArea());
            System.out.println();
        }
    }
}
