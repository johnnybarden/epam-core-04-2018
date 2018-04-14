package com.epam.homework;

import java.util.Scanner;

public class Task4 {

    /**
     * Ввести с консоли N слов, состоящих из символов английского алфавита.
     * Найти слово, в котором число различных символов минимально.
     * Символы верхнего и нижнего регистра считать различными.
     * Если таких слов несколько, найти первое из них.
     *
     * Формат входных данных:
     * N (целое число) - количество слов в строке
     * Строка, содержащая указанное количество слов, разделенных пробелами
     *
     * Формат выходных данных:
     * В результате выполнения в выходной поток должно быть выведено слово, содержащее наименьшее число различных символов.
     *
     * -------------------------------------------------------------------------------------------
     * Пример выполнения задания:
     *
     * Входные данные:
     * 4
     * Cake is a lie
     *
     * Выходные данные:
     * a
     */

    private static int countNumDiffLetters (String word) {
        char[] allLettersInWord = word.toCharArray();
        char[] uniqueLettersInWord = new char[word.length()];
        boolean isUnique;

        uniqueLettersInWord[0] = allLettersInWord[0];

        int index = 1;
        int j;

        for (int i = 1; i < allLettersInWord.length; i++) {
            isUnique = true;
            j = 0;

            while (j < uniqueLettersInWord.length && isUnique && uniqueLettersInWord[j] != '\u0000') {
                if (allLettersInWord[i] == uniqueLettersInWord[j]) {
                    isUnique = false;
                }

                j++;
            }

            if (isUnique) {
                uniqueLettersInWord[index++] = allLettersInWord[i];
            }
        }

        System.out.println(index);
        return index ;
    }

    public static void main(String[] args) {
        int N;
        String wordWithMinimalNumDiffLetters;
        int minimalNumDiffLetters;

        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        in.nextLine();

        wordWithMinimalNumDiffLetters = in.next();
        minimalNumDiffLetters = countNumDiffLetters(wordWithMinimalNumDiffLetters);

        String tempWord;
        int numOfDiffLetters;

        for (int i = 1; i < N; i++) {
            tempWord = in.next();
            numOfDiffLetters = countNumDiffLetters(tempWord);

            if (numOfDiffLetters < minimalNumDiffLetters) {
                wordWithMinimalNumDiffLetters = tempWord;
                minimalNumDiffLetters = numOfDiffLetters;
            }
        }

        System.out.println(wordWithMinimalNumDiffLetters);
    }
}
