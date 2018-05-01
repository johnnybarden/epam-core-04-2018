package com.epam.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Matrix{

    private int[][] matrix;

    Matrix(int matrixSize) {
        matrix = new int[matrixSize][matrixSize];
    }

    void setMatrix(Scanner in) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
    }

    void printMatrix() {
        for (int[] column : matrix) {
            for (int row : column) {
                System.out.printf("%-4d", row);
            }
            System.out.println();
        }
    }

    void sortMatrixInTheOrderOfTheKthColumn(int numbOfCol) {
        Arrays.sort(matrix, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[numbOfCol], o2[numbOfCol]);
            }
        });
    }

}
