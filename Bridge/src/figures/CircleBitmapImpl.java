package figures;

public class CircleBitmapImpl extends Circle {


    public CircleBitmapImpl(double r) {
        super(r);
    }
    @Override
    public double calculate() {
        System.out.println("Triangle bitmap implementation.");

        return Math.PI * Math.pow(r, 2);
    }
}
