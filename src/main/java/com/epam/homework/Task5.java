package com.epam.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Task5 {

    /**
     * Ввести N слов с консоли.
     * Найти количество слов, содержащих только символы латинского алфавита, а среди них – количество слов с равным числом гласных и согласных букв.
     *
     * Формат входных данных:
     * N (целое число) - количество слов в строке
     * Строка, содержащая указанное количество слов, разделенных пробелами
     *
     * Формат выходных данных:
     * В результате выполнения в выходной поток должно быть выведено количество слов, состоящих только из символов латинского алфавита и содержащих равное количество гласных и согласных букв.
     * Количество различных вхождений одной буквы в слове учитывается.
     *
     * ---------------------------------------------------------------------------------------------------
     * Пример выполнения задания:
     *
     * Входные данные:
     * 5
     * Язык программирования Java is widespread
     *
     * Выходные данные:
     * 2
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int lineNum = Integer.parseInt(br.readLine());
            List<String> lines = Arrays.asList(br.readLine().toLowerCase().split(" "));
            Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y'));
            Set<Character> consonant = new HashSet<>(Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
                    'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'));

            lines.stream().filter(l -> {
                Set<Character> lineSet = l.chars().mapToObj(e->(char)e)
                        .collect(Collectors.toSet());
                int vowelSize = intersection(lineSet, vowels).size();
                int consonantSize = lineSet.size() - vowelSize;
                if (vowelSize == consonantSize && vowelSize != 0) {
                    return true;
                }
                return false;
            }).forEach(System.out::println);

        } catch (NumberFormatException | IOException e){
            e.printStackTrace();
        }
    }
    public static <T> Set<T> intersection(Set<T> setA, Set<T> setB) {
        Set<T> tmp = new HashSet<>();
        for (T x : setA)
            if (setB.contains(x))
                tmp.add(x);
        return tmp;
    }
}
