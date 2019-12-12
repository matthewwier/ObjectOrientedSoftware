package figures;

public class TriangleVectorImpl extends Triangle {
    public TriangleVectorImpl(double a, double b, double h) {
        super(a, b, h);
    }

    @Override
    public double calculate() {
        System.out.println("Triangle vector implementation.");
        return 0.5 * a * h;
    }
}
