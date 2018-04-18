package com.epam.homework;

import java.util.*;

public class Task5 {

    private static List<String> listOfWords;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = Integer.valueOf(scanner.nextLine());
        int count = 0;
        int glassCounter = 0;
        int soglassCounter = 0;
        boolean flag = false;
        String input = scanner.nextLine();
        listOfWords = new ArrayList<>(Arrays.asList(input.split(" ")));
        for (String a : listOfWords) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if (((c >= 'a')&&(c <= 'z')) || ((c >= 'A')&&(c <= 'Z'))) {
                    flag = true;
                    c = Character.toLowerCase(c);
                    switch (c) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                        case 'y': glassCounter++;
                            break;
                        default: soglassCounter++;
                    }
                } else {
                    flag = false;
                }
            }
            if (flag && glassCounter == soglassCounter) {
                count++;
            }
        }
        System.out.println(count);
    }

}
