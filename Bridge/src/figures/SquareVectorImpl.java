package figures;

public class SquareVectorImpl extends Square {

    public SquareVectorImpl(double a) {
        super(a);
    }

    @Override
    public double calculate() {
        System.out.println("Vector implementation.");
        return Math.pow(a,2);
    }
}
