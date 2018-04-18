package com.epam.homework;

import java.util.Arrays;
import java.util.Comparator;
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
    public static void main(String[] args) {
        String[] lines;

        try (Scanner sc = new Scanner(System.in)){
            int count = Integer.valueOf(sc.nextLine());
            lines = new String[count];

            for (int i = 0; i < count; i++) {
                lines[i] = sc.nextLine();
            }
        }

        Arrays.sort(lines, new MyStringComparator());

        for (String line: lines) {
            System.out.println("(" + line.length() + "): " + line);
        }
    }
}

class MyStringComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        int compareByLength = Integer.compare(str1.length(), str2.length());

        return compareByLength != 0 ?
                compareByLength :
                str1.compareTo(str2);
    }
}
