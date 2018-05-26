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

        Scanner sc = new Scanner(System.in);
        int dim = sc.nextInt();
        int[][] matrix = readMatrix(sc, dim);
        int k = sc.nextInt();

        moveMatrix(matrix, k);
    }

    private static int[][] readMatrix(Scanner scanner, int dimension) {

        int[][] matrix = new int[dimension][dimension];
        for (int row = 0; row < dimension; ++row) {
            for (int col = 0; col < dimension; ++col) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static void moveMatrix(int[][] matrix, int stepSize) {

        System.out.println(matrix.length);
        int i = 0;
        while (i < matrix.length) {
            int rowToPrint = (matrix.length + i - stepSize) % matrix.length;
            int j = 0;
            while (j < matrix.length) {
                System.out.print(matrix[rowToPrint][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}