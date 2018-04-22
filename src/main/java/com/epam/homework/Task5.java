package com.epam.homework;

import java.util.*;

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
     * В результате выполнения в выходной поток должно быть выведено количество слов, состоящих только из символов латинского алфавита и содержащих равное количество гласных и согласных букв.
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
        int minLen = Integer.MAX_VALUE;

        final Set<Character> vowel       = new HashSet(Arrays.asList('a', 'e' ,'i', 'o', 'u', 'y', 'A', 'E' ,'I', 'O', 'U', 'Y'));
        final Set<Character> agreeable   = new HashSet(Arrays.asList('B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P',
                'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z',
                'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'));

        int counter=0;

        String targetWord = "";

        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        HashSet<String> words = new HashSet<>(Arrays.asList(in.nextLine().split("\\s+")));

        for (String word:words) {
            int vowels = 0;
            int agreeables = 0;
            boolean onlyLatin = true;
            for(Character c: word.toCharArray()){
                if(vowel.contains(c)) vowels++;
                else if(agreeable.contains(c)) agreeables++;
                else onlyLatin=false;
            }
            if(onlyLatin){
                if (vowels==agreeables) counter++;
            }

        }

        System.out.println(counter);

    }
}
