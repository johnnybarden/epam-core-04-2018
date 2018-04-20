package com.epam.homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        Scanner scanner = new Scanner(System.in);
        int numberWords = scanner.nextInt();
        String currentWord;
        Set<Character> characters;
        int counter = Integer.MAX_VALUE;
        String wordWithMinimalNumDiffLetters = null;

        while (numberWords-- > 0) {
            currentWord = scanner.next();
            characters = new HashSet<>();
            for (int i = 0; i < currentWord.length(); i++) {
                characters.add(currentWord.charAt(i));
            }
            if (characters.size() < counter) {
                counter = characters.size();
                wordWithMinimalNumDiffLetters = currentWord;
            }
        }
        System.out.println(wordWithMinimalNumDiffLetters);
    }
}
