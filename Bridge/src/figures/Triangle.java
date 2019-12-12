package figures;

public abstract class Triangle implements Figure{

    public Triangle(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    double a,b,h;
}
