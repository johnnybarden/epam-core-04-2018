package com.epam.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task5 {

    /**
     * Ввести N слов с консоли.
     * Найти количество слов, содержащих только символы латинского алфавита, а среди них – количество слов с равным числом гласных и согласных букв.
     * <p>
     * Формат входных данных:
     * N (целое число) - количество слов в строке
     * Строка, содержащая указанное количество слов, разделенных пробелами
     * <p>
     * Формат выходных данных:
     * В результате выполнения в выходной поток должно быть выведено количество слов, состоящих только из символов латинского алфавита и содержащих равное количество гласных и согласных букв.
     * Количество различных вхождений одной буквы в слове учитывается.
     * <p>
     * ---------------------------------------------------------------------------------------------------
     * Пример выполнения задания:
     * <p>
     * Входные данные:
     * 5
     * Язык программирования Java is widespread
     * <p>
     * Выходные данные:
     * 2
     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        List<String> words = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            words.add(sc.next());

        }

        int vowelsAndConsonantsAreEqual = 0;

        for (String word : words) {
            if (word.matches("(?i:[a-z])+") && charsComparison(word)) {
                vowelsAndConsonantsAreEqual++;

            }

        }

        System.out.println(vowelsAndConsonantsAreEqual);

    }


    private static boolean charsComparison(String str) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).matches("(?i:[aeiouy])+")) {
                vowels++;

            } else consonants++;

        }

        return (vowels == consonants);

    }

}