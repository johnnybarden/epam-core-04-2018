package com.epam.homework;

import java.util.*;

public class Task2 {

    /**
     * Ввести N строк с консоли.
     * Упорядочить и вывести строки в порядке возрастания значений их длины.
     * В случае, если длины строк совпадают - упорядочить их в лексикографическом порядке.
     * <p>
     * Формат входных данных:
     * N (целое число, 0 < N < 100) - количество доступных для чтения строк
     * Строка_1
     * Строка_2
     * ...
     * Строка_N
     * <p>
     * Формат выходных данных:
     * В результате выполнения в выходной поток должны быть выведены N строк следующего вида:
     * (длина строки): строка наименьшей длины
     * (длина строки): строка большей длины
     * (длина строки): строка большей длины
     * ...
     * (длина строки): строка наибольшей длины
     * <p>
     * ----------------------------------------------------------------------------------------------
     * Пример выполнения задания:
     * <p>
     * Входные данные:
     * 4
     * Тихо струится река серебристая
     * В царстве вечернем зеленой весны.
     * Солнце садится за горы лесистые.
     * Рог золотой выплывает луны.
     * <p>
     * Выходные данные:
     * (27): Рог золотой выплывает луны.
     * (30): Тихо струится река серебристая
     * (32): Солнце садится за горы лесистые.
     * (33): В царстве вечернем зеленой весны.
     */
    public static void main(String[] args) {
        // TODO реализация

        // TODO foreach($current : $result) {
        // TODO     System.out.println("(" + current.length() + "): " + current);
        // TODO }

        List<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean isSorted = false;
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String temp = scanner.nextLine();
            stringList.add(i, temp);

        }
        while (!isSorted) {
            isSorted = true;
            String buf;

            for (int x = 0; x < stringList.size() - 1; x++) {
                String xEntry = stringList.get(x);
                String xPlusOneEntry = stringList.get(x + 1);

                if (xEntry.length() > xPlusOneEntry.length()) {
                    isSorted = false;
                    buf = xEntry;
                    stringList.set(x, xPlusOneEntry);
                    stringList.set(x + 1, buf);
                } else if (xEntry.length() == xPlusOneEntry.length()) {
                    int compareDiff = xPlusOneEntry.compareTo(xEntry);

                    if (compareDiff > 0) {
                        stringList.set(x, xEntry);
                        stringList.set(x + 1, xPlusOneEntry);
                    } else if (compareDiff < 0) {
                        stringList.set(x, xPlusOneEntry);
                        stringList.set(x + 1, xEntry);
                    }
                }
            }

        }
        for (String current : stringList) {
            System.out.println("(" + current.length() + "): " + current);

        }
    }

}




