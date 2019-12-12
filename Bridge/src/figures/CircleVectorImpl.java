package figures;

public class CircleVectorImpl extends Circle {

    public CircleVectorImpl(double r) {
        super(r);
    }
    @Override
    public double calculate() {
        System.out.println("Triangle vector implementation.");
        return Math.PI * Math.pow(r, 2);
    }
}
