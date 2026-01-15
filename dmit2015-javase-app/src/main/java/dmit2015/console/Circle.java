package dmit2015.console;

/**
 * This class models a Circle shape.
 *
 * @author Nazar Bilinskyi
 * @version 2026.01.14
 */

public class Circle {
    // defining a field
    private double radius;
    //defining getters and setters (fields)

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw  new IllegalArgumentException("Radius must be greater than 0");
        }
        this.radius = radius;
    }

    public Circle () {
        setRadius(1.0);
    }

    public Circle (double radius)
    {
        setRadius(radius);
    }

    public  double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getDiameter()
    {
        return 2 * radius;
    }

    public  double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

}
