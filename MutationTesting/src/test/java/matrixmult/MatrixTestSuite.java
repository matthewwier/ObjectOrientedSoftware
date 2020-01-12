package matrixmult;

import matrix.Matrix;
import matrix.MatrixMultiplication;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatrixTestSuite {

    private Matrix matrixA;
    private Matrix matrixB;

    @Before
    public void setMatrixA() {
        matrixA = new Matrix();
        matrixA.setElem(0, 0, 1);
        matrixA.setElem(1, 0, 1);
        matrixA.setElem(1, 1, 2);
        matrixA.setElem(2, 0, 1);
    }

    @Before
    public void setMatrixB() {
        matrixB = new Matrix();
        matrixB.setElem(0, 0, 2);
        matrixB.setElem(1, 0, 2);
        matrixB.setElem(1, 1, 2);
        matrixB.setElem(1, 2, 3);
        matrixB.setElem(2, 1, 1);
    }

    @Test
    public void matrixInitialization(){
        Matrix matrix = new Matrix();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Assert.assertEquals(Double.valueOf(0), matrix.getElem(i, j));
            }
        }
    }

    @Test
    public void setMatrixElem() {
        Matrix matrix = new Matrix();
        matrix.setElem(1, 2, 15.5);
        Assert.assertEquals(Double.valueOf(15.5), matrix.getElem(1, 2));
    }

    @Test
    public void initializeMatrices() {
        MatrixMultiplication matrixMultiplication = new MatrixMultiplication(matrixA, matrixB);
        double[][] matrixA = {
                {1, 0, 0},
                {1, 2, 0},
                {1, 0, 0}
        };
        double[][] matrixB = {
                {2, 0, 0},
                {2, 2, 3},
                {0, 1, 0}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Assert.assertEquals(Double.valueOf(matrixA[i][j]), matrixMultiplication.getMatrixA().getElem(i, j));
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Assert.assertEquals(Double.valueOf(matrixB[i][j]), matrixMultiplication.getMatrixB().getElem(i, j));
            }
        }

    }

    @Test
    public void multiplyMatrix() {
        MatrixMultiplication matrixMultiplication = new MatrixMultiplication(matrixA, matrixB);
        Matrix resultMatrix = matrixMultiplication.multiply();
        double[][] result = {
                {2, 0, 0},
                {6, 4, 6},
                {2, 0, 0}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Assert.assertEquals(Double.valueOf(result[i][j]), resultMatrix.getElem(i, j));
            }
        }
    }

}
