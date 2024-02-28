package lesson_10;

public class Matrix implements IMatrix {
    private double[][] matrix;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(int rows, int columns) {
        if ((rows < 1) || (columns < 1)) {
            System.out.println("Переданные параметры некорректны, матрица будет размером 1х1");
            matrix = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
            return;
        }
        matrix = new double[rows][columns];
    }

    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows() || colIndex < 0 || colIndex >= getColumns()) {
            System.out.println("Переданные параметры некорректны");
            return 0;
        }
        return matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows() || colIndex < 0 || colIndex >= getColumns()) {
            System.out.println("Переданные параметры некорректны");
            return;
        }
        matrix[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        if (this.getRows() != otherMatrix.getRows() || this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы не равны!!!");
            return null;
        }
        IMatrix result = new Matrix(this.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows() || this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы не равны!!!");
            return null;
        }
        IMatrix result = new Matrix(this.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getRows()) {
            System.out.println("Такие матрицы нельзя перемножить, т.к. количество столбцов матрицы А не равно количеству строк матрицы В");
            return null;
        }
        IMatrix result = new Matrix(this.getRows(), otherMatrix.getColumns());

        int newRows = this.getRows();
        int newColumns = otherMatrix.getColumns();

        for (int i = 0; i < newRows; i++) {
            for (int j = 0; j < newColumns; j++) {
                double value = 0;
                for (int k = 0; k < this.getColumns(); k++) {
                    value += matrix[i][k] * otherMatrix.getValueAt(k, j);
                }
                result.setValueAt(i, j, value);
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(double value) {
        IMatrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return result;
    }

    @Override
    public IMatrix transpose() {
        IMatrix result = new Matrix(this.getColumns(), this.getRows());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(j, i));
            }
        }
        return result;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                matrix[i][j] = value;
            }
        }

    }

    @Override
    public double determinant() {
        int n = matrix.length;
        if (n != 2) {
            System.out.println("Расчет только для матрицы 2х2, а то застрелится можно");
            return 0;
        } else {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        if (!isSquareMatrix()) {
            System.out.println("Матрица должна быть квадратной!!!");
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j && matrix[i][i] != 1) {
                    return false;
                }
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        int newRows = this.getRows();
        int newColumns = this.getColumns();
        if (newRows != newColumns) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void printToConsole() {
        for (double[] doubles : matrix) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + " ");
            }
            System.out.println();
        }
    }
}
