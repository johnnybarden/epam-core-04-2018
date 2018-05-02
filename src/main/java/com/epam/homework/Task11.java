package com.epam.homework;

import java.util.Scanner;

public class Task11 {

    /**
     * Ввести число с консоли.
     * С использованием рекурсии вычислить сумму цифр, из которых составлено указанное число.
     *
     * Формат входных данных:
     * value - целое число, лежащее в диапазоне [Integer.MIN_VALUE, Integer.MAX_VALUE]
     *
     * Формат выходных данных:
     * sum - сумма цифр, составляющих исходное число
     *
     * ---------------------------------------------------------------------------------------------------
     * Примеры выполнения задания:
     *
     * Входные данные:
     * 25593
     *
     * Выходные данные:
     * 24
     *
     *
     * Входные данные:
     * -50
     *
     * Выходные данные:
     * 5
     */

    public static int addUpDigitsInNumber(int number) {
        return recursiveAddUpDigitsInNumber(number, 0);
    }

    private static int recursiveAddUpDigitsInNumber(int number, int sum) {
        int remainder = number % 10;
        sum += remainder;
        number /= 10;

        return (number == 0) ? sum : recursiveAddUpDigitsInNumber(number, sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int value = Integer.parseInt(in.nextLine());
        int sum = addUpDigitsInNumber(value);

        System.out.println(sum);
    }
}
