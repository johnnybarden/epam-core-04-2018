package com.epam.homework;

import java.util.Scanner;

public class Task2 {

    /**
     * Ввести N строк с консоли.
     * Упорядочить и вывести строки в порядке возрастания значений их длины.
     * В случае, если длины строк совпадают - упорядочить их в лексикографическом порядке.
     *
     * Формат входных данных:
     * N (целое число, 0 < N < 100) - количество доступных для чтения строк
     * Строка_1
     * Строка_2
     * ...
     * Строка_N
     *
     * Формат выходных данных:
     * В результате выполнения в выходной поток должны быть выведены N строк следующего вида:
     * (длина строки): строка наименьшей длины
     * (длина строки): строка большей длины
     * (длина строки): строка большей длины
     * ...
     * (длина строки): строка наибольшей длины
     *
     * ----------------------------------------------------------------------------------------------
     * Пример выполнения задания:
     *
     * Входные данные:
     * 4
     * Тихо струится река серебристая
     * В царстве вечернем зеленой весны.
     * Солнце садится за горы лесистые.
     * Рог золотой выплывает луны.
     *
     * Выходные данные:
     * (27): Рог золотой выплывает луны.
     * (30): Тихо струится река серебристая
     * (32): Солнце садится за горы лесистые.
     * (33): В царстве вечернем зеленой весны.
     */

    private static void swapStringsInArray(String[] arrayOfStrings, int j) {
        String temp;

        temp = arrayOfStrings[j];
        arrayOfStrings[j] = arrayOfStrings[j + 1];
        arrayOfStrings[j + 1] = temp;
    }

    public static void main(String[] args) {
        int N;

        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        in.nextLine();

        if (N <= 0 || N >= 100) {
            throw new IllegalArgumentException("N should be more than 0 and less than 100");
        }

        String[] arrayOfStrings = new String[N];

        for (int i = 0; i < N; i++) {
            arrayOfStrings[i] = in.nextLine();
        }

        boolean stringsSwapped;

        do {
            stringsSwapped = false;

            for (int j = 0; j < N - 1; j++) {
                if (arrayOfStrings[j].length() > arrayOfStrings[j + 1].length()) {

                    swapStringsInArray(arrayOfStrings, j);
                    stringsSwapped = true;
                } else if (arrayOfStrings[j].length() == arrayOfStrings[j + 1].length()){
                    
                    if (arrayOfStrings[j].compareTo(arrayOfStrings[j + 1]) > 0) {
                        swapStringsInArray(arrayOfStrings, j);
                    }
                }
            }
        } while (stringsSwapped == true);

        for (String current : arrayOfStrings){
            System.out.println("(" + current.length() + "): " + current);
        }
    }
}
