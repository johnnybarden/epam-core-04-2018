package com.epam.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {

    /**
     * Ввести N слов с консоли.
     * Найти слово, буквы в котором идут в строгом порядке возрастания их кодов: word.charAt(i) < word.charAt(i + 1).
     * Если таких слов несколько, найти первое из них.
     * Слова состоящие из одного символа не учитывать.
     *
     * Формат входных данных:
     * N (целое число, 0 < N < 100) - количество слов в строке
     * Строка, содержащая нимимум N слов, разделенных пробелами
     *
     * Формат выходных данных:
     * В результате выполнения в выходной поток должно быть выведено слово, удовлетворяющее условию.
     * Если подходящее слово не найдено в выходной поток выводится строка "NOT FOUND"
     *
     * ---------------------------------------------------------------------------------------------------
     * Примеры выполнения задания:
     *
     * Входные данные:
     * 12
     * The original and reference implementation Java compilers were originally released by Sun
     *
     * Выходные данные:
     * by
     *
     * ===================================================================================================
     *
     * Входные данные:
     * 4
     * Кто-то позвонил в дверь
     *
     * Выходные данные:
     * NOT FOUND
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String[] inputWords = reader.readLine().split(" ");
        String result = "NOT FOUND";

        for (int i = 0; i < n; i++) {
            if ((inputWords[i].length() > 1) && isCharCodesIncreaes(inputWords[i])) {
                result = inputWords[i];
                break;
            }
        }

        System.out.println(result);

    }

    private static boolean isCharCodesIncreaes(String string) {
        for (int i = 0; i < string.length()-1; i++) {
            if (string.charAt(i) >= string.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
