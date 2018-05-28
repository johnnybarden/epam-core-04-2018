package com.epam.homework;

import java.util.Scanner;

public class Task15 {

    /**
     * Найти сумму элементов матрицы, расположенных между первым и вторым положительными значениями в каждой строке.
     * В случае, если в строке нет двух положительных элементов - сумма от этой строки полагается равной нулю.
     * Сумма между двумя рядом расположенными элементами также равна нулю.
     * <a href="https://github.com/elefus/epam-core-04-2018/wiki/Представление-матриц">Представление матриц</a>
     *
     * Формат входных данных:
     * N - целое число (0 < N < 10)
     * N ^ 2 целых чисел (Integer.MIN_VALUE < element < Integer.MAX_VALUE)
     *
     * Формат выходных данных:
     * Целое число, представляющее вычисленную сумму
     *
     * ---------------------------------------------------------------------------------------------------
     * Пример выполнения задания:
     *
     * Входные данные:
     *  3
     *  1   0   3
     * -1   2   2
     *  1  -1   3
     *
     * Выходные данные:
     * -1
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] myMatrix = readMatrix(sc);
        int result = 0;

        for (int[] aMyMatrix : myMatrix) {
            result += getRowSum(aMyMatrix);
        }

        System.out.println(result);
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

    private static int getRowSum(int[] arr) {

        int sum = 0;
        int pos1 = 0;
        int pos2 = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos1 = i;
                break;
            }
        }
        for (++i; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos2 = i;
                break;
            }
        }
        if (pos2 - pos1 == 1) {
            return 0;
        }
        for (i = ++pos1; i < pos2; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
