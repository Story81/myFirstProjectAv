package lesson_10;

public class Main {

    public static void main(String[] args) {
        double[][] forA = {{2, 4, 3, 5},
                {1, 4, 9, 2},
                {9, 8, 5, 0}};

        double[][] forB = {{5, 0, 4, 1},
                {1, 1, 0, 1},
                {2, 3, 5, 0}};

        double[][] forC = {{5, 0, 4},
                {1, 1, 0},
                {2, 3, 5},
                {1, 2, 6}};

        double[][] forE = {{5, 0, 4},
                {1, 1, 0},
                {1, 2, 6}};

        double[][] forF = {{1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}};

        double[][] forG = {{8, 2},
                {2, 1},};


        IMatrix matrix = new Matrix(3, 4);
        IMatrix a = new Matrix(forA);
        IMatrix b = new Matrix(forB);
        IMatrix c = new Matrix(forC);
        IMatrix e = new Matrix(forE);
        IMatrix f = new Matrix(forF);
        IMatrix g = new Matrix(forG);

        System.out.println(a.getRows());
        System.out.println(a.getColumns());

        System.out.println("\n----- метод getValueAt:");
        System.out.println("Значение ячейки матрицы равно " + a.getValueAt(2, 2));

        System.out.println("\n----- метод setValueAt:");
        c.setValueAt(2, 222, 15);

        System.out.println("\n----- метод add:");
        a.add(b).printToConsole();

        System.out.println("\n----- метод sub:");
        a.sub(b).printToConsole();

        System.out.println("\n----- метод mul:");
        a.mul(c).printToConsole();

        System.out.println("\n----- метод mul:");
        a.mul(2).printToConsole();

        System.out.println("\n----- метод transpose:");
        a.transpose().printToConsole();

        System.out.println("\n----- метод fillMatrix:");
        b.fillMatrix(1);
        b.printToConsole();

        System.out.println("\n----- метод determinant:");
        System.out.println("Детерминант равен " + g.determinant());

        System.out.println("\n----- метод isNullMatrix:");
        System.out.println("Матрица нулевая? " + matrix.isNullMatrix());
        matrix.printToConsole();

        System.out.println("\n----- метод isIdentityMatrix:");
        System.out.println("Матрица единичная? " + f.isIdentityMatrix());
        f.printToConsole();

        System.out.println("\n----- метод isSquareMatrix:");
        System.out.println("Матрица квадратная? " + f.isSquareMatrix());


    }
}
