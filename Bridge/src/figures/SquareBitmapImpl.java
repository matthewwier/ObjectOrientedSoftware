package figures;

public class SquareBitmapImpl extends Square {

    public SquareBitmapImpl(double a) {
        super(a);
    }

    @Override
    public double calculate() {
        System.out.println("Bitmap implementation.");
        return Math.pow(a,2);
    }
}
