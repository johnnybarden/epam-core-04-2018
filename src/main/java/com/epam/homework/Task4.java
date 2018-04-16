package com.epam.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

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
4
Cake is a lie
     *
     * Выходные данные:
     * a
     */
    public static void main(String[] args) {
        // TODO реализация
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int lineNum = Integer.parseInt(br.readLine());
            List<String> lines = Arrays.asList(br.readLine().split(" "));
            int min = Integer.MAX_VALUE;
            String wordWithMinimalNumDiffLetters = "";
            for (int i = 0; i < lines.size(); i++) {
                int lineSize = lines.get(i).chars().mapToObj(e->(char)e)
                        .collect(Collectors.toSet())
                        .size();
                if(min > lineSize) {
                    wordWithMinimalNumDiffLetters = lines.get(i);
                    min = lineSize;
                }
            }
            System.out.println(wordWithMinimalNumDiffLetters);

        } catch (NumberFormatException | IOException e){
            e.printStackTrace();
        }
        // TODO System.out.println(wordWithMinimalNumDiffLetters);
    }
}
