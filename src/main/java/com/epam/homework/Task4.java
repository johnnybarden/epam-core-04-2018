package com.epam.homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Stream;

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
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int minLen = Integer.MAX_VALUE;
        String targetWord = "";
        int num = Integer.parseInt(in.nextLine());
        HashSet<String> words = new HashSet<>();
        String[] A = in.nextLine().split("\\s+");
        for (String a:A) {
            words.add(a);
        }
        for (String word : A) {
            HashSet<Character> chars = new HashSet<>();
            for (char c:word.toCharArray()) {
                chars.add(c);
            }
            if(chars.size()<minLen){
                minLen = chars.size();
                targetWord = word;
            }
        }

        System.out.println(targetWord);
    }
}
