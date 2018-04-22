package com.epam.homework;

import java.util.Scanner;

public class Task6 {

    /**
     * Ввести N слов с консоли.
     * Найти слово, буквы в котором идут в строгом порядке возрастания их кодов: word.charAt(i) < word.charAt(i + 1).
     * Если таких слов несколько, найти первое из них.
     * Слова состоящие из одного символа не учитывать.
     * <p>
     * Формат входных данных:
     * N (целое число, 0 < N < 100) - количество слов в строке
     * Строка, содержащая нимимум N слов, разделенных пробелами
     * <p>
     * Формат выходных данных:
     * В результате выполнения в выходной поток должно быть выведено слово, удовлетворяющее условию.
     * Если подходящее слово не найдено в выходной поток выводится строка "NOT FOUND"
     * <p>
     * ---------------------------------------------------------------------------------------------------
     * Примеры выполнения задания:
     * <p>
     * Входные данные:
     * 12
     * The original and reference implementation Java compilers were originally released by Sun
     * <p>
     * Выходные данные:
     * by
     * <p>
     * ===================================================================================================
     * <p>
     * Входные данные:
     * 4
     * Кто-то позвонил в дверь
     * <p>
     * Выходные данные:
     * NOT FOUND
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordsCount = scanner.nextInt();
        String result = "NOT FOUND";
        boolean flag = true;
        int wordCounter = 0;

        while (wordsCount-- > 0) {
            String currentWord = scanner.next();
            if (currentWord.length() > 1) {
                for (int i = 1; i < currentWord.length(); i++) {
                    if (currentWord.charAt(i - 1) > currentWord.charAt(i)) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }
            }
            if (flag && wordCounter < 1) {
                result = currentWord;
                wordCounter++;
            }
        }
        System.out.println(result);
    }
}
