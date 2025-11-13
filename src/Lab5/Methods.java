package Lab5;

public class Methods {
    public static int sumDiagonal(int[][] m) {
        int sum = 0;
        for(int i = 0; i < m.length; i++){
            sum += m[i][i];
        }
        return sum;
    }

    public static int sumSecondaryDiagonal(int[][] m) {
        int sum = 0;
        for(int i = 0; i < m.length; i++){
            sum += m[i][m.length-1-i];
        }
        return sum;
    }

    public static boolean isSquareMatrix(int[][] m){
        return m.length == m[0].length;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("\nСумма диагонали (matrix1): " + sumDiagonal(matrix1));
        System.out.println("Сумма побочной диагонали: " + sumSecondaryDiagonal(matrix1));
        System.out.println("Квадратная ли первая матрица? - " + isSquareMatrix(matrix1));

        int[][] matrix2 = {{1, 2}, {3, 4}};
        System.out.println("\nСумма диагонали (matrix2): " + sumDiagonal(matrix2));
        System.out.println("Сумма побочной диагонали: " + sumSecondaryDiagonal(matrix2));
        System.out.println("Квадратная ли вторая матрица? - " + isSquareMatrix(matrix2));

        int[][] matrix3 = {{1, 2}, {3, 4}, {5,6}};
        System.out.println("\nКвадратная ли третья матрица? - " + isSquareMatrix(matrix3));
    }
}
