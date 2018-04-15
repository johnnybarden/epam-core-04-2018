package com.epam.homework;

import java.util.Scanner;

public class Task4 {

    /**
     * Ввести с консоли N слов, состоящих из символов английского алфавита.
     * Найти слово, в котором число различных символов минимально.
     * Символы верхнего и нижнего регистра считать различными.
     * Если таких слов несколько, найти первое из них.
     * <p>
     * Формат входных данных:
     * N (целое число) - количество слов в строке
     * Строка, содержащая указанное количество слов, разделенных пробелами
     * <p>
     * Формат выходных данных:
     * В результате выполнения в выходной поток должно быть выведено слово, содержащее наименьшее число различных символов.
     * <p>
     * -------------------------------------------------------------------------------------------
     * Пример выполнения задания:
     * <p>
     * Входные данные:
     * 4
     * Cake is a lie
     * <p>
     * Выходные данные:
     * a
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        in.nextLine();

        String inputString = in.nextLine();

        System.out.println(getWordWithMinUniqueLetters(inputString));
    }

    private static String getWordWithMinUniqueLetters(String inputString) {

        String wordWithMinimalNumDiffLetters = "";
        String[] wordsArr = inputString.split(" ");
        Integer countMinUniqueChar = Integer.MAX_VALUE;

        for (int i = 0; i < wordsArr.length; i++) {
            StringBuilder word = new StringBuilder(wordsArr[i]);
            StringBuffer uniqueChar = new StringBuffer();

            for (int j = 0; j < wordsArr[i].length(); j++) {
                if (!uniqueChar.toString().contains("" + word.charAt(j))) {
                    uniqueChar.append(word.charAt(j));
                }
            }

            if (countMinUniqueChar > uniqueChar.length()) {
                countMinUniqueChar = uniqueChar.length();
                wordWithMinimalNumDiffLetters = word.toString();
            }
        }
        return wordWithMinimalNumDiffLetters;
    }
}
