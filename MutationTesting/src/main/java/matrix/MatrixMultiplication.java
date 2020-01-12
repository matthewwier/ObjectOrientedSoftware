package matrix;

public class MatrixMultiplication {

    private Matrix matrixA;
    private Matrix matrixB;

    public MatrixMultiplication(Matrix matrixA, Matrix matrixB) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
    }

    public Matrix multiply() {

        Matrix resultMatrix = new Matrix();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double i_j_elem = 0;
                for (int k = 0; k < 3; k++) {
                    i_j_elem += matrixA.getElem(i, k) * matrixB.getElem(k, j);
                }
                resultMatrix.setElem(i, j, i_j_elem);

            }
        }

        return resultMatrix;
    }

    public Matrix getMatrixA() {
        return matrixA;
    }

    public Matrix getMatrixB() {
        return matrixB;
    }
}
