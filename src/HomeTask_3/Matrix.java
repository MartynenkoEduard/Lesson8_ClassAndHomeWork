package HomeTask_3;

public class Matrix {

    double[][] matrix;

    public Matrix(final int N) {
        this.matrix = new double[N][N];
    }

    public void sum(Matrix second) {
        for (int r = 0; r < this.matrix.length; r++) {
            for (int c = 0; c < this.matrix.length; c++) {
                this.matrix[r][c] += second.matrix[r][c];
            }
        }
    }

    public static Matrix sum(Matrix first, Matrix second) {
        Matrix result = null;
        if (first.matrix.length == second.matrix.length && first.matrix[0].length == second.matrix[0].length) {
            result = new Matrix(first.matrix.length);
            for (int r = 0; r < first.matrix.length; r++) {
                for (int c = 0; c < first.matrix.length; c++) {
                    result.matrix[r][c] = first.matrix[r][c] + second.matrix[r][c];
                }
            }
        }
        return result;
    }

    public void print() {
        for (int r = 0; r < this.matrix.length; r++) {
            for (int c = 0; c < this.matrix.length; c++) {
                System.out.print(String.format("%5.1f", this.matrix[r][c]));
            }
            System.out.println();
        }
        System.out.println();
    }


    public static Matrix subtract(Matrix first, Matrix second) {
        Matrix result = null;
        if (first.matrix.length == second.matrix.length && first.matrix[0].length == second.matrix[0].length) {
            result = new Matrix(first.matrix.length);
            for (int r = 0; r < first.matrix.length; r++) {
                for (int c = 0; c < first.matrix.length; c++) {
                    result.matrix[r][c] = first.matrix[r][c] - second.matrix[r][c];
                }
            }
        }
        return result;
    }

    public void subtract(Matrix second) {
        for (int r = 0; r < this.matrix.length; r++) {
            for (int c = 0; c < this.matrix.length; c++) {
                this.matrix[r][c] -= second.matrix[r][c];
            }
        }
    }

    public static Matrix multiply(Matrix first, Matrix second) {
        Matrix result = null;
        if (first.matrix.length == second.matrix.length && first.matrix[0].length == second.matrix[0].length) {
            result = new Matrix(first.matrix.length);
            for (int r = 0; r < first.matrix.length; r++) {
                for (int c = 0; c < first.matrix.length; c++) {
                    result.matrix[r][c] = first.matrix[r][c] * second.matrix[r][c];
                }
            }
        }
        return result;
    }
    public void multiplyBy(int number) {
        for (int r = 0; r < this.matrix.length; r++) {
            for (int c = 0; c < this.matrix.length; c++) {
                this.matrix[r][c] *= number;
            }
        }
    }

    public boolean isIdentity(Matrix second) {
        boolean result = false;
        if (this.matrix.length == second.matrix.length) {
            for (int row = 0; row < this.matrix.length; row++) {
                for (int column = 0; column < this.matrix[row].length; column++) {
                    if (this.matrix[row][column] == second.matrix[row][column]) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
            }
        }
        return  result;
    }
}