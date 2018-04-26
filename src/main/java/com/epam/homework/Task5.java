package com.epam.homework;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        int count = 0;

        Scanner scanner = new Scanner(System.in);

        int wordsCount = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < wordsCount; i++) {

            String word = scanner.next();

            int countV = 0;
            int countS = 0;

            for (char c : word.toLowerCase().toCharArray()) {

                if (c < 'a' || c > 'z'){
                    break;
                }
                switch (c) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'y':
                        countV++;
                        break;
                    default:
                        countS++;
                }
            }
            if (countV == countS) {
                count++;
            }
        }
        System.out.println(count);
    }

}
