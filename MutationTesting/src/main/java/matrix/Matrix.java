package matrix;

public class Matrix {

    private double[][] matrix;

    public Matrix() {
        this.matrix = new double[3][3];
    }

    public void setElem(int i, int j, double value) {
        matrix[i][j] = value;
    }

    public Double getElem(int i, int j) {
        return matrix[i][j];
    }
}
