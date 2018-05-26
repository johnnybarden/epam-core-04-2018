package com.epam.homework;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task14 {

    /**
     * Найти количество элементов самой длинной строго возрастающей подпоследовательности.
     * Оператор отношения можно определить на множестве, включающем более одного элемента.
     * <a href="https://ru.wikipedia.org/wiki/Монотонная_последовательность">Строго возрастающая последовательность</a>
     *
     * Формат входных данных:
     * N (целое число) - количество элементов исходной последовательности (0 < N < 100).
     * N целых чисел - элементы последовательности.
     *
     * Формат выходных данных:
     * Число, отображающее количество элементов на самом большом возрастающем участке последовательности.
     *
     * ---------------------------------------------------------------------------------------------------
     * Примеры выполнения задания:
     *
     * Входные данные:
     * 8
     * 2 1 3 3 4 5 6 5
     *
     * Выходные данные:
     * 4
     *
     *
     *
     * Входные данные:
     * 6
     * 6 5 4 3 2 1
     *
     * Выходные данные:
     * 0
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        List<Integer> input = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            input.add(Integer.parseInt(sc.next()));
        }

        System.out.println(getMaxSequence(input));
    }

    private static int getMaxSequence(List<Integer> list) {

        int tmp = 1;
        int result = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) > list.get(i)) {
                tmp++;
            } else if (tmp > result) {
                result = tmp;
                tmp = 1;
            }
        }
        if (tmp > result) {
            result = tmp;
        }
        if (result == 1) {
            result--;
        }
        return result;
    }
}
