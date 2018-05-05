package com.epam.homework;

import java.util.Scanner;

public class Task13 {

    /**
     * Ввести матрицу с консоли.
     * Выполнить циклический сдвиг матрицы на k позиций:
     * k > 0 - сдвиг матрицы вниз
     * k < 0 - сдвиг матрицы вверх
     * k = 0 - матрица остается без изменений
     * <a href="https://github.com/elefus/epam-core-04-2018/wiki/Представление-матриц">Представление матриц</a>
     *
     * Формат входных данных:
     * N - целое число (0 < N < 10)
     * N ^ 2 целых чисел (Integer.MIN_VALUE < element < Integer.MAX_VALUE)
     * k - целое число (0 <= k <= 100)
     *
     * Формат выходных данных:
     * Матрица после выполнения преобразования
     *
     * ---------------------------------------------------------------------------------------------------
     * Примеры выполнения задания:
     *
     * Входные данные:
     * 3
     * 4   2   3
     * 1   0  -3
     * 0  -1   2
     * -2
     *
     * Выходные данные:
     * 3
     * 0  -1   2
     * 4   2   3
     * 1   0  -3
     *
     *
     *
     * Входные данные:
     * 3
     * 4   2   3
     * 1   0  -3
     * 0  -1   2
     * 0
     *
     * Выходные данные:
     * 3
     * 4   2   3
     * 1   0  -3
     * 0  -1   2
     */
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            int dimension = reader.nextInt();
            int[][] matrix = readMatrix(reader, dimension);
            int shiftNumber = reader.nextInt();

            printMatrix(shiftMatrix(matrix, shiftNumber));
        }
    }

    static int[][] readMatrix(Scanner reader, int dimension) {
        int[][] matrix = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = reader.nextInt();
            }
        }

        return matrix;
    }

    static int[][] shiftMatrix(int[][] matrix, int shiftNumber) {
        if (shiftNumber == 0) {
            return matrix;
        }

        int[][] shiftedMatrix = new int[matrix.length][matrix.length];

        shiftNumber %= matrix.length;
        int startCopyPosition = shiftNumber < 0 ? -shiftNumber : matrix.length - shiftNumber;

        System.arraycopy(matrix, startCopyPosition, shiftedMatrix, 0, matrix.length - startCopyPosition);
        System.arraycopy(matrix, 0, shiftedMatrix, matrix.length - startCopyPosition, startCopyPosition);

        return shiftedMatrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row: matrix) {
            for (int el: row) {
                System.out.format("%4d", el);
            }
            System.out.println();
        }
    }
}
