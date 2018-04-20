package com.epam.homework;

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
        Scanner scanner = new Scanner(System.in);
        int numberWords = scanner.nextInt();
        String currentWord;
        String subString;
        int difference;
        int countWordsWithSameNumVowelsAndConsonants = 0;

        while (numberWords-- > 0) {
            currentWord = scanner.next();
            if (currentWord.matches("[a-zA-Z]+")) {
                subString = currentWord.replaceAll("(?i:[aeiouy])", "");
                difference = currentWord.length() - subString.length();
                if (difference == subString.length()) {
                    countWordsWithSameNumVowelsAndConsonants = ++countWordsWithSameNumVowelsAndConsonants;
                }
            }
        }
        System.out.println(countWordsWithSameNumVowelsAndConsonants);
    }
}
