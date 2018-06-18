package com.epam.homework;

import java.util.Scanner;

public class Task17 {

    /**
     * Вычислить определитель матрицы
     * <a href="https://github.com/elefus/epam-core-04-2018/wiki/Представление-матриц">Представление матриц</a>
     * <p>
     * Формат входных данных:
     * N - целое число (0 < N < 10)
     * N ^ 2 целых чисел (Integer.MIN_VALUE < element < Integer.MAX_VALUE)
     * <p>
     * Формат выходных данных:
     * Целое число, соответствующее определителю матрицы.
     * <p>
     * ---------------------------------------------------------------------------------------------------
     * Примеры выполнения задания:
     * <p>
     * Входные данные:
     * 3
     * -2  1  2
     * 0 -1  0
     * 1 -2  3
     * <p>
     * Выходные данные:
     * 8
     * <p>
     * <p>
     * Входные данные:
     * 4
     * 6 4 0 1
     * 8 7 0 3
     * 1 3 0 9
     * 7 5 1 2
     * <p>
     * Выходные данные:
     * -65
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] myMatrix = readMatrix(sc);
        System.out.println(getDeterminant(myMatrix));

    }

    private static int[][] readMatrix(Scanner scanner) {
        int dimension = scanner.nextInt();
        int[][] matrix = new int[dimension][dimension];
        for (int row = 0; row < dimension; ++row) {
            for (int col = 0; col < dimension; ++col) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static int getDeterminant(int[][] matrix) {
        int determinant = 0;
        switch (matrix.length) {
            case 1:
                return matrix[0][0];
            case 2:
                return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
            default:
                for (int i = 0; i < matrix.length; i++) {
                    determinant += (matrix[0][i] * Math.pow((-1), i) * getDeterminant(createAnotherMatrix(matrix, i)));
                }
                return determinant;
        }
    }

    private static int[][] createAnotherMatrix(int[][] matrix, int col) {
        int[][] anotherMatrix = new int[matrix.length - 1][matrix.length - 1];
        for (int row1 = 0, row2 = 0; row1 < matrix.length; row1++, row2++) {
            if (0 != row1) {
                for (int col1 = 0, col2 = 0; col1 < matrix.length; col1++, col2++) {
                    if (col != col1) {
                        anotherMatrix[row2][col2] = matrix[row1][col1];
                    } else {
                        col2--;
                    }
                }
            } else {
                row2--;
            }
        }
        return anotherMatrix;
    }
}
