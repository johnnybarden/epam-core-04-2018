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
        Scanner in = new Scanner(System.in);
        in.nextInt();
        in.nextLine();

        String inputString = in.nextLine();
        System.out.println(getCountWordsWithSameNumVowelsAndConsonants(inputString));
    }

    private static Integer getCountWordsWithSameNumVowelsAndConsonants(String inputString) {
        String[] wordsArr = inputString.split(" ");
        Integer countWordsWithSameNumVowelsAndConsonants = 0;

        nextWord:
        for (String currentWord : wordsArr) {
            StringBuilder word = new StringBuilder(currentWord);
            Integer countVowel = 0;
            Integer countConsonant = 0;

            for (int i = 0; i < word.length(); i++) {
                if (!((word.charAt(i) >= 65 && word.charAt(i) <= 90)
                        || ((word.charAt(i) >= 97 && word.charAt(i) <= 122)))) {
                    continue nextWord;
                } else {
                    if (("" + word.charAt(i)).matches("^[aeiouAEIOU]$")) {
                        countVowel++;
                    } else {
                        countConsonant++;
                    }
                }
            }

            if (countConsonant.equals(countVowel))
                countWordsWithSameNumVowelsAndConsonants++;
        }
        return countWordsWithSameNumVowelsAndConsonants;
    }
}
