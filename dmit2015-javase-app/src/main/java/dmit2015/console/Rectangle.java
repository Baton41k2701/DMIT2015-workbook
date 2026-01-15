package dmit2015.console;

public class Rectangle {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a <= 0)
            throw new IllegalArgumentException("A must be greater than 0");
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b <= 0)
            throw new IllegalArgumentException("B must be greater than 0");
        this.b = b;
    }

    public  Rectangle()
    {
        setA(0);
        setB(0);
    }

    public Rectangle(double a, double b) {
        setA(a);
        setB(b);
    }

    public double getArea()
    {
        return a * b;
    }
    public double getPerimeter()
    {
        return a + b;
    }

}
