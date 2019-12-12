package figures;

public class SquareVectorImpl extends Square {
    @Override
    public int calculate() {
        System.out.println("Vector implementation.");
        return a*b;
    }
}
