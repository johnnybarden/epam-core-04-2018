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
        Integer numbsOfWords = in.nextInt();
        in.nextLine();

        String[] words = new String[numbsOfWords];

        for (int i = 0; i < numbsOfWords; i++) {
            words[i] = in.next();
        }


        System.out.println(getCountWordsWithSameNumVowelsAndConsonants(words));
    }

    private static Integer getCountWordsWithSameNumVowelsAndConsonants(String[] words) {

        Integer countWordsWithSameNumVowelsAndConsonants = 0;

        nextWord:
        for (String currentWord : words) {
            Integer countVowel = 0;
            Integer countConsonant = 0;

            for (int i = 0; i < currentWord.length(); i++) {
                if (!((currentWord.charAt(i) >= 'A' && currentWord.charAt(i) <= 'Z')
                        || ((currentWord.charAt(i) >= 'a' && currentWord.charAt(i) <= 'z')))) {
                    continue nextWord;
                } else {
                    if ((String.valueOf(currentWord.charAt(i))).matches("^[aeiouyYAEIOU]$")) {
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
