package dmit2015.console;

import java.util.ArrayList;
import java.util.List;

public class ShapeDemo {
    static void main() {
        List<Shape> shapes = List.of(
                new Circle(5)
        );

        for (Shape currentShape : shapes) {
            System.out.printf("Area: %.2f, Perimeter: %.2f\n",
                    currentShape.getArea(), currentShape.getPerimeter());
        }
    }
}
