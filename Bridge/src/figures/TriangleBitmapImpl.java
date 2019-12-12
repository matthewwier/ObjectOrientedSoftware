package figures;

public class TriangleBitmapImpl extends Triangle{
    public TriangleBitmapImpl(double a, double b, double h) {
        super(a, b, h);
    }

    @Override
    public double calculate() {
        System.out.println("Triangle bitmap implementation.");
        return 0.5*a*h;
    }
}
