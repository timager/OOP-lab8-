class Parallelogram extends Quadrangle {
    Parallelogram(double a, double b, double angleAB) {
        super(a, b, a, b, angleAB, 180 - angleAB, angleAB, 180 - angleAB);
    }

    @Override
    double getArea() {
        return a * b * Math.sin(angleAB);
    }
}
