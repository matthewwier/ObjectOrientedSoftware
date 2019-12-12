package figures;

public class SquareBitmapImpl extends Square {
    @Override
    public int calculate() {
        System.out.println("Bitmap implementation.");
        return a*b;
    }
}
