package com.epam.homework;

import java.util.Scanner;

public class Task5 {

    /**
     * Ввести N слов с консоли.
     * Найти количество слов, содержащих только символы латинского алфавита, а среди них – количество слов с равным числом гласных и согласных букв.
     *
     * Формат входных данных:
     * N (целое число) - количество слов в строке
     * Строка, содержащая указанное количество слов, разделенных пробелами
     *
     * Формат выходных данных:
     * В результате выполнения в выходной поток должно быть выведено количество слов, состоящих только из символов латинского алфавита
     * и содержащих равное количество гласных и согласных букв.
     * Количество различных вхождений одной буквы в слове учитывается.
     *
     * ---------------------------------------------------------------------------------------------------
     * Пример выполнения задания:
     *
     * Входные данные:
     * 5
     * Язык программирования Java is widespread
     *
     * Выходные данные:
     * 2
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = Integer.parseInt( scanner.next() );
        int numWords = 0;
        int numConsonants = 0;
        int numVowels = 0;

        for (int i = 0; i < n; i++) {
            String temp = scanner.next();
            numVowels = 0;
            numConsonants = 0;
            if ( temp.matches( "^[a-zA-Z0-9]+$" ) && (temp.length() % 2 == 0) ) {
                for (int j = 0; j < temp.length(); j++) {
                    if ( Character.toString( temp.charAt( j ) ).matches( "(?i:[aeiouy]).*" ) ) {
                        numConsonants++;
                    } else if ( Character.toString( temp.charAt( j ) ).matches( "(?i:[bcdfghjklmnpqrstvwxz]).*" ) ) {
                        numVowels++;
                    } else {
                        break;
                    }
                }
                if ( numVowels == numConsonants ) {
                    numWords++;
                }
            }
        }
        System.out.println( numWords );
    }
}
