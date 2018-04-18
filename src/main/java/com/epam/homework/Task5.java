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
        if (counter == listOfWords.size()) {
            for (String a : listOfWords) {
                a = a.toLowerCase();
                for (int i = 0; i < a.length(); i++) {
                    char c = a.charAt(i);
                    if (((c >= 'a') && (c <= 'z'))) {
                        flag = true;
                        switch (c) {
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                            case 'y':
                                glassCounter++;
                                break;
                            default:
                                soglassCounter++;
                        }
                    } else {
                        flag = false;
                        glassCounter = 0;
                        soglassCounter = 0;
                        break;
                    }
                }
                if (flag && (glassCounter == soglassCounter)) {
                    count++;
                }
                glassCounter = 0;
                soglassCounter = 0;
            }
        }
        System.out.println(count);
    }

}
