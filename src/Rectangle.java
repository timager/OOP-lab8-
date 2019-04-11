public class Rectangle extends Parallelogram {
    Rectangle(double a, double b) {
        super(a, b, 90);
    }

    public double getArea() {
        return a * b;
    }
}
