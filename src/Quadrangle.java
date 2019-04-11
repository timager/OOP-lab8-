public abstract class Quadrangle{
     double a;
     double b;
     private double c;
     private double d;

     double angleAB;
     private double angleBC;
     private double angleCD;
     private double angleDA;

    Quadrangle(double a, double b, double c, double d, double angleAB, double angleBC, double angleCD, double angleDA) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.angleAB = angleAB;
        this.angleBC = angleBC;
        this.angleCD = angleCD;
        this.angleDA = angleDA;
    }

    protected double getPerimetr(){
        return a+b+c+d;
    }

    abstract double getArea();
}
